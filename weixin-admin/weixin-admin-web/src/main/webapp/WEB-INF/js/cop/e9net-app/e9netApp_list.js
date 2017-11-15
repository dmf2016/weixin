//一般直接写开头
layui.use(['layer', 'form'], function(){
  var layer = layui.layer
  ,form = layui.form();
});

$(document).ready(function() {
	var table = $("#example").dataTable({
       language:CONSTANT.language,  // 提示信息
		stripeClasses : [ "odd", "even" ], // 为奇偶行加上样式，兼容不支持CSS伪类的场合
		serverSide : true, // 启用服务器端分页
		searching : false, // 禁用原生搜索
		// bLengthChange: false, //去掉每页显示多少条数据方法
		pagingType : "simple_numbers", // 分页样式：simple,simple_numbers,full,full_numbers
		"dom": '<"top"i>rt<"bottom"flp><"clear">',
		// 绑定数据
		columns : [
				{
                    "sClass": "td-checkbox",
                    "data": "id",
                    "render": function (data, type, full, meta) {
                             return '<input type="checkbox" name="checkItem" class="checkbox"  value="' + data + '" />';
                     },
                    "bSortable": false
                },
				{
					data : "id",// 字段名
				},
				{
					data : "appName",// 字段名
				},
				{
					data : "userId",// 字段名
				},
				{
					data : "status",// 字段名
					render : function(data, type, row, meta) {
						return (data == 0 ? "上线中" : data == 1 ? "停用" 
								: "删除");
					}
				},
				{
					data : "signCh",// 字段名
				},
				{
					data : "signStatus",// 字段名
					render : function(data, type, row, meta) {
						return (data == 1 ? "未设置" : data == 2 ? "审核中" : data == 3 ? "审核通过"
								: "审核不通过");
					}
				}
				],
				
				 "drawCallback": function( settings ) {
					 //复选框事件触发
					 initTableCheckbox();
			      },
					ajax : function(data, callback, settings) {
						// 封装请求参数
						var param = userManage.getQueryCondition(data);
						$.ajax({
							type : "POST",
							url : rootPath + "/e9netApp/list",
							cache : false, // 禁用缓存
							data : param, // 传入已封装的参数
							dataType : "json",
							success : function(result) {
								// 异常判断与处理
								if (result.errorCode) {
									layer.msg('查询失败！', {icon: 2,offset: '60px'}); 
									return;
								}
								// 封装返回数据
								var returnData = {};
		                        returnData.draw = data.draw;// 这里直接自行返回了draw计数器,应该由后台返回
		                        returnData.recordsTotal = result.recordsTotal;// 返回数据全部记录
		                        returnData.recordsFiltered = result.recordsFiltered;// 后台不实现过滤功能，每次查询均视作全部结果
		                        returnData.data = result.data;// 返回的数据列表
								callback(returnData);
							},
							error : function(XMLHttpRequest, textStatus,
									errorThrown) {
								layer.msg('查询失败！', {icon: 2,offset: '60px'}); 
							}
						});
					}
	  }).api();
	
	// 查询
	$("#btn_search").click(function() {
		table.draw();
	});

	$("#btn_add").on("click",function() {
		// 新增
		window.location.href=rootPath+"/e9netApp/add";
	});
	
	//编辑应用信息
	$("#btn_edit").on("click",function() {
		var ids= getCheckedE9netAppIds();
		if(ids=="")
		{
			layer.alert("请选择需要修改的记录!");
			return;
		}
		if(ids.split(",").length>1)
		{
			layer.alert("只能选择一条记录，请重新选择!");
			return;
		};
		window.location.href=rootPath+"/e9netApp/edit/"+ids;
	});
	
	//删除应用信息
	$("#btn_del").on("click",function() {
		var optMsg="请选择需要删除的记录！";
		var optCfgMsg="您确定删除所选择的记录吗?";
		var optUrl=rootPath+"/e9netApp/delete/";
		/**执行删除操作**/
		statusOpt(optMsg,optCfgMsg,optUrl);
	});

	//停用应用信息
	$("#btn_stop").on("click",function() {
		var optMsg="请选择需要停用的记录！";
		var optCfgMsg="您即将停用所选应用，停用后将无法正常使用此应用的功能，您确定吗？";
		var optUrl=rootPath+"/e9netApp/stop/";
		/**执行停用操作**/
		statusOpt(optMsg,optCfgMsg,optUrl);
	});

	//上线应用信息
	$("#btn_onLine").on("click",function() {
		var optMsg="请选择需要上线的记录！";
		var optCfgMsg="您确定要恢复该应用为上线吗？";
		var optUrl=rootPath+"/e9netApp/go_online/";
		/**执行上线操作**/
		statusOpt(optMsg,optCfgMsg,optUrl);
	});
	
	//修改签名信息
	$("#btn_editSign").on("click",function() {
		//获取所选数据
		var ids= getCheckedE9netAppIds();
		if(ids=="")
		{
			layer.alert("请选择需要修改签名的应用！");
			return;
		}
		if(ids.split(",").length>1)
		{
			layer.alert("只能选择一条记录，请重新选择!");
			return;
		};
		/**重置验证-->start**/
		validator.resetForm();  
		$("#signCh").parent().removeClass( "has-success" ).removeClass( "has-error" );
		$("#remarks").parent().removeClass( "has-success" ).removeClass( "has-error" );
		/**重置验证-->end**/
		$("#signStatus").val(3);//签名状态设置为审核通过
		var selectRow=table.rows('.selected').data()[0];//获取选中的行的数据
		$("#signCh").val(selectRow.signCh);
		$("#remarks").val(selectRow.remarks);
		$("#id").val(ids);//给编号赋值
		//触发单击事件弹出设置签名窗口
		$("#sign_btn").click();
	});

	/**设置签名状态**/
	var validator =$( "#signForm" ).validate( {
		rules: {
			signCh: {
				required: true,
				signCh_v:[2,30],
				sign:true
			},
			remarks: {
				maxlength: 300
			}
		},
		messages: {
			signCh: {
				required: "签名不能为空！",
				signCh_v: "签名必须在2-30个字符之间！"
			},
			remarks: {
				maxlength: "备注不能超过300个字 符！"
			}
		},
		errorElement: "em",
		errorPlacement: function ( error, element ) {
			error.addClass( "help-block" );
			error.appendTo(element.parent());
		},
		//颜色显示
		highlight: function ( element, errorClass, validClass ) {
			$( element ).parent().addClass( "has-error" ).removeClass( "has-success" );
		},
		unhighlight: function (element, errorClass, validClass) {
			$( element ).parent().addClass( "has-success" ).removeClass( "has-error" );
		},
		//提交
		submitHandler:function(form){
	           $(form).ajaxSubmit({
	        	    type: "post", 
	                dataType:"json",
	                success:function(data){
	                	if(data.status==200) {
	                		//触发单击事件
	                		$("#close_sign_win").click();
	                		layer.msg(data.msg, {icon: 1,offset: '60px',time: 1000}, function(){
	                			window.location.href=rootPath+"/e9netApp/e9netAppListUI.html";
	                		}); 
						} else {
							layer.msg(data.msg, {icon: 2,offset: '60px',time: 1000}); 
						}
	                  }
	           }); 
        }    
	} );


	jQuery.validator.addMethod("signCh_v", function(value, element, param) {
		var length = value.length;
		for(var i = 0; i < value.length; i++){
			if(value.charCodeAt(i) > 127){
				length++;
			}
		}
		return this.optional(element) || ( length >= param[0] && length <= param[1] );
		},"请确保输入的值在3-15个字节之间(一个中文字算2个字节)");
	
	// 字符验证
	jQuery.validator.addMethod("sign", function(value, element){
	       var reg = RegExp(/[(\（)(\）) (\))(\()(\｝)(\｛)(\})(\{) (\[)(\])(\【)(\】)]+/);   
	return this.optional(element) ||!reg.test(value);
	}, "无须添加【】、()、[]符号，短信发送会自带!");
	
	
	//短信模板管理（点击按钮，根据应用编号跳转对应的短信模板）
	$("#btn_smsM").on("click",function() {
		var ids= getCheckedE9netAppIds();
		if(ids=="")
		{
			layer.alert("请选择需要编辑的记录!");
			return;
		}
		if(ids.split(",").length>1)
		{
			layer.alert("只能选择一条记录，请重新选择!");
			return;
		};
		window.location.href=rootPath+"/e9netApp/edit_e9netTemplateWin/"+ids;
	});
	
});



// 参数组装
var userManage = {
	getQueryCondition : function(data) {
		var param = {};
		// 组装排序参数
		if (data.order && data.order.length && data.order[0]) {
			switch (data.order[0].column) {
			case 0:
				param.orderColumn = "ID";// 数据库列名称
				break;
			case 1:
				param.orderColumn = "App_name";// 数据库列名称
				break;
			case 2:
				param.orderColumn = "User_id";// 数据库列名称
				break;
			case 3:
				param.orderColumn = "status";// 数据库列名称
				break;
			case 4:
				param.orderColumn = "SIGN_CH";// 数据库列名称
				break;

			default:
				param.orderColumn = "SIGN_STATUS";// 数据库列名称
				break;
			}
			// 排序方式asc或者desc
			param.orderDir = data.order[0].dir;
		}
		// param.id = $("#id-search").val();// 查询条件
		param.appName = $("#name-search").val();// 应用名称
		param.appStutus = $("#status-search").val();// 应用状态
		param.appUser = $("#user-search").val();// 所属用户
	
		// param.status = $("#status-search").val();// 查询条件
		// 组装分页参数
		param.limit = data.length;// 页面显示记录条数，在页面显示每页显示多少项的时候
        param.start = data.start;// 开始的记录序号
        param.page = (data.start / data.length)+1;// 当前页码
		return param;
	}



};


// 获取所选的数据信息
function getCheckedE9netAppIds()
{
	var ids="";
	jQuery("input[name=checkItem]").each(function(){
		if($(this).prop("checked")==true)
		{
			var id=$(this).val();
			if(ids!="")
			{
				ids+=",";
			}
			ids+=id;
		};
	});
	return ids;
}


/*复选框选择*/
function initTableCheckbox() { 
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
};

/**状态操作**/
function statusOpt(optMsg,optCfmMsg,optUrl){
	//获取所选数据
	var ids= getCheckedE9netAppIds();
	if(ids=="")
	{
		layer.alert(optMsg);
		return;
	}
	//eg1
	layer.confirm(optCfmMsg, {icon: 3, title:'提示'}, function(index){
		layer.close(index);
    	  $.ajax({
    	      type: "POST",
    	      url: optUrl+ids,
    	      dataType: "json",
    	      success: function (data) {	  
    	    	  if (data.status==200){
                		layer.msg(data.msg, {icon: 1,time: 1000}, function(){
                			window.location.href=rootPath+"/e9netApp/e9netAppListUI.html";
                		}); 
                	}else{
                		layer.msg(data.msg, {icon: 2,offset: '60px'}); 
                	}
    				
    	      }
    	  });
	});

};



