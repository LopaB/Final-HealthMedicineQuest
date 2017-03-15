<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
<script  type="text/javascript"  src="${js}/jquery.js"></script>
<script  type="text/javascript"  src="${js}/jquery.dataTables.min.js"></script>
<script type="text/javascript"  src="${js}/bootstrap.min.js"></script>
<script type="text/javascript"  src="${js}/datatableScript.js"></script>
<script  type="text/javascript"  src="${js}/productcrud.js"></script>
<script  type="text/javascript"  src="${js}/dataTables.bootstrap.min.js"></script>

<!-- Self coded js file -->
<script src="${js}/myapp.js"></script> 
<script>
$(document).ready(function(){
	$('#s').click(function() {
	    if( $(this).is(':checked')) {
	       $(".mydiv").hide();
	    } else {
	       $(".mydiv").show();
	    }
	});
	});
</script>
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
<%@include file="registration/navbar.jsp"%>
</div>

<div class="container content">
	<div class="row">
	<form:form action="${contextRoot}/admin/productData.do" method="POST" commandName="product" modelAttribute="product" 
			class="form-horizontal" enctype="multipart/form-data">
		<div class="col-md-3"></div>
		<div class="col-md-6">
		<div class="form-container">
		<h1>Product Data</h1>
			<form:hidden path="productId"/>

				<div class="row">
					<div class="form-group col-md-12">
						<label class="col-md-4 control-lable" for="productName">Product
							Name</label>
						<div class="col-md-7">
							<form:input type="text" path="productName" id="productName"
								class="form-control input-sm"  />
							<div class="has-error">
								<form:errors path="productName" class="help-inline"  style="color:red"/>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="form-group col-md-12">
						<label class="col-md-4 control-lable" for="productDescription">Product
							Description</label>
						<div class="col-md-7">
							<form:input type="text" path="productDescription" id="productDescription"
								class="form-control input-sm" />
							<div class="has-error">
								<form:errors path="productDescription" class="help-inline" style="color:red"/>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="form-group col-md-12">
						<label class="col-md-4 control-lable" for="productCategory">Product
							Category</label>
						<div class="col-md-7">
							<form:input type="text" path="productCategory" id="productCategory"
								class="form-control input-sm" />
							<div class="has-error">
								<form:errors path="productCategory" class="help-inline" style="color:red"/>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="form-group col-md-12">
						<label class="col-md-4 control-lable" for="imageUrl">Upload Product Image</label>
						<div class="col-md-7">
							<form:input type="file" path="file" id="imageUrl"
								class="form-control filestyle" />
							<div class="has-error">
								<form:errors path="file" class="help-inline" style="color:red"/>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="form-group col-md-12">
						<label class="col-md-4 control-lable" for="productPrice">Product Price</label>
						<div class="col-md-7">
							<form:input type="text" path="productPrice" id="productPrice"
								class="form-control input-sm" />
							<div class="has-error">
								<form:errors path="productPrice" class="help-inline" style="color:red"/>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="form-group col-md-12">
						<label class="col-md-4 control-lable" for="productQuantity">Product Quantity</label>
						<div class="col-md-7">
							<form:input type="text" path="productQuantity" id="productQuantity"
								class="form-control input-sm" />
							<div class="has-error">
								<form:errors path="productQuantity" class="help-inline" style="color:red"/>
							</div>
						</div>
					</div>
				</div>
				 <div class="row">
            		<div class="form-actions floatRight">
                		<input type="submit" name="action" value="Update" class="btn btn-primary btn-lg">
            		</div>
        		</div>
					
			
			<hr/>	
				</div>	
					<div class="col-md-3"></div>
				</div>		
				</form:form>
				</div>
				</div>
				</div>
				</body>
				</html>
				