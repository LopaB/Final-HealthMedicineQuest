<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib prefix="s" uri="http://www.springframework.org/tags"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextRoot" value="${pageContext.request.contextPath}"/>
<html>
<head>
<title>Health Medicine Quest - ${title}</title>
<script>
	window.menu='${title}';
</script>
<s:url value="/resources/images" var="images"/>
<s:url value="/resources/css" var="css"/>
<s:url value="/resources/js" var="js"/>
<s:url value="/resources/jquery" var="jquery"/>
<!-- Style -->
<link rel="stylesheet" href="${css}/bootstrap.min.css">
<link rel="stylesheet" href="${css}/bootstrap-theme.min.css"/>
<link rel="stylesheet" href="${css}/health.css">
<!-- jQuery library -->
<script src="${jquery}/jquery-3.1.1.min.js"></script>  
<!-- Latest compiled JavaScript -->	
<script  src="${js}/jquery.js"></script>
<script  src="${js}/bootstrap.min.js"></script>

<!-- Self coded js file -->
<script src="${js}/myapp.js"></script> 
    <style>
    	body {
 
  color: #5a5a5a;
  background-color:#F0F4F5;
}
</style>
</head>
<body>
<div style="height:10%"></div>
<div class="container wrapper">
<div class="content">
		<div class="row">
			<div class="col-md-3"></div>
			<div class="panel panel-login row col-md-6"
				style="padding: 50px; border: 1px solid; background-color: #337ab7; color: white; border-color: #2e6da4;">
				<div class="panel-heading panel-heading-login"
					style="text-align: center; font-weight: bolder">USER LOGIN</div>
				<form id="form1" action="login" method="post">
				<c:if test="${error}">
					<p style="color:red;font-size:20px">${error}</p>
				</c:if>
					<div class="row">
						<div class="input-group">
							<div class="input-group-addon">
								<span class="glyphicon glyphicon-user"
									style="font-size: 10pt; color: white"></span>
							</div>
							<input name="username" type="text" class="form-control"
								placeholder="USERNAME" style="height: 45px" required="required">
						</div>
					</div>
					<div class="row" style="margin-top: 20px">
						<div class="input-group">
							<div class="input-group-addon">
								<span class="glyphicon glyphicon-lock"
									style="font-size: 10pt; color: white"></span>
							</div>
							<input name="password" class="form-control" type="password"
								placeholder="PASSWORD" style="height: 45px" required="required">
						</div>
						<br /> <input type="checkbox" id="RememberMe"> Remember
						me next time.</input>
					</div>
					<div class="row" style="margin-top: 20px">
						<div>
							<input type="submit" class="btn btn-success btn-block" value="Login"
								style="text-size: 10px"/>
						</div>
					</div>
					<div class="row"
						style="margin-top: 10px; text-align: right;">
						<div>
							
					<c:if test="${error}">
						<p style="color:red;font-size:20px">${error}</p>
					</c:if>
					
						</div>
					</div>
				</form>
			</div>

		</div>

		<div class="row">
			<div class="col-md-12" style="text-align: center"><a href="register"><span
				class="glyphicon glyphicon-wrench"></span> Signup</a>
			</div>
		</div>
		<br />
		<br />
		<div class="row"></div>
		</div>
		</div>
		</body>
		</html>
