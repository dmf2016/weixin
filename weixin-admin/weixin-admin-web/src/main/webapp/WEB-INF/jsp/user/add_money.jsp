<%@ page contentType="text/html; charset=utf-8"%>
<%@ include file="/WEB-INF/jsp/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="/WEB-INF/jsp/common/head.jsp"%>
<title>用户充值</title>
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
				<li class="active">用户充值</li>
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
								<label for="input002" class="col-sm-2 control-label form-label">用户名：</label>
								<div class="col-sm-10"><p class="form-control-static">${user.userName}</p>
								</div>
							</div>
							<div class="form-group">
								<label for="input001"
									class="col-sm-2 control-label form-label">公司名：</label>
								<div class="col-sm-10">
									
								</div>
							</div>
							<div class="form-group">
								<label for="input001"
									class="col-sm-2 control-label form-label">余额：</label>
								<div class="col-sm-10">
									 <p class="form-control-static">800</p>
								</div>
							</div>
							<div class="form-group">
								<label for="input2" class="col-sm-2 control-label form-label">充值金额：<em style="color: red;">*</em></label>
								<div class="col-sm-10">
									<input type="text" class="form-control" id="loginName" name="loginName" required >
								</div>
							</div>
							<div class="form-group">
								<label for="input2" class="col-sm-2 control-label form-label">充值后金额：</label>
								<div class="col-sm-10" >
								 <p class="form-control-static">810</p>
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-2 control-label form-label">备注</label>
								<div class="col-sm-10">
									<textarea class="form-control" rows="3" 
										id="remark" name="remark"></textarea>
								</div>
							</div>
							<div class="form-group">
                                <div align="center" class="col-sm-10 col-sm-offset-2">
                                    <button type="submit" id="showtop" class="btn btn-default "
                                        name="save" value="Sign up">提交</button>
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