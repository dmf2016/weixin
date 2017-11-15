<%@ page contentType="text/html; charset=utf-8"%>
<%@ include file="/WEB-INF/jsp/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="/WEB-INF/jsp/common/head.jsp"%>
<title>应用修改</title>
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
				<li><a href="/e9netApp/e9netAppListUI.html">应用管理</a></li>
				<li class="active">应用修改</li>
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
							<form id="e9netAppForm" method="post" class="form-horizontal"
								action="${ctx}/e9netApp/edit">
								<div class="form-group">
									<input type="hidden" id="id" name="id">
									<label for="input002" class="col-sm-2 control-label form-label">应用名称</label>
									<div class="col-sm-10">
										<input type="text" class="form-control" name="appName"
											id="appName" value="" placeholder="应用名称不能为空">
									</div>
								</div>
								<div class="form-group ">
									<label for="input002" class="col-sm-2 control-label form-label">短信类型</label>
									<div class="col-sm-10 col-sm-offset-0 checkbox checkbox-info">
										 &nbsp;&nbsp; &nbsp;
										<input id="checkbox101" type="checkbox" value="1" name="smsType" >
										<label for="checkbox101"   style="width: 100px"> 短信验证码 </label>
										 <input id="checkbox102" type="checkbox" name="smsType"  value="2" > 
										 <label	for="checkbox102"  style="width: 100px"> 短信通知 </label>
 										 <input id="checkbox103" type="checkbox" name="smsType" value="3" > 
										 <label	for="checkbox103" style="width: 100px"> 语音验证码 </label>
										 <span id="smsType_error"></span>
									</div>
								</div>
								<div class="form-group ">
									<label for="input002" class="col-sm-2 control-label form-label">是否签名</label>
									<div class="col-sm-10 col-sm-offset-0 radio radio-info radio-inline">
										 &nbsp;&nbsp; &nbsp; 
				                        <input type="radio" id="inlineRadio1" value="1" name="signFlag" >
				                        <label for="inlineRadio1"  style="width: 100px"> 是 </label>
										 <input type="radio" id="inlineRadio2" value="2" name="signFlag">
				                        <label for="inlineRadio2"  style="width: 100px"> 否 </label>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label form-label">备注</label>
									<div class="col-sm-10">
										<textarea class="form-control" rows="3" id="remarks"
											name="remarks" placeholder="内容不能超过500字符！"></textarea>
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
	<script src="${ctx}/js/cop/e9net-app/e9netApp.js"></script>
</body>
	<script type="text/javascript">
		$(function() {
			//编辑加载数据信息
			var smsTypes='${e9netApp.smsType }';
			var smsTypeArrs=smsTypes.split(",");
			for (var sms = 0; sms < smsTypeArrs.length; sms++) {
				$("#checkbox10"+smsTypeArrs[sms]).attr("checked","true");
			}
			var signFlags='${e9netApp.signFlag }';
			$("#inlineRadio"+signFlags).attr("checked","true");
			$("#appName").val('${e9netApp.appName }');
			$("#userId").val('${e9netApp.userId }');
			$("#remarks").val('${e9netApp.remarks }');
			$("#signFlag").val('${e9netApp.signFlag }');
			$("#id").val('${e9netApp.id }');
		});
	</script>
</html>