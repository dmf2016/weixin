
<%@ page contentType="text/html; charset=utf-8" language="java"
	import="java.sql.*" errorPage=""%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="/WEB-INF/jsp/common/head.jsp"%>

<style type="text/css">
	.error {
		font-style: normal;
		font-weight: bold;
	}
</style>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description"
	content="Kode is a Premium Bootstrap Admin Template, It's responsive, clean coded and mobile friendly">
<meta name="keywords"
	content="bootstrap, admin, dashboard, flat admin template, responsive," />
<title>用户管理</title>

<!-- ========== Css Files ========== -->
<link href="../../css/root.css" rel="stylesheet">

</head>
<body>
	<!-- Start Page Loading -->
	<div class="loading">
		<img src="../../img/loading.gif" alt="loading-img">
	</div>
	<!-- End Page Loading -->
	<!-- //////////////////////////////////////////////////////////////////////////// -->
	<!-- START TOP -->
	<%@ include file="../common/top.jsp"%>
	<!-- END TOP -->
	<!-- //////////////////////////////////////////////////////////////////////////// -->

	<!-- //////////////////////////////////////////////////////////////////////////// -->
	<!-- START SIDEBAR -->
	<%@ include file="../common/left.jsp"%>
	<!-- END SIDEBAR -->
	<!-- //////////////////////////////////////////////////////////////////////////// -->

	<!-- //////////////////////////////////////////////////////////////////////////// -->
	<!-- START CONTENT -->
	<div class="content">

		<!-- Start Page Header -->
		<div class="page-header">
			<h1 class="title">用户管理</h1>
			<ol class="breadcrumb">
				<li><a href="${ctx}/index.html">控制台</a></li>
				<li><a href="${ctx}/user/userListUI.html">用户管理</a></li>
				<li><a href="${ctx}/user/userListUI.html">用户列表</a></li>
				<li class="active">编辑用户信息</li>
			</ol>

			<!-- Start Page Header Right Div -->
			<div class="right">
				<div class="btn-group" role="group" aria-label="...">
					<a href="index.html" class="btn btn-light">控制台</a> <a href="#"
						class="btn btn-light"><i class="fa fa-refresh"></i></a> <a
						href="#" class="btn btn-light"><i class="fa fa-search"></i></a> <a
						href="#" class="btn btn-light" id="topstats"><i
						class="fa fa-line-chart"></i></a>
				</div>
			</div>
			<!-- End Page Header Right Div -->

		</div>

		<%@ include file="modal.jsp"%>

		<!-- system modal end -->


		<!--用戶信息列表-->
		<div class="container-padding">
			<!-- Start Row -->
			<div class="row">

				<!-- Start Panel -->
				<div class="col-md-12">
					<div class="panel panel-default">
						<div class="panel-title">编辑用户信息</div>
						<div class="panel-body table-responsive">
							<div class="panel-body">
								<form class="form-horizontal" action="/user/save" method="post"
									name="userForm" id="userForm">

									<div class="form-group">
										<label class="col-sm-2 control-label form-label"></label>
										<div class="col-sm-5">
												<input type="hidden" id="id" name="id">
										</div>
									</div>

									<div class="form-group">
										<label for="input002"
											class="col-sm-2 control-label form-label">用户名称<em
											style="color: red;">*</em></label>
										<div class="col-sm-5">
											<input type="text" class="form-control form-control-radius"
												id="userName" name="userName"> <span
												class="help-block"></span>
										</div>
									</div>

									<div class="form-group">
										<label for="input001"
											class="col-sm-2 control-label form-label">用户类型</label>
										<div class="col-sm-5">
											<select class="form-control form-control-radius"
												id="userType" name="userType">
												<option value="0">后台用户</option>
												<option value="1">前台用户</option>
											</select> <span class="help-block"></span>
										</div>
									</div>

									<div class="form-group">
										<label for="input2" class="col-sm-2 control-label form-label">登录名称<em
											style="color: red;">*</em></label>
										<div class="col-sm-5">
											<input type="text" class="form-control form-control-radius"
												id="loginName" name="loginName" required="required">
											<span class="help-block"></span>

										</div>
									</div>

									<div class="form-group">
										<label for="input3" class="col-sm-2 control-label form-label">登录密码<em
											style="color: red;">*</em></label>
										<div class="col-sm-5">
											<input type="password"
												class="form-control form-control-radius" id="loginPass"
												name="loginPass"> <span class="help-block"></span>
										</div>
									</div>
									<div class="form-group">
										<label for="input3" class="col-sm-2 control-label form-label">确认登录密码<em
											style="color: red;">*</em></label>
										<div class="col-sm-5">
											<input type="password"
												class="form-control form-control-radius"
												id="confirm_loginPass" name="confirm_loginPass"> <span
												class="help-block"></span>
										</div>
									</div>
									<div class="form-group">
										<label for="input4" class="col-sm-2 control-label form-label">登录IP</label>
										<div class="col-sm-5">
											<input type="text" class="form-control form-control-radius"
												id="loginIp" name="loginIp"> <span
												class="help-block"></span>

										</div>
									</div>

									<div class="form-group">
										<label for="input5" class="col-sm-2 control-label form-label">电话号码</label>
										<div class="col-sm-5">
											<input type="text" class="form-control form-control-radius"
												id="mobilephone" name="mobilephone"> <span
												class="help-block"></span>

										</div>
									</div>

									<div class="form-group">
										<label for="input6" class="col-sm-2 control-label form-label">手机号码</label>
										<div class="col-sm-5">
											<input type="text" class="form-control form-control-radius"
												id="phone" name="phone"> <span class="help-block"></span>
										</div>
									</div>
									<div class="form-group">
										<label for="input7" class="col-sm-2 control-label form-label">邮箱</label>
										<div class="col-sm-5">
											<input type="text" class="form-control form-control-radius"
												id="email" name="email"> <span class="help-block"></span>

										</div>
									</div>

									<div class="form-group">
										<label class="col-sm-2 control-label form-label">备注</label>
										<div class="col-sm-5">
											<textarea class="form-control" rows="3" id="textarea1"
												id="remark" name="remark"></textarea>
										</div>
									</div>
									<!--0代表系统默认用户表，1代表系统新建 -->
									<div class="form-group" id="isDefault_div_id">
										<label for="input9" class="col-sm-2 control-label form-label"></label>
										<div class="col-sm-5">
											<input type="hidden" class="form-control form-control-radius"
												id="isDefault" name="isDefault"> <span
												class="help-block"></span>
										</div>
									</div>
									<!--上级操作影响顺列 -->
									<div class="form-group" id="operateSerial_div_id">
										<label for="input9" class="col-sm-2 control-label form-label"></label>
										<div class="col-sm-5">
											<input type="hidden" class="form-control form-control-radius"
												id="operateSerial" name="operateSerial"> <span
												class="help-block"></span>
										</div>
									</div>


									<!--加密盐 -->
									<div class="form-group" id="credentialsSalt_div_id">
										<label for="input9" class="col-sm-2 control-label form-label"></label>
										<div class="col-sm-5">
											<input type="hidden" class="form-control form-control-radius"
												id="credentialsSalt" name="credentialsSalt"> <span
												class="help-block"></span>
										</div>
									</div>

									<div class="form-group">
										<div class="col-sm-5 col-sm-offset-3">
											<button type="submit" class="btn btn-default">保存</button>
											<button type="button" class="btn btn-white" id="close_id"
												data-dismiss="modal">关闭</button>
										</div>
									</div>
								</form>
							</div>
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
		<%@ include file="../common/footer.jsp"%>
		<!-- End Footer -->
	</div>
	<%@ include file="/WEB-INF/jsp/common/common_js.jsp"%>
	<script src="../../js/cop/user/modal.js"></script>
	<script src="../../js/cop/user/user.js"></script>
	<script type="text/javascript">
		$(function() {
			//编辑加载数据信息
			$("#id").val('${user.id }');
			$("#userType").val('${user.userType }');
			$("#userName").val('${user.userName }');
			$("#loginName").val('${user.loginName }');
			$("#loginPass").val('${user.loginPass }');
			$("#confirm_loginPass").val('${user.loginPass }');
			$("#loginIp").val('${user.loginIp }');
			$("#mobilephone").val('${user.mobilephone }');
			$("#phone").val('${user.phone }');
			$("#email").val('${user.email }');
			$("#remark").val('${user.remark }');
			$("#isDefault").val('${user.isDefault }');
			$("#operateSerial").val('${user.operateSerial }');
			$("#credentialsSalt").val('${user.credentialsSalt }');
		});
	</script>
</body>
</html>