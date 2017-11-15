<%@ page contentType="text/html; charset=utf-8"%>
<%@ include file="/WEB-INF/jsp/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
  <head>
  <meta charset="utf-8">
  <%@ include file="/WEB-INF/jsp/common/head.jsp"%>
  <title>登录</title>
  <style type="text/css">
    body{background: #F5F5F5;}
  </style>
  </head>
  <body>
    <div class="login-form">
      <form id="loginform" name="loginform" action="/login.html" method="post" onsubmit="return false;" >
        <input type="hidden" name="errorMsg" id="errorMsg" value="${error}" >
        <div class="top">
          <img src="${ctx}/img/kode-icon.png" alt="icon" class="icon">
          <h1>云信平台</h1>
        </div>
        <div class="form-area">
          <div class="group">
            <input type="text" name="loginName" id="loginName" class="form-control" placeholder="登录名">
            <i class="fa fa-user"></i>
          </div>
          <div class="group">
            <input name="loginPass" id="loginPass" type="password" class="form-control" placeholder="密码">
            <i class="fa fa-key"></i>
          </div>
           <div class="group">
            <input id="captcha" name="captcha" type="text" class="form-control" 
              placeholder="验证码" style="width:60%;float:left;" />
			<img id="kaptchaImage" src="${ctx}/captcha.html" style="cursor:pointer; margin-left:10px;" title="点击更换"/> 
          </div>
          <div class="checkbox checkbox-primary">
          <input type="hidden" id="rememberMe" name="rememberMe" value="false"/>
            <input id="rememberMeCheckBox" name="rememberMeCheckBox" type="checkbox" >
            <label for="rememberMeCheckBox">记住密码</label>
          </div>
          <input type="button" class="btn btn-default btn-block" id="btnLongin"  value="登录" />
        </div>
      </form>
      <div class="footer-links row">
        <div class="col-xs-6"><a href="#"><i class="fa fa-external-link"></i>立即注册</a></div>
        <div class="col-xs-6 text-right"><a href="#"><i class="fa fa-lock"></i>忘记密码</a></div>
      </div>
    </div>
	<!-- End Content -->
	<%@ include file="/WEB-INF/jsp/common/common_js.jsp"%>
	<script src="${ctx}/js/cop/login.js"></script>
</body>
</html>