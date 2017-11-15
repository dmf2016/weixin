<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ include file="/WEB-INF/jsp/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="/WEB-INF/jsp/common/head.jsp"%>
<title>短信模板新增</title>
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
				<li><a href="/index.html">控制台</a></li>
				<li><a href="${rootPath}/e9netApp/edit_e9netTemplateWin/${e9netApp.id}">短信模板管理</a></li>
				<li class="active">短信模板</li>
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
							<form id="e9netTemplateForm" method="post" class="form-horizontal"
								action="${ctx}/e9netTemplate/edit">
								 <input type="hidden"  id="appId" name="appId" >
								  <input type="hidden"  id="id"  name="id">
								 
								<div class="form-group">
									<label for="input002" class="col-sm-2 control-label form-label">模板名称</label>
									<div class="col-sm-10">
										<input type="text" class="form-control" name="name"
											id="name" placeholder="模板名称不能为空">
									</div>
								</div>
								<div class="form-group ">
									<label for="input002" class="col-sm-2 control-label form-label">短信类型</label>
									<div class="col-sm-10 ">										 
										<select class="form-control" name="smsType" id="smsType">
											<c:forEach items="${fn:split(e9netApp.smsType,',') }" var="d">		
												<c:if test="${d==1 }">
													<option value="1">短信验证码</option>								
												</c:if>		
												<c:if test="${d==2 }">
													<option value="2">短信通知</option>								
												</c:if>		
												<c:if test="${d==3 }">
													<option value="3">推广短信</option>								
												</c:if>									
											</c:forEach>
										</select>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label form-label">模板内容</label>
									<div class="col-sm-10">
										<textarea class="form-control" rows="3" id="content"
											name="content" placeholder="内容不能超过500字符！"></textarea>
									</div>
								</div>

								<div class="form-group">
									<div class="col-sm-10 col-sm-offset-2">
										<button type="submit" id="showtop" class="btn btn-default"
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
	<script src="${ctx}/js/cop/e9net-template/e9netTemplate.js"></script>
		<script type="text/javascript">
		$(function() {
			//编辑加载数据信息
			$("#smsType").val('${e9netTemplate.smsType }');
			$("#name").val('${e9netTemplate.name }');
			$("#content").val('${e9netTemplate.content }');
			$("#appId").val('${e9netApp.id }');
			$("#id").val('${e9netTemplate.id }');
		});
	</script>
</body>
</html>