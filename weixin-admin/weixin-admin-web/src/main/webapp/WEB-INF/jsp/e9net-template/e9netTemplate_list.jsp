<%@ page contentType="text/html; charset=utf-8"%>
<%@ include file="/WEB-INF/jsp/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="/WEB-INF/jsp/common/head.jsp"%>
<title>短信模板管理</title>
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
			<input type="hidden" id="module_fid" value="4"> <input
				type="hidden" id="module_id" value="6"> <input type="hidden"
				id="e9netApp_checked" value="">
			<ol class="breadcrumb">
				<li><a href="index.html">控制台</a></li>
				<li><a href="#">应用管理</a></li>
				<li><a href="/e9netApp/e9netAppListUI.html">返回应用</a></li>
				<li class="active">短信模板管理</li>
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
					<!-- 查询 -->
					<div class="panel panel-default">
						<div class="panel-body">
							<form class="form-inline">
								<div class="form-group">
									<label for="example2" class="form-label">模板名称</label> <input
										class="form-control" placeholder="模板名称" id="name-search">
								</div>
								<div class="form-group">
									<label for="example2" class="form-label">短信类型</label> <select
										class="form-control " id="smsType-search" style="width: 200px">
										<option value="">请选择</option>
										<option value="0">短信验证码</option>
										<option value="1">短信通知</option>
									</select>
								</div>
								<div class="form-group">
									<label for="example2" class="form-label">状态</label> <select
										class="form-control " id="status-search" style="width: 200px">
										<option value="">请选择</option>
										<option value="0">上线中</option>
										<option value="1">停 用</option>
									</select>
								</div>
								<div class="form-group">
									<label for="example2" class="form-label">所属应用</label> <input
										class="form-control" placeholder="所属应用" id="app-search">
								</div>
								<button type="button" class="btn btn-default" id="btn_search">查询</button>
							</form>
						</div>
					</div>
					<div class="panel panel-default">
						<div class="panel-heading">
							<button type="button" class="btn btn-default " id="btn_add">
								<i class="fa fa-plus"></i>新增
							</button>
							<button type="button" class="btn btn-default" id="btn_del">删除</button>
							<button type="button" class="btn btn-default" id="btn_edit">修改</button>
							<button type="button" class="btn btn-default" id="btn_onLine">上线</button>
							<button type="button" class="btn btn-default" id="btn_stop">停用</button>
						</div>
						<div class="panel-body">
							<div class="table-responsive" id="div-table-container">
								<table id="example"
									class="table table-bordered table-striped table-hover ">
									<thead>
										<tr>
											<th><input type="checkbox" id="checkAll"></th>
											<th>模版ID</th>
											<th>模版名称</th>
											<th>更新时间</th>
											<th>短信类型</th>
											<th>状态</th>
										</tr>
									</thead>
									<tbody>
									</tbody>
								</table>
							</div>
						</div>
					</div>
				</div>
				<!-- End Panel -->
			</div>
			<!-- End Row -->
		</div>
		<!-- END CONTAINER -->
		
		<!-- Start HIDIE -->
		<input type="hidden"  id="app_Id">
		<input type="hidden"  id="app_smsType">
		<!-- End HIDIE -->
		<!-- //////////////////////////////////////////////////////////////////////////// -->
		<!-- Start Footer -->
		<%@ include file="/WEB-INF/jsp/common/footer.jsp"%>
		<!-- End Footer -->
	</div>
	<!-- End Content -->
	<%@ include file="/WEB-INF/jsp/common/common_js.jsp"%>
	<script type="text/javascript">
		$(function(){
			$("#app_Id").val("${e9netApp.id }");
			$("#app_smsType").val("${e9netApp.smsType }");
		});
	</script>
	<script src="${ctx}/js/cop/e9net-template/e9netTemplate_list.js"></script>
</body>
</html>