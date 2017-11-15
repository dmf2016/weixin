<%@ page contentType="text/html; charset=utf-8"%>
<%@ include file="/WEB-INF/jsp/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
  <head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>500</title>
  <style type="text/css">
    body{background: #F5F5F5;}
  </style>
  </head>
  <body>
    <div class="error-pages">
        <img src="${ctx}/img/500.png" alt="500" class="icon" width="400" height="260">
        <h1>Internal server error</h1>
        <h4>Something has gone seriously wrong. Please try later.</h4>
        <div class="bottom-links">
          <a href="/index.html" class="btn btn-default">返回</a>
          <a href="/index.html" class="btn btn-light">跳转到首页</a>
        </div>
</body>
</html>