//一般直接写开头
layui.use([ 'layer', 'form' ], function() {
	var layer = layui.layer, form = layui.form();

	// 新增
	$("#btn_add").on("click", function() {
		USER.add();
	});
	// 修改
	$("#btn_edit").on("click", function() {
		USER.edit();
	});
	
	// 充值
	$("#btn_addMoney").on("click", function() {
		USER.addMoney();
	});
});

$(document).ready(
		function() {
			// 初始化表格
			var table = $("#example").dataTable(
					{
						language : CONSTANT.language, // 提示信息
						autoWidth : false, // 禁用自动调整列宽
						stripeClasses : [ "odd", "even" ], // 为奇偶行加上样式，兼容不支持CSS伪类的场合
						serverSide : true, // 启用服务器端分页
						searching : false, // 禁用原生搜索
						autoWidth : true,//自动计算宽度
						order : [], // 取消默认排序查询,否则复选框一列会出现小箭头
						renderer : "bootstrap", // 渲染样式：Bootstrap和jquery-ui
						pagingType : "simple_numbers", // 分页样式
						"dom" : '<"top"i>rt<"bottom"flp><"clear">',
						columnDefs : [ {
							"targets" : 'nosort', // 列的样式名
							"orderable" : false
						// 包含上样式名‘nosort’的禁止排序
						} ],
						"columns" : [
								{
									"sClass" : "text-center",
									"data" : "id",
									"render" : function(data, type, full, meta) {
										return '<input type="checkbox" name="checkItem" class="checkbox"  value="' + data + '" />';
									},
									"bSortable" : false
								},
								{
									"mDataProp" : "id"
								},
								{
									"mDataProp" : "userName"
								},
								{
									"mDataProp" : "loginName"
								},
								{
									"mDataProp" : "loginIp"
								},
								{
									"mDataProp" : "phone"
								},
								{
									"mDataProp" : "mobilephone"
								},
								{
									"mDataProp" : "email"
								},
								{
									"mDataProp" : function(obj) {
										return convetDate(obj.createDate);
									}
								},
								{
									"mDataProp" : function(obj) {
										return convetDate(obj.lastLoginDate);
									}
								}
						// /这里设置返回的集合与html里的列对应
						],
						 "drawCallback": function( settings ) {
							 //复选框事件触发
							 USER.initTableCheckbox();
					      },
						ajax : function(data, callback, settings) {
							// 封装请求参数
							var param = USER.getQueryCondition(data);
							// console.log(param);
							// ajax请求数据
							$.ajax({
								type : "GET",
								url : rootPath + "/user/list",
								cache : false, // 禁用缓存
								data : param, // 传入组装的参数
								dataType : "json",
								success : function(result) {
									// console.log(result);
									// setTimeout仅为测试延迟效果
									setTimeout(function() {
										// 封装返回数据
										var returnData = {};
										returnData.draw = data.draw;// 这里直接自行返回了draw计数器,应该由后台返回
										returnData.recordsTotal = result.recordsTotal;// 返回数据全部记录
										returnData.recordsFiltered = result.recordsFiltered;// 后台不实现过滤功能，每次查询均视作全部结果
										returnData.data = result.data;// 返回的数据列表
										// console.log(returnData);
										// 调用DataTables提供的callback方法，代表数据已封装完成并传回DataTables进行渲染
										// 此时的数据需确保正确无误，异常判断应在执行此回调前自行处理完毕
										callback(returnData);
									}, 200);
								}
							});
						}
					}).api();
			// 此处需调用api()方法,否则返回的是JQuery对象而不是DataTables的API对象

			$('#example tbody').on('click', 'tr.group', function() {
				var currentOrder = table.order()[0];
				if (currentOrder[0] === 2 && currentOrder[1] === 'asc') {
					table.order([ 2, 'desc' ]).draw();
				} else {
					table.order([ 2, 'asc' ]).draw();
				}
			});

		});

// 通过用户编号，删除数据信息
function del_data(id) {
	Modal.confirm({
		msg : "您确定删除编号为" + id + "的用户信息吗？"
	}).on(function(e) {
		if (e) {
			$.ajax({
				type : "POST",
				url : rootPath + "/user/delete/" + id,
				dataType : "json",
				success : function(result) {
					Modal.alert({
						msg : result.msg,
						title : '操作提示',
						btnok : '确定',
						btncl : '取消'
					});
				}
			});
		}
	});

};
/** 时间转换 */
function convetDate(time) {
	var oDate = new Date(time);
	var oYear = oDate.getFullYear();
	var oMonth = oDate.getMonth() + 1;
	var oDay = oDate.getDate();
	var oHour = oDate.getHours();
	var oMin = oDate.getMinutes();
	var oSen = oDate.getSeconds();
	var oTime = oYear + '-' + oMonth + '-' + oDay + ' ' + oHour + ':' + oMin + ':' + oSen;// 最后拼接时间
	return oTime;
};

function ok_click() {
	window.location.reload();
};

// 用户管理
var USER = {
	add : function() { // 新增
		location.href = rootPath + "/user/add";
	},
	edit : function() { // 修改
		var ids = E9NET.getSelectionsIds();// 选择id
		if (ids == "") {
			layer.alert("请选择需要修改的记录!");
			return;
		}
		if (ids.split(",").length > 1) {
			layer.alert("只能选择一条记录，请重新选择!");
			return;
		}
		;
		window.location.href = rootPath + "/user/edit/" + ids;
	},
	getQueryCondition : function(data) { // 查询参数组装
		var param = {};
		// 组装排序参数
		if (data.order && data.order.length && data.order[0]) {
			switch (data.order[0].column) {
			case 0:
				param.orderColumn = "id";// 数据库列名称
				break;
			case 1:
				param.orderColumn = "USER_NAME";// 数据库列名称
				break;
			case 2:
				param.orderColumn = "LOGIN_NAME";// 数据库列名称
				break;
			case 3:
				param.orderColumn = "loginIp";// 数据库列名称
				break;
			case 4:
				param.orderColumn = "PHONE";// 数据库列名称
				break;
			case 5:
				param.orderColumn = "mobilephone";// 数据库列名称
				break;
			default:
				param.orderColumn = "EMAIL";// 数据库列名称
				break;
			}
			// 排序方式asc或者desc
			param.orderDir = data.order[0].dir;
		}
		param.userName = $("#userName").val();//用户名
		param.company = $("#company").val();// 公司
		param.status = $("#status").val();// 状态
		param.phone = $("#phone").val();// 手机号
		param.balance = $("#balance").val();//余额

		// 组装分页参数
		param.limit = data.length;// 页面显示记录条数，在页面显示每页显示多少项的时候
		param.start = data.start;// 开始的记录序号
		param.page = (data.start / data.length) + 1;// 当前页码
		return param;
	},
	initTableCheckbox :function () { //复选框选择
	    var $thr = $('table thead tr'); 
	    /*“全选/反选”复选框*/ 
	    var $checkAll = $thr.find('input'); 
	    $checkAll.click(function(event){ 
	        /*将所有行的选中状态设成全选框的选中状态*/ 
	        $tbr.find('input').prop('checked',$(this).prop('checked')); 
	        /*并调整所有选中行的CSS样式*/ 
	        if ($(this).prop('checked')) { 
	            $tbr.find('input').parent().parent().addClass('selected'); 
	        } else{ 
	            $tbr.find('input').parent().parent().removeClass('selected'); 
	        } 
	        /*阻止向上冒泡，以防再次触发点击操作*/ 
	        event.stopPropagation(); 
	    }); 
	    /*点击全选框所在单元格时也触发全选框的点击操作*/ 
	    $("#checkAll").click(function(){ 
	        $(this).find('input').click(); 
	    }); 
	    var $tbr = $('table tbody tr'); 
	    /*点击每一行的选中复选框时*/ 
	    $tbr.find('input').click(function(event){ 
	        /*调整选中行的CSS样式*/ 
	        $(this).parent().parent().toggleClass('selected'); 
	        /*如果已经被选中行的行数等于表格的数据行数，将全选框设为选中状态，否则设为未选中状态*/ 
	        $checkAll.prop('checked',$tbr.find('input:checked').length == $tbr.length ? true : false); 
	        /*阻止向上冒泡，以防再次触发点击操作*/ 
	        event.stopPropagation(); 
	    }); 
	    /*点击每一行时也触发该行的选中操作*/ 
	    $tbr.click(function(){ 
	        $(this).find('input').click(); 
	    }); 
	},
	addMoney :function (){//充值
		var ids = E9NET.getSelectionsIds();// 选择id
		if (ids == "") {
			layer.alert("请选择需要的记录!");
			return;
		}
		if (ids.split(",").length > 1) {
			layer.alert("只能选择一条记录，请重新选择!");
			return;
		}
		window.location.href = rootPath + "/user/addMoney/" + ids;
	}
};
