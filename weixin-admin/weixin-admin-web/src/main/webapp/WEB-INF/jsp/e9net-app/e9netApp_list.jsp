<%@ page contentType="text/html; charset=utf-8"%>
<%@ include file="/WEB-INF/jsp/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="/WEB-INF/jsp/common/head.jsp"%>
<title>应用管理</title>
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
				<li class="active">应用列表</li>
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
									<label for="example2" class="form-label">应用名称</label> <input
										class="form-control" placeholder="应用名称" id="name-search">
								</div>
								<div class="form-group">
									<label for="example2" class="form-label">应用状态</label> <select
										class="form-control " id="status-search" style="width: 200px">
										<option value="">所 有</option>
										<option value="0">上线中</option>
										<option value="1">停 用</option>
									</select>
								</div>
								<div class="form-group">
									<label for="example2" class="form-label">所属用户</label> <input
										class="form-control" placeholder="所属用户" id="user-search">
								</div>
								<button type="button" class="btn btn-default" id="btn_search">查询</button>
							</form>
						</div>
					</div>
					<div class="panel panel-default">
						<div class="panel-heading">
							<shiro:hasPermission name="e9netApp:add">
								<button type="button" class="btn btn-default " id="btn_add">
									<i class="fa fa-plus"></i>新增
								</button>
							</shiro:hasPermission>
							<shiro:hasPermission name="e9netApp:deleteBatch">
								<button type="button" class="btn btn-default" id="btn_del">删除</button>
							</shiro:hasPermission>
							<shiro:hasPermission name="e9netApp:edit">
								<button type="button" class="btn btn-default" id="btn_edit">修改</button>
							</shiro:hasPermission>

							<shiro:hasPermission name="e9netApp:onLine">
								<button type="button" class="btn btn-default" id="btn_onLine">上线</button>
							</shiro:hasPermission>
							<shiro:hasPermission name="e9netApp:stop">
								<button type="button" class="btn btn-default" id="btn_stop">停用</button>
							</shiro:hasPermission>
							<shiro:hasPermission name="e9netApp:editSign">
								<button type="button" class="btn btn-default" id="btn_editSign">修改签名</button>
								<button style="display: none;" data-toggle="modal" data-target="#myModal" id="sign_btn"></button>
							</shiro:hasPermission>
							<shiro:hasPermission name="e9netApp:smsM">
								<button type="button" class="btn btn-default" id="btn_smsM">短信模板管理</button>
							</shiro:hasPermission>
							<shiro:hasPermission name="e9netApp:orgCfg">
								<button type="button" class="btn btn-default" id="btn_orgCfg">配置通道</button>
							</shiro:hasPermission>
						</div>
						<div class="panel-body">
							<div class="table-responsive" id="div-table-container">
								<table id="example"
									class="table table-bordered table-striped table-hover ">
									<thead>
										<tr>
											<th><input type="checkbox" id="checkAll"></th>
											<th>应用ID</th>
											<th>应用名称</th>
											<th>所属用户</th>
											<th>应用状态</th>
											<th>签名</th>
											<th>签名状态</th>
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

		<!-- Modal -->
		<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
			aria-hidden="true">
			<div class="modal-dialog">
				<form id="signForm" method="post" class="form-horizontal"
					action="${ctx}/e9netApp/signSbm">					
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal"
								aria-label="Close">
								<span aria-hidden="true">&times;</span>
							</button>
							<h4 class="modal-title">设置签名</h4>
						</div>
						<div class="modal-body">
							<p style="color: red;">*签名建议为应用名。</p>
							<p style="color: red;">*签名长度在2到30个字符之间。</p>
							<p style="color: red;">*无须添加【】、()、[]符号，短信发送会自带【】、()、[]符号，避免重复。</p>
							<br />
								<input type="hidden" name="signStatus" id="signStatus" >
								<input type="hidden" name="id" id="id" >
								<table width="100%" border="0" cellspacing="0" cellpadding="0"
									class="modify">
									<tr>
										<td align="right">设置签名：</td>
										<td><input type="text" class="form-control" id="signCh"
											name="signCh" placeholder="签名不能为空！"></td>
										<td>&nbsp;</td>
									</tr>

									<tr>
										<td align="right">备注：</td>
										<td><textarea class="form-control" rows="5" id="remarks"
												name="remarks" placeholder="请简单描述申请签名的使用场景，以便更快通过审核！"></textarea>
										</td>
										<td width="100"
											style="font-size: 13px; color: #c3c3c3; line-height: 18px;">
										</td>
									</tr>
								</table>
						</div>
						<div class="modal-footer">
							<button type="submit" class="btn btn-default">确定</button>
							<button type="button" class="btn btn-white" data-dismiss="modal" id="close_sign_win">取消</button>
						</div>
					</div>
				</form>
			</div>
		</div>

		<!-- End Moda Code -->

		<!-- //////////////////////////////////////////////////////////////////////////// -->
		<!-- Start Footer -->
		<%@ include file="/WEB-INF/jsp/common/footer.jsp"%>
		<!-- End Footer -->
	</div>
	<!-- End Content -->
	<%@ include file="/WEB-INF/jsp/common/common_js.jsp"%>
	<script src="${ctx}/js/cop/e9net-app/e9netApp_list.js"></script>
</body>
</html>