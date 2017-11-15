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
		pagingType : "simple_numbers", // 分页样式
		"dom": '<"top"i>rt<"bottom"flp><"clear">',
		// 绑定数据
		columns : [
				{
                    "sClass": "text-center",
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
					data : "roleName",// 字段名
				},
				{
					data : "roleType",// 字段名
					render : function(data, type, row, meta) {
						return (data == 0 ? "默认角色" : data == 1 ? "普通角色"
								: "不可用");
					}
				}, {
					data : "status",// 字段名
				}, {
					data : "agentId",// 字段名
				}, {
					data : "remark",// 字段名
				}, {
					data : "createTime",
				}],
				 "drawCallback": function( settings ) {
					 //复选框事件触发
					 initTableCheckbox();
			      },
					ajax : function(data, callback, settings) {
						// 封装请求参数
						var param = userManage.getQueryCondition(data);
						$.ajax({
							type : "POST",
							url : rootPath + "/role/list",
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
		location.href=rootPath+"/role/add";
	});
	
	//编辑角色信息
	$("#btn_edit").on("click",function() {
		var ids= getCheckedRoleIds();
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
		window.location.href=rootPath+"/role/edit/"+ids;
	});
	
	

	//删除角色信息
	$("#btn_del").on("click",function() {
		var ids= getCheckedRoleIds();
		if(ids=="")
		{
			layer.alert("请选择需要删除的记录！");
			return;
		}
		//eg1
		layer.confirm('您确定删除吗?', {icon: 3, title:'提示'}, function(index){
			layer.close(index);
	    	  $.ajax({
	    	      type: "POST",
	    	      url: rootPath+"/role/delete/"+ids,
	    	      dataType: "json",
	    	      success: function (data) {	  
	    	    	  if (data.status==200){
	                		layer.msg(data.msg, {icon: 1,time: 1000}, function(){
	                			window.location.href=rootPath+"/role/roleListUI.html";
	                		}); 
	                	}else{
	                		layer.msg(data.msg, {icon: 2,offset: '60px'}); 
	                	}
	    				
	    	      }
	    	  });
		});

	});
	
	
	
	//分配权限
	$("#btn_right").click(function(){
	    if ($(".checkbox:checked").length == 1){
	        var id = $(".checkbox:checked").val();
		    location.href=rootPath+"/role/rolePermission/"+id;	              
	    }else if ($(".checkbox:checked").length == 0){
	    	layer.alert("请选择一条数据"); 
	    	return;
	    }else{
	    	layer.alert("一次只能修改一条数据"); 
	    	return; 
	    }	
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
				param.orderColumn = "id";// 数据库列名称
				break;
			case 1:
				param.orderColumn = "roleName";// 数据库列名称
				break;
			case 2:
				param.orderColumn = "roleType";// 数据库列名称
				break;
			case 3:
				param.orderColumn = "status";// 数据库列名称
				break;
			case 4:
				param.orderColumn = "agentId";// 数据库列名称
				break;
			case 5:
				param.orderColumn = "remark";// 数据库列名称
				break;
			default:
				param.orderColumn = "createTime";// 数据库列名称
				break;
			}
			// 排序方式asc或者desc
			param.orderDir = data.order[0].dir;
		}
		// param.id = $("#id-search").val();// 查询条件
		param.roleName = $("#name-search").val();// 角色名称
		// param.status = $("#status-search").val();// 查询条件
		// 组装分页参数
		param.limit = data.length;// 页面显示记录条数，在页面显示每页显示多少项的时候
        param.start = data.start;// 开始的记录序号
        param.page = (data.start / data.length)+1;// 当前页码
		return param;
	}
};


// 获取所选的数据信息
function getCheckedRoleIds()
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
};


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



