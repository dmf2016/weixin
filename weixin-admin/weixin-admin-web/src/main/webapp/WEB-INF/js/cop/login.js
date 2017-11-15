//一般直接写开头
layui.use([ 'layer', 'form' ], function() {
	var layer = layui.layer, form = layui.form();
	// 刷新验证码
	$('#kaptchaImage').click(
			function() {// 生成验证码
				$(this).hide().attr('src',
						rootPath+'/captcha.html?' + new Date().getTime()).fadeIn();
			});

	//提交
	$("#btnLongin").click(function(){
		LOGIN.login();
	});
});



document.onkeydown=keyDownSearch;  
   function keyDownSearch(e) {    
       // 兼容FF和IE和Opera    
       var theEvent = e || window.event;    
       var code = theEvent.keyCode || theEvent.which || theEvent.charCode;    
       if (code == 13) {    
           $("#btnLongin").click();  
           return false;    
       }    
       return true;    
 }; 

var LOGIN = {
	checkInput : function() {
		var loginName = $("#loginName").val();
		if (jQuery.isEmptyObject(loginName)) {
			layer.alert('请输入登录名');
			$("#loginName").focus();
			return false;
		}
		var loginPass = $("#loginPass").val();
		if (jQuery.isEmptyObject(loginPass)) {
			layer.alert('请输入密码');
			$("#loginPass").focus();
			return false;
		}
		var captcha = $("#captcha").val();
		if (jQuery.isEmptyObject(captcha)) {
			layer.alert('请输入验证码');
			$("#captcha").focus();
			return false;
		}
		if ($("#rememberMeCheckBox").is(':checked')) {
			$("#rememberMe").val(true);
		}
		return true;
	},
	doLogin : function() {
		 var params = $("#loginform").serialize();
		    $.ajax({
		        url: rootPath+"/login.html",
		        type: "post",
		        data:params,
		        dataType : "json",
		        success: function(data) {
					if (data.status==200) {
						location.href = rootPath+"/index.html";
					} else {
						layer.alert("登录失败，原因是："+data.msg);
						$("#loginName").focus();
					}
		        }
		    });
	},
	login : function() {
		if (this.checkInput()) {
			this.doLogin();
		}
	}
};

