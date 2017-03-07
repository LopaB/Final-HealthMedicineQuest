<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<html>
<head>
<title>Health Medicine Quest - ${title}</title>
<script>
	window.menu='${title}';
</script>
<s:url value="/resources/css" var="css"/>
<s:url value="/resources/js" var="js"/>
<s:url value="/resources/jquery" var="jquery"/>
<!-- Style -->
<link rel="stylesheet" href="${css}/jquery.dataTables.min.css"/>
<link rel="stylesheet" href="${css}/bootstrap.min.css">
<link rel="stylesheet" href="${css}/bootstrap-theme.min.css"/>
<link rel="stylesheet" href="${css}/dataTables.bootstrap.min.css"/>
<link rel="stylesheet" href="${css}/health.css">
<!-- jQuery library -->
<script src="${jquery}/jquery-3.1.1.min.js"></script>  
<!-- Latest compiled JavaScript -->	
<script  type="text/javascript"  src="${js}/jquery.js"></script>
<script  type="text/javascript"  src="${js}/jquery.dataTables.min.js"></script>
<script type="text/javascript"  src="${js}/bootstrap.min.js"></script>
<script type="text/javascript"  src="${js}/datatableScript.js"></script>
<script  type="text/javascript"  src="${js}/productcrud.js"></script>
<script  type="text/javascript"  src="${js}/dataTables.bootstrap.min.js"></script>

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
<div class="container">
<div class="header">
<%@include file="navbar.jsp"%>
</div>
	<div class="content">
	<h2>Do You Want to Continue?</h2>
	<a href="welcome" class="btn btn-success btn-lg">Continue</a>
	<a href="register" class="btn btn-success btn-lg">Edit</a>
	</div>
	<div class="footer">
			<%@include file="../shared/footer.jsp"%>
			</div>
			</div>	
			</body>
			</html>