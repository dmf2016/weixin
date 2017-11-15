<%@ page contentType="text/html; charset=utf-8"%>
<%@ include file="/WEB-INF/jsp/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="${ctx}/css/zTree/zTreeStyle/zTreeStyle.css"	type="text/css">
<link rel="stylesheet" href="${ctx}/css/toastr/toastr.min.css"	type="text/css">
<%@ include file="/WEB-INF/jsp/common/head.jsp"%>
<title>角色管理</title>
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
			 <h1 class="title">权限管理</h1> 
			<input type="hidden" id="module_fid" value="1">
			<input type="hidden" id="module_id" value="3">
			<input type="hidden" id="role_id" value="${role.id}">
			<input type="hidden" id="zNodes_value" value="${zNodes}">
			<ol class="breadcrumb">
				<li><a href="index.html">控制台</a></li>
				<li><a href="#">用户管理</a></li>
				<li><a href="#">角色管理</a></li>
				<li class="active">权限管理</li>
			</ol>
		</div>
		
		<!-- End Page Header -->
		
	
		<!-- //////////////////////////////////////////////////////////////////////////// -->
		<!-- START CONTAINER -->
		<div class="container-padding">
			<!-- Start Row -->
			<div class="row">
				<!-- Start Panel -->
				<div class="col-md-12">
					<div class="panel panel-default">
					<div class="panel-body">
						<div class="table-responsive" id="div-table-container">
							<table id="rolePemission"
								class="table table-striped table-bordered table-hover">
								<tbody>
									<tr>
										<td style="width:10%;">角色ID</td>
										<td>${role.id}</td>
									</tr>
									<tr>
										<td>角色名称</td>
										<td>${role.roleName}</td>
									</tr>
									<tr>
										<td>权限</td>
										<td id="td_permission">
											<div class="content_wrap">
												<div class="zTreeDemoBackground left">
													<ul id="permissionTree" class="ztree"></ul>
												</div>												
											</div>

										</td>
									</tr>
								</tbody>
							</table>
						</div>
						
					</div>
					 <div class="panel-title">
			          <div class="col-sm-offset-2 col-sm-10">
		                    <button type="button" class="btn btn-default" id="btn_save" >保存</button>
		                    <button type="button" class="btn btn-default" id="btn_back" >返回</button>
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
	<%@ include file="/WEB-INF/jsp/common/footer.jsp"%>
	<!-- End Footer -->
	</div>
	<!-- End Content -->
   <%@ include file="/WEB-INF/jsp/common/common_js.jsp"%>	
	<script src="${ctx}/js/ztree/jquery.ztree.core.min.js"></script>
	<script src="${ctx}/js/ztree/jquery.ztree.excheck.min.js"></script>
	<script src="${ctx}/js/cop/role/role_permission.js"></script>
	<script src="${ctx}/js/toastr/toastr.min.js"></script> 
	<script src="${ctx}/js/toastr/toastrStyleReset.js"></script>
</body>
</html>