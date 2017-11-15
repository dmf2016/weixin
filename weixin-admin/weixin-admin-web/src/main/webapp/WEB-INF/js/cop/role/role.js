//一般直接写开头
layui.use(['layer', 'form'], function(){
  var layer = layui.layer
  ,form = layui.form();
  //layer.msg('Hello World');
});

//验证
$( document ).ready( function () {
	$( "#roleaddForm" ).validate( {
		rules: {
			roleName: {
				required: true,
				maxlength: 100
			},
			remark: {
				required: true,
				maxlength: 500
			}
		},
		messages: {
			roleName: {
				required: "角色名称不能为空！",
				maxlength: "角色名称不能超过100个字符！"
			},
			remark: {
				required: "备注不能为空！",
				maxlength: "备注不能超过500个字 符！"
			}
		},
		errorElement: "em",
		errorPlacement: function ( error, element ) {
			// Add the `help-block` class to the error element
			error.addClass( "help-block" );

			if ( element.prop( "type" ) == "checkbox" ) {
				error.insertAfter( element.parent( "label" ) );
			} else {
				error.insertAfter( element );
			}
		},
		//颜色显示
		highlight: function ( element, errorClass, validClass ) {
			$( element ).parents( ".col-sm-10" ).addClass( "has-error" ).removeClass( "has-success" );
		},
		unhighlight: function (element, errorClass, validClass) {
			$( element ).parents( ".col-sm-10" ).addClass( "has-success" ).removeClass( "has-error" );
		},
		//提交
		submitHandler:function(form){
           $(form).ajaxSubmit({
        	    type: "post", 
                dataType:"json",
                success:function(data){
            	if(data.status==200) {
					stopBtn();
            		layer.msg(data.msg, {icon: 1,offset: '60px',time: 1000}, function(){
            			window.location.href=rootPath+"/role/roleListUI.html";
            		}); 
				} else {
					layer.msg(data.msg, {icon: 2,offset: '60px',time: 1000}); 
				}
              }
           }); 
        }    
	} );

	// 清空表单中的数据信息
    $("#close_id").click(function(){
		window.location.href=rootPath+"/role/roleListUI.html";
    });
    
    //关闭窗体
    $(".closed-tool").click(function(){
		window.location.href=rootPath+"/role/roleListUI.html";
    });

} );

/*禁止返回与保存按钮*/
function stopBtn(){
	$("#close_id").removeClass("btn-default");
	$("#close_id").addClass("btn-primary");
	$("#close_id").attr("disabled","disabled");
	$("#showtop").removeClass("btn-default");
	$("#showtop").addClass("btn-primary");
	$("#showtop").attr("disabled","disabled");
};

