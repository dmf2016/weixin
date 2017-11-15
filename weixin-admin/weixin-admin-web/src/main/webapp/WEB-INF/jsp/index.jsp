<%@ page contentType="text/html; charset=utf-8"%>
<%@ include file="/WEB-INF/jsp/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
  <head>
  <meta charset="utf-8">
<%@ include file="/WEB-INF/jsp/common/head.jsp"%>
  <title>后台管理平台</title>
  </head>
  <body>
  <!-- Start Page Loading -->
  <div class="loading"><img src="${ctx}/img/loading.gif" alt="loading-img"></div>
  <!-- End Page Loading -->
  <!-- START TOP -->
  <%@ include file="/WEB-INF/jsp/common/top.jsp"  %>
  <!-- END TOP -->
  <%@ include file="/WEB-INF/jsp/common/left.jsp" %>
<!-- START CONTENT -->
<div class="content">
  <!-- Start Page Header -->
  <div class="page-header">
    <h1 class="title"></h1>
      <ol class="breadcrumb">
        <li class="active"></li>
    </ol>
    <!-- Start Page Header Right Div 
    <div class="right">
      <div class="btn-group" role="group" aria-label="...">
        <a href="/index.html" class="btn btn-light">控制台</a>
        <a href="#" class="btn btn-light"><i class="fa fa-refresh"></i></a>
        <a href="#" class="btn btn-light"><i class="fa fa-search"></i></a>
        <a href="#" class="btn btn-light" id="topstats"><i class="fa fa-line-chart"></i></a>
      </div>
    </div> -->
    <!-- End Page Header Right Div -->
  </div>
  <!-- End Page Header -->
<!-- START CONTAINER -->
<div class="container-default">
<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
</div>
<!-- END CONTAINER -->
<!-- Start Footer -->
<%@ include file="/WEB-INF/jsp/common/footer.jsp"%>
<!-- End Footer -->
</div>
<%@ include file="/WEB-INF/jsp/common/common_js.jsp"%>
<script src="${ctx}/js/cop/index.js"></script>
</body>
</html>