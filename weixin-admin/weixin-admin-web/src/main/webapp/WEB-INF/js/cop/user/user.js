//一般直接写开头
layui.use(['layer', 'form'], function(){
  var layer = layui.layer
  ,form = layui.form();
  //layer.msg('Hello World');
});


$(document).ready(function() {
    // 在键盘按下并释放及提交后验证提交表单
    var validate = $("#userForm").validate({
		    rules: {
		    	userName: {
		        required: true,
		        rangelength:[0,150]
		      },
		      loginPass: {
		        required: true,
		        rangelength:[6,150]
		      },
		      confirm_loginPass:{
                  equalTo:'#loginPass' //表示和id="spass"的值相同
              },
		      loginName: {
			        required: true,
			        rangelength:[0,150]
		      },
		      email:{
                  email:true
              },
              mobilephone:{
            	  isMobile:true
              },
              phone:{
            	  isPhone:true
              }
		    },
		    messages: {
		    	userName: {
		        required: "请输入用户名！",
		    	rangelength: $.validator.format( "用户名在{0} 至 {1} 的字节之间." )
		      },
		      loginPass: {
		        required: "请输入密碼！",
		    	rangelength: $.validator.format( "用户密码在{0} 至 {1} 的字节之间." )
		    	},
		    	confirm_loginPass: {
                    equalTo:"两次密码输入不一致"
		    	},
		      loginName: {
		        required: "请输入登录名！",
		    	rangelength: $.validator.format( "登录名称在{0} 至 {1} 的字节之间." )
		      },
		      email: {
                    email:"E-Mail格式不正确"
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
	            			window.location.href=rootPath+"/user/userListUI.html";
	            		}); 
					} else {
						layer.msg(data.msg, {icon: 2,offset: '60px',time: 1000}); 
					}
	              }
	           }); 
	        },
			success: function(element) {
		          $(element).remove();				
			}
		});
    
    
    // 手机号码验证    
    jQuery.validator.addMethod("isPhone", function(value, element) {    
      var length = value.length;    
      return this.optional(element) || (length == 11 && /^(((13[0-9]{1})|(15[0-9]{1})|(18[0-9]{1}))+\d{8})$/.test(value));    
    }, "请正确填写您的手机号码。");

    // 电话号码验证    
    jQuery.validator.addMethod("isMobile", function(value, element) {    
      var tel = /^(\d{3,4}-?)?\d{7,9}$/g;    
      return this.optional(element) || (tel.test(value));    
    }, "请正确填写您的电话号码。");
    
    
    	// 清空表单中的数据信息
    $("#close_id").click(function(){
    	validate.resetForm();
    	history.go(-1);
    });
    
    // 关闭窗体
    $("#clock_win_id").click(function(){
    	$("#close_id").click();
    	validate.resetForm();
    });

    
} );

function ok_click(){	
	history.go(-1);
};


