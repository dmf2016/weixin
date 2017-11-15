<%@ page contentType="text/html; charset=utf-8"%>
<%@ include file="/WEB-INF/jsp/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="/WEB-INF/jsp/common/head.jsp"%>
<title>角色修改</title>
</head>
<body>
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
				<li><a href="${ctx}/role/roleListUI.html">角色管理</a></li>
				<li class="active">角色修改</li>
			</ol>
		</div>
		<!-- End Page Header -->
		<!-- //////////////////////////////////////////////////////////////////////////// -->
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
							<form id="roleaddForm" method="post" class="form-horizontal"
								action="${ctx}/role/edit">
								<div class="form-group">
									<label for="input002" class="col-sm-2 control-label form-label">角色名称</label>
									<div class="col-sm-10">
										<input type="hidden" id="id" name="id"> <input
											type="text" class="form-control" name="roleName"
											id="roleName" placeholder="角色名称不能为空">
									</div>
								</div>

								<div class="form-group">
									<label for="input002" class="col-sm-2 control-label form-label">角色所属</label>
									<div class="col-sm-10">

										<select class="form-control" name="agentId" id="agentId">
											<option value="0">所有</option>
											<option value="1">前台</option>
											<option value="2">后台</option>
										</select>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-2 control-label form-label">备注</label>
									<div class="col-sm-10">
										<textarea class="form-control" rows="3" id="remark"
											name="remark" placeholder="内容不能超过500字符！"></textarea>
									</div>
								</div>

								<div class="form-group">
									<div class="col-sm-10 col-sm-offset-2">
										<button type="submit" id="showtop" class="btn btn-default"
											name="save" value="Sign up">保存</button>
										<button type="button" class="btn btn-default " name="back"
											id="close_id" value="Sign up">返回</button>
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
	<script src="${ctx}/js/cop/role/role.js"></script>
	<script type="text/javascript">
		$(function() {
			//编辑加载数据信息
			$("#agentId").val('${role.agentId }');
			$("#remark").val('${role.remark }');
			$("#roleName").val('${role.roleName }');
			$("#id").val('${role.id }');
		});
	</script>
</body>
</html>