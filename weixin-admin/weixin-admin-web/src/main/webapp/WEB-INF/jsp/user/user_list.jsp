<%@ page contentType="text/html; charset=utf-8"%>
<%@ include file="/WEB-INF/jsp/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<%@ include file="/WEB-INF/jsp/common/head.jsp"%>
<title>用户管理</title>
</head>
<body>
<!-- Start Page Loading -->
<div class="loading">
	<img src="${ctx}/img/loading.gif" alt="loading-img">
</div>
<!-- End Page Loading -->
<!-- START TOP -->
<%@ include file="/WEB-INF/jsp/common/top.jsp"%>
<!-- END TOP -->
<!-- START SIDEBAR -->
<%@ include file="/WEB-INF/jsp/common/left.jsp"%>
<!-- END SIDEBAR -->
<!-- START CONTENT -->
<div class="content">
<!-- Start Page Header -->
<div class="page-header">
	<input type="hidden" id="module_fid" value="1">
	<input type="hidden" id="module_id" value="2">
	<ol class="breadcrumb">
		<li><a href="${ctx}/index.html">控制台</a></li>
		<li><a href="${ctx}/user/userListUI.html">用户管理</a></li>
		<li class="active">用户列表</li>
	</ol>
</div>
<!--用戶信息列表-->
<div class="container-padding">
 <!-- Start Row -->
  <div class="row">
    <div class="col-md-12 condition">
      <div class="panel panel-default">
		<form class="form-inline" role="form" action="/user/list" >
		<div class="row">
				<div class="form-group">
				  <label class=" control-label form-label" for="userName">用户名：</label>
				  <input type="email" class="form-control" name="userName" id="userName"  placeholder="请输入你的用户名">
				</div>
				<div class="form-group">
				  <label class=" control-label form-label" for="company">公司名：</label>
				  <input type="email" class="form-control" name="company" id="company" placeholder="请输入你的公司名">
				</div>
	        <div class="form-group">
	          <label class=" control-label form-label">用户状态：</label>
	            <select class="selectpicker" name="status" id="status" >
	                <option>全部</option>
	                <option>未审核</option>
	                <option>审核中</option>
	                <option>审核通过</option>
	                <option>审核不通过</option>
	                 <option>停用</option>
	              </select>                  
	        </div>
		</div>
		<div class="clearfix" style="margin-bottom: 10px;"></div><!-- 清除浮动 -->  
		 <div class="row" >
				<div class="form-group">
				  <label class=" control-label form-label" for="phone">手机号：</label>
				  <input type="email" class="form-control" name="phone" id="phone" placeholder="请输入你的手机号">
				</div>
				<div class="form-group">
				  <label class=" control-label form-label" for="balance">余额：</label>
				  <input type="email" class="form-control" id="balance" placeholder="请输入你的余额">
				</div>
				<button type="button" class="btn btn-default" id="btn_search">查询</button>
			</div>
         </form>
      <div class="clear"></div></div>
    </div>
  </div>
  <!-- End Row -->
	<!-- Start Row -->
	<div class="row">
		<!-- Start Panel -->
		<div class="col-md-12">
			<div class="panel panel-default">
				<div class="panel-heading">
					<button type="button" class="btn btn-default" id="btn_add">添加用户</button>
					<button type="button" class="btn btn-default" id="btn_edit">修改</button>
					<button type="button" class="btn btn-default" id="btn_stop">停用</button>
					<button type="button" class="btn btn-default" id="btn_resume">恢复</button>
					<button type="button" class="btn btn-default" id="btn_del">删除</button>
					<button type="button" class="btn btn-default" id="btn_addApp">创建应用</button>
					<button type="button" class="btn btn-default" id="btn_addMoney">充值</button>
					<button type="button" class="btn btn-default" id="btn_audit_on">审核通过</button>
					<button type="button" class="btn btn-default" id="btn_audit_off">审核不通过</button>
				</div>
				<div class="panel-body table-responsive ">
					<table id="example" class="table table-hover ">
						<thead>
							<tr>
							   <th class="text-center">
							   <div class="checkbox margin-t-0">
							      <input id="checkAll" type="checkbox"><label for="checkAll"></label>
							   </div></th>
								<th>编号</th>
								<th>用户名</th>
								<th>登陆用户</th>
								<th>登陆IP</th>
								<th>手机号码</th>
								<th>电话号码</th>
								<th>邮箱</th>
								<th>创建时间</th>
								<th>上次登录时间</th>
							</tr>
						</thead>
						<tbody>
						</tbody>
					</table>
				</div>
			</div>
		</div>
		<!-- End Panel -->
	</div>
	<!-- End Row -->
</div>
<!-- END CONTAINER -->
<!-- //////////////////////////////////////////////////////////////////////////// -->
<!-- Start Footer -->
<%@ include file="/WEB-INF/jsp/common/footer.jsp"%>
<!-- End Footer -->
</div>
<%@ include file="/WEB-INF/jsp/common/common_js.jsp"%>
<script src="${ctx}/js/cop/user/modal.js"></script>
<script src="${ctx}/js/cop/user/user_list.js"></script>
</body>
</html>