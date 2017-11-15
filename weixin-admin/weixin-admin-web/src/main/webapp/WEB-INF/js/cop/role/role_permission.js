//一般直接写开头
layui.use(['layer', 'form'], function(){
  var layer = layui.layer
  ,form = layui.form();
});


var setting = {
	check : {
		enable : true
	},
	data : {
		simpleData : {
			enable : true
		}
	}
};


$(document).ready(function() {
	var zNodes_value = $('#zNodes_value').val();
	var zNodes = eval("(" + zNodes_value + ")"); // 转换为json对象
	$.fn.zTree.init($("#permissionTree"), setting, zNodes);
	
    $("#btn_save").click(function() {
		var treeObj = $.fn.zTree.getZTreeObj("permissionTree"),
		nodes = treeObj.getCheckedNodes(true), 
		v = "";
		if(nodes.length==0){
			layer.msg("请选择权限", {icon: 5,offset: '60px',time: 1000}); 
			return;
		}
		for (var i = 0; i < nodes.length; i++) {
			var parentNode=nodes[i].getParentNode();
			v += nodes[i].id + ",";		
			v += nodes[i].pId + ",";
			v += parentNode.pId+";";
			// alert(nodes[i].id); //获取选中节点的值
		}
		
        $.post(rootPath+"/role/rolePermission/save", 
        		{
					checkedNode : v,
					roleId : $("#role_id").val()
				}, 
				function(data, status) {					
					if (data == "0"){					 
						layer.msg(data.msg, {icon: 1,offset: '60px',time: 1000}, function(){
                			window.location.href=rootPath+"/role/roleListUI.html";
                		}); 
					}
					else{					
					    //toastr.error("保存失败","",toastrStyleReset());
						layer.msg(data.msg, {icon: 2,offset: '60px',time: 1000}); 
				    }					
				});
		});
    
	$("#btn_back").click(function(){
		history.go(-1);
	});
	
});

