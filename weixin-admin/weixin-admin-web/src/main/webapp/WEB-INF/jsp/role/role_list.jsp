<%@ page contentType="text/html; charset=utf-8"%>
<%@ include file="/WEB-INF/jsp/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
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
			<input type="hidden" id="module_fid" value="1"> 
			<input type="hidden" id="module_id" value="3"> 
			<input type="hidden" id="role_checked" value=""> 
			<ol class="breadcrumb">
				<li><a href="index.html">控制台</a></li>
				<li><a href="#">用户管理</a></li>
				<li class="active">角色管理</li>
			</ol>
		</div>
		<!-- End Page Header -->
		<!-- //////////////////////////////////////////////////////////////////////////// -->
		<!-- START CONTAINER -->
		<div class="container-padding">
		 <!-- Start Row -->
		  <div class="row">
		    <div class="col-md-12 condition">
		      <!-- 查询 -->
		      <div class="panel panel-default">
					  <form class="form-inline">
		                <div class="form-group">
		                  <label for="example2" class="form-label">角色名称</label>
		                  <input type="email" class="form-control"  placeholder="名称" id="name-search" >
		                </div>
		                <button type="button" class="btn btn-default" id="btn_search" >查询</button>
		              </form>
		      <div class="clear"></div>
		      </div>
		    </div>
	      </div>
	     <!-- End Row -->
		<!-- Start Row -->
		<div class="row">
			<div class="col-md-12">
				<div class="panel panel-default">
				 <div class="panel-heading">
				 <shiro:hasPermission name="role:add">
                   <button type="button" class="btn btn-default " id="btn_add"><i class="fa fa-plus"></i>新增</button>
                   </shiro:hasPermission>
                   <shiro:hasPermission name="role:edit">
                    <button type="button" class="btn btn-default" id="btn_edit" >修改</button>
                    </shiro:hasPermission>
                    <shiro:hasPermission name="role:deleteBatch">
                    <button type="button" class="btn btn-default" id="btn_del" >删除</button>
                    </shiro:hasPermission>
                    <shiro:hasPermission name="role:permission">
                    <button type="button" class="btn btn-default" id="btn_right" >分配权限</button>
                    </shiro:hasPermission>
                  </div>
					<div class="panel-body">
						<table id="example" class="table table-bordered table-striped table-hover ">
							<thead>
								<tr>
								<th><input type="checkbox" id="checkAll"></th>
									<th>角色ID</th>
									<th>角色名称</th>
									<th>角色类型</th>
									<th>状态</th>
									<th>角色所属</th>
									<th>角色备注</th>
									<th>创建时间</th>
								</tr>
							</thead>
							 <tbody>
                            </tbody>
                          <!-- <tfoot>
                               <tr>
									<th><input type="checkbox" id="cb-check-all" name="cb-check-all" ></th>
									<th>角色ID</th>
									<th>角色名称</th>
									<th>角色类型</th>
									<th>状态</th>
									<th>角色所属</th>
									<th>角色备注</th>
									<th>创建时间</th>
								</tr>
                            </tfoot>
                            -->
						</table>
					</div>
				</div>
				</div>
				<!-- End Panel -->
			</div>
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
<script src="${ctx}/js/cop/role/role_list.js"></script>
<script>
</script>
</body>
</html>