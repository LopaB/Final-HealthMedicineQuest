
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="s" uri="http://www.springframework.org/tags" %>
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
<link rel="stylesheet" href="${css}/jquery.dataTables.min.css"/>
<link rel="stylesheet" href="${css}/bootstrap.min.css">
<link rel="stylesheet" href="${css}/bootstrap-theme.min.css"/>
<link rel="stylesheet" href="${css}/dataTables.bootstrap.min.css"/>
<link rel="stylesheet" href="${css}/health.css">
<!-- jQuery library -->
<script src="${jquery}/jquery-3.1.1.min.js"></script>  
<!-- Latest compiled JavaScript -->	
<script language="JavaScript" type="text/javascript"  src="${js}/jquery.js"></script>
<script language="JavaScript" type="text/javascript"  src="${js}/jquery.dataTables.min.js"></script>
<script language="JavaScript" type="text/javascript"  src="${js}/bootstrap.min.js"></script>
<script language="JavaScript" type="text/javascript"  src="${js}/datatableScript.js"></script>
<script language="JavaScript" type="text/javascript"  src="${js}/productcrud.js"></script>
<script language="JavaScript" type="text/javascript"  src="${js}/dataTables.bootstrap.min.js"></script>

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
<div class="wrapper">
<div class="header">
<%@include file="./shared/navbar.jsp" %>
</div>
    <!-- Product Details -->
  
 
<div class="container content">
  <form:form modelAttribute="prod" action="cart">
<div style="height:20%"></div>
	<div class="row">
		<div class="col-md-3">
		<div id="${prod.productId}"></div>
			<div>
				<img src="${images}/${prod.imageUrl}" height="300" width="200">
			</div>
		</div>
		<div class="col-md-6">
			<div class="row">
				<p><h2>${prod.productName}</h2></p>
			</div>
			<div class="row">
				<br/>
				<p><h4>${prod.productDescription}</h4></p>
			</div>
			<div class="row">
				<p><h2>&#8377 ${prod.productPrice}</h2></p>
			</div>
			<div class="row">
				<p>
					<button  style="text-size:30px" class="btn btn-danger btn-lg" ><span class="glyphicon glyphicon-shopping-cart" style="text-size:30px"></span> Add to Cart</button>
					
						
				</p>
			</div>
		</div>
		
	</div>
	</form:form>
</div>
<div class="footer">
        	<%@include file="./shared/footer.jsp" %>
        </div>
</div>

</body>
</html>