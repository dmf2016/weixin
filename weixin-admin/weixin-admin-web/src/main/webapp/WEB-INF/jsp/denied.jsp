<%@ page contentType="text/html; charset=utf-8"%>
<%@ include file="/WEB-INF/jsp/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
  <head>
  <meta charset="utf-8">
<%@ include file="/WEB-INF/jsp/common/head.jsp"%>
  <title>云信平台-没权限</title>
  <style type="text/css">
    body{background: #F5F5F5;}
  </style>
  </head>
  <body>
    <div class="error-pages">
        <img src="/img/404.png" alt="404" class="icon" width="400" height="260">
        <h1>你没权限操作此功能，请联系管理员！</h1>
        <form>
          <input type="text" class="form-control" placeholder="Search for Page">
          <i class="fa fa-search"></i>
        </form>
        <div class="bottom-links">
          <a href="/index.html" class="btn btn-default">返回</a>
          <a href="/index.html" class="btn btn-light">跳转到首页</a>
        </div>
    </div>
</body>
</html>