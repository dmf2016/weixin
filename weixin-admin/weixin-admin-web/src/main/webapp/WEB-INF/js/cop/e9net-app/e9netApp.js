//一般直接写开头
layui.use(['layer', 'form'], function(){
  var layer = layui.layer
  ,form = layui.form();
  //layer.msg('Hello World');
});

//验证
$( document ).ready( function () {
	$( "#e9netAppForm" ).validate( {
		rules: {
			appName: {
				required: true,
				maxlength: 100
			},
			remarks: {
				maxlength: 300
			},
			smsType: {
				required: true			}
		},
		messages: {
			appName: {
				required: "应用名称不能为空！",
				maxlength: "应用名称不能超过100个字符！"
			},
			remarks: {
				maxlength: "备注不能超过300个字 符！"
			},
			smsType: {
				required: "请选择短信类型码！"
			}
		},
		errorElement: "em",
		errorPlacement: function ( error, element ) {
			// Add the `help-block` class to the error element
			error.addClass( "help-block" );
			if ( element.prop( "type" ) == "checkbox" ) {
				$("#smsType_error").html(error);
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
	                			window.location.href=rootPath+"/e9netApp/e9netAppListUI.html";
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
		window.location.href=rootPath+"/e9netApp/e9netAppListUI.html";
    });
    
    //关闭窗体
    $(".closed-tool").click(function(){
		window.location.href=rootPath+"/e9netApp/e9netAppListUI.html";
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

