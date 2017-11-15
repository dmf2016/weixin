<%@ page contentType="text/html; charset=utf-8"%>
<%@ include file="/WEB-INF/jsp/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="/WEB-INF/jsp/common/head.jsp"%>
<title>用户管理</title>
</head>
<body>
<!-- Start Page Loading -->
<div class="loading">
	<img src="${ctx}/img/loading.gif" alt="loading-img">
</div>
<%@ include file="/WEB-INF/jsp/common/top.jsp"%>
<%@ include file="/WEB-INF/jsp/common/left.jsp"%>
<div class="content">
		<!-- Start Page Header -->
		<div class="page-header">
			<ol class="breadcrumb">
				<li><a href="${ctx}/index.html">控制台</a></li>
				<li><a href="${ctx}/user/userListUI.html">用户管理</a></li>
				<li><a href="${ctx}/user/userListUI.html">用户列表</a></li>
				<li class="active">新增用户信息</li>
			</ol>
		</div>
		<!-- START CONTAINER -->
		<div class="container-padding">
			<!-- Start Row -->
			<div class="row">
				<div class="col-md-12">
					<div class="panel panel-default">
						<div class="panel-title">
							基本信息
							<ul class="panel-tools">
								<li><a class="icon minimise-tool"><i
										class="fa fa-minus"></i></a></li>
								<li><a class="icon expand-tool"><i class="fa fa-expand"></i></a></li>
								<li><a class="icon closed-tool"><i class="fa fa-times"></i></a></li>
							</ul>
						</div>
						<div class="panel-body">
                       <form class="form-horizontal" action="${ctx}/user/save" method="post" name="userForm" id="userForm">
                       <input type="hidden" id="id" name="id">
							<div class="form-group">
								<label for="input002"
									class="col-sm-2 control-label form-label">用户名称<em style="color: red;">*</em></label>
								<div class="col-sm-10">
									<input type="text" class="form-control" id="userName" name="userName"> 
										
								</div>
							</div>
							<div class="form-group">
									<label for="input002" class="col-sm-2 control-label form-label">角色名称</label>
									<div class="col-sm-10">
										<input type="text" class="form-control" name="roleName"
											id="roleName" value="" placeholder="角色名称不能为空">
									</div>
								</div>
							
							<div class="form-group">
								<label for="input001"
									class="col-sm-2 control-label form-label">用户类型</label>
								<div class="col-sm-10">
									<select class="form-control"
										id="userType" name="userType">
										<option value="0">后台用户</option>
										<option value="1">前台用户</option>
									</select> 
								</div>
							</div>

							<div class="form-group">
								<label for="input2" class="col-sm-2 control-label form-label">登录名称<em style="color: red;">*</em></label>
								<div class="col-sm-10">
									<input type="text" class="form-control"
										id="loginName" name="loginName" required>
									
								</div>
							</div>

							<div class="form-group">
								<label for="input3" class="col-sm-2 control-label form-label">登录密码<em style="color: red;">*</em></label>
								<div class="col-sm-10">
									<input type="password"
										class="form-control" id="loginPass"
										name="loginPass"> 
								</div>
							</div>
							<div class="form-group">
								<label for="input3" class="col-sm-2 control-label form-label">确认登录密码<em style="color: red;">*</em></label>
								<div class="col-sm-10">
									<input type="password"
										class="form-control" id="confirm_loginPass"
										name="confirm_loginPass"> 
								</div>
							</div>
							<div class="form-group">
								<label for="input4" class="col-sm-2 control-label form-label">登录IP</label>
								<div class="col-sm-10">
									<input type="text" class="form-control"
										id="loginIp" name="loginIp"> <span
										class="help-block"></span>
								</div>
							</div>

							<div class="form-group">
								<label for="input5" class="col-sm-2 control-label form-label">电话号码</label>
								<div class="col-sm-10">
									<input type="text" class="form-control"
										id="mobilephone" name="mobilephone"> <span
										class="help-block"></span>
								</div>
							</div>

							<div class="form-group">
								<label for="input6" class="col-sm-2 control-label form-label">手机号码</label>
								<div class="col-sm-10">
									<input type="text" class="form-control"
										id="phone" name="phone"> 
								</div>
							</div>
							<div class="form-group">
								<label for="input7" class="col-sm-2 control-label form-label">邮箱</label>
								<div class="col-sm-10">
									<input type="text" class="form-control"
										id="email" name="email"> 

								</div>
							</div>

							<div class="form-group">
								<label class="col-sm-2 control-label form-label">备注</label>
								<div class="col-sm-10">
									<textarea class="form-control" rows="3" 
										id="remark" name="remark"></textarea>
								</div>
							</div>
							<!--0代表系统默认用户表，1代表系统新建 -->
							<div class="form-group" id="isDefault_div_id">
								<label for="input9" class="col-sm-2 control-label form-label"></label>
								<div class="col-sm-10">
									<input type="hidden"
										class="form-control" id="isDefault"
										name="isDefault"> 
								</div>
							</div>
							<!--上级操作影响顺列 -->
							<div class="form-group" id="operateSerial_div_id">
								<label for="input9" class="col-sm-2 control-label form-label"></label>
								<div class="col-sm-10">
									<input type="hidden"
										class="form-control" id="operateSerial"
										name="operateSerial"> 
								</div>
							</div>
							
							<!--加密盐 -->
							<div class="form-group" id="credentialsSalt_div_id">
								<label for="input9" class="col-sm-2 control-label form-label"></label>
								<div class="col-sm-10">
									<input type="hidden"
										class="form-control" id="credentialsSalt"
										name="credentialsSalt"> 
								</div>
							</div>

							<div class="form-group">
                                <div align="center" class="col-sm-10 col-sm-offset-2">
                                    <button type="submit" id="showtop" class="btn btn-default "
                                        name="save" value="Sign up">保存</button>
                                    <button type="button" class="btn btn-default" name="back"
                                        value="Sign up" id="close_id">返回</button>
                                </div>
							</div>
						</form>
						</div>
					</div>
				</div>
			</div>
			<!-- End Row -->
		</div>
		<!-- END CONTAINER -->
		<!-- Start Footer -->
		<%@ include file="/WEB-INF/jsp/common/footer.jsp"%>
		<!-- End Footer -->
	</div>
	<!-- End Content -->
<%@ include file="/WEB-INF/jsp/common/common_js.jsp"%>
<script src="${ctx}/js/cop/user/user.js"></script>
</body>
</html>