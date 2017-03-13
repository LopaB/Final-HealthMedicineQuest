<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
    <style>
    	body {
  overflow-x: hidden;
  color: #5a5a5a;
  background-color:#F0F4F5;
}
</style>
</head>
<body>
<div class="container wrapper">
<div class="header">
<%@include file="registration/navbar.jsp"%>
</div>
<div>
<h1> ORDER INVOICE</h1>
</div>	
<form:form modelAttribute="cartModel">
<div class="row" style="padding-left:5px">
<div class="col-md-6" style="border:2px solid crimson; height:150px; spacing:5px; padding:5px">
<h3>${cartModel.payment.cardName}</h3>
<br/>
${cartModel.payment.email}
<br/>
${cartModel.payment.phone}
</div>
<div class="col-md-6" style="border:2px solid crimson; height:150px; spacing:5px; padding:5px">
<h3>
Address
</h3>
<c:choose>  
    <c:when test="${cartModel.shippingAddress.addAddress1}!=''">  
	<p style="font-size:12px">
	${cartModel.shippingAddress.addAddress1}<br/>
	${cartModel.shippingAddress.addAddress2}<br/>
	${cartModel.shippingAddress.addCity} <br/>
	${cartModel.shippingAddress.addState} - ${cartModel.shippingAddress.addZip} <br/>
	${cartModel.shippingAddress.addCountry}
	</p>
	</c:when>
 <c:otherwise>  
	<p style="font-size:12px">
	${cartModel.billingAddress.addAddress1}<br/>
	${cartModel.billingAddress.addAddress2}<br/>
	${cartModel.billingAddress.addCity} <br/>
	${cartModel.billingAddress.addState} - ${cartModel.billingAddress.addZip} <br/>
	${cartModel.billingAddress.addCountry}
	</p>
	</c:otherwise>
</c:choose>
</div>
</div>
<br/>
<br/>
<div class="col-md-12">
<div class="table-responsive">
<table class="table table-stripped">
	<tr>
	<th> Product Image</th>
	<th> Product Name</th>
	<th> Product Price</th>
	<th> Quantity</th>
	<th> Sub Total</th>
	</tr>
	<c:forEach items="${cartModel.cartItem}" var="ci">
	<tr>
	<td><img src="${images}/${ci.product.imageUrl}" height="70px" width="70px"/></td>
	<td>${ci.product.productName}</td>
	<td>&#8377; ${ci.product.productPrice}</td>
	<td>${ci.quantity}</td>
	<td>&#8377; ${ci.totalPrice}</td>
	</tr>
	</c:forEach>
	<tr>
	<td colspan="4"><h4>Grand Total</h4></td>
	<td><h4>&#8377; ${cartModel.payment.totalPayment}</h4></td>
	</tr>
</table>
</div>
</div>
<input type="submit" name="_eventId_submit" value="Confirm" class="btn btn-danger btn-lg"/>
</form:form>
 <div class="footer">
			<%@include file="./shared/footer.jsp"%>
			</div>
			</div>
			</body>
			</html>