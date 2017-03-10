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
  <form:form modelAttribute="prod">
  <div class="row">
  	<div class="col-md-12" style="height:5%: border-bottom:1px solid black">
  		<h2>Shopping Cart <span>(<!-- ${cart.itemCount} --> Item(s))</span></h2>
  	</div> 	
  </div>
  <div class="row">
  <div class="col-md-12">
  <table class="table table-responsive table-sripped">
  	<tr>
  		<th colspan="2" style="color:darkgrey">Item</th>
  		<th style="color:darkgrey">Quantity</th>
  		<th style="color:darkgrey">Price</th>
  		<th style="color:darkgrey">Sub Total</th>
  		<th></th>
  	</tr>
  	<tr>
  	<td><img src="${images}/${prod.imageUrl}" width="70px" height="70px"/></td>
  	<td>${prod.productName}</td>
  	<td>
  		<select id="Quantity">
  			<c:forEach var="i" begin="1" end="${prod.productQuantity}">
  			<option value="${i}">${i}</option>
  			</c:forEach>
  		</select>
  	</td>
  	<td>&#8377; ${prod.productPrice} </td>
  	<td></td>
  	<td><span class="glyphicon glyphicon-remove-sign" style="text-size:30px; color:crimson"></span></div></td>
  	</tr>
  </table>
  </div>
  </div>
   <div class="row">
  <div class="col-md-12">
  <table class="table table-responsive">
  <tr>
   <td></td>
  <td></td>
  <td>Grand Total</td>
  <td></td>
  </tr>
  <tr>
  <td></td>
  <td></td>
  <td><button class="btn btn-danger btn-lg">Continue Shopping</button> </td>
  <td><button class="btn btn-danger btn-lg">Place Order</button></td>
  </tr>
  </table>
  </div>
  </div>
  	
 
  </form:form>
  </div>
  </div>
  </body>
  </html>