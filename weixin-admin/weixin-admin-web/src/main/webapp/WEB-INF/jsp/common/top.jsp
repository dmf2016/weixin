<%@ page contentType="text/html; charset=utf-8"%>
<%@ include file="/WEB-INF/jsp/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <!-- START TOP -->
  <div id="top" class="clearfix">
    <!-- Start App Logo -->
    <div class="applogo">
      <a href="${ctx}/index.html" class="logo"><img src="${ctx}/img/33e9/logo.png"/></a>
    </div>
    <!-- End App Logo -->
    <!-- Start Sidebar Show Hide Button -->
    <a href="#" class="sidebar-open-button"><i class="fa fa-bars"></i></a>
    <a href="#" class="sidebar-open-button-mobile"><i class="fa fa-bars"></i></a>
    <!-- End Sidebar Show Hide Button -->
    
    <!-- Start Sidepanel Show-Hide Button -->
    <a href="${ctx}/logout.html" class="sidepanel-open-button"><img src="${ctx}/img/33e9/drop_out.png"/></a>
    <!-- End Sidepanel Show-Hide Button -->
    
    <!-- Start Top Right -->
    <ul class="top-right">

    <li class="dropdown link">
      <a href="#" data-toggle="dropdown" class="dropdown-toggle profilebox">
      <b>用户信息</b><span class="caret"></span>
      </a>
        <ul class="dropdown-menu dropdown-menu-list dropdown-menu-right">
          <li role="presentation" class="dropdown-header">基本信息</li>
          <li><a href="#"><i class="fa falist fa-wrench"></i>设置</a></li>
          <li class="divider"></li>
          <li><a href="#"><i class="fa falist fa-lock"></i> 锁屏</a></li>
          <li><a href="/logout.html" ><i class="fa falist fa-power-off"></i> 退出</a></li>
        </ul>
    </li>

    </ul>
    <!-- End Top Right -->
  </div>
  <!-- END TOP -->
