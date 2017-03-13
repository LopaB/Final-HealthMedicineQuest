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
             <div class="col-md-2"></div>
             <div class="col-md-8 col-centered" class="table-centered">
                    <div class="form-container col-md-8 well">
                           <form:form modelAttribute="payment" class="form-horizontal"
                                 method="POST">
                                 <div
                                        style="height: 50px; width: 100%; background: rgb(73, 186, 142); border-radius: 5px;">
                                        <h3 style="margin-left: 20px;">Share your contact details</h3>
                                 </div>
                                 <br />
                                 <div class="form-group" style="padding-left:10px">
                                        <form:input path="email" type="text" placeholder="abc@xyz.com"
                                               class="form-control" style="width: 55%; display: inline" />
                                        <div class="has-error">
                                               <form:errors style="color:red" path="email" class="help-inline" />
                                        </div>
                                        <form:input type="text" placeholder="+919945678"
                                                     class="form-control" path="phone" maxlength="10" minlength="10"
                                                     style="width: 35%; display: inline" />
                                         <div class="has-error">
                                                     <form:errors style="color:red" path="phone" class="help-inline" />
                                         </div>
                                               
                                         <div style="height: 50px; width: 100%; background: rgb(73, 186, 142); border-radius: 5px;">
                                                     <h3 style="margin-left: 20px;">Payment Details</h3>
                                         </div>
                                         <br />
								</div>
                                <div class="form-group">
                                         <label for="cno" style="color: gray">Card Number</label>
                                         <form:input type="text" class="form-control" path="cardNo"
                                                            placeholder="XXXX-XXXX-XXXX-XXXX" maxlength="16" minlength="16" />
                                          <div class="has-error">
                                               <form:errors style="color:red" path="cardNo"
                                                                   class="help-inline" />
                                          </div>
                                 </div>
                                 <div class="form-group">
                                          <label for="name" style="color: gray">Name on the card</label>
                                             	<form:input type="text" class="form-control" path="cardName"
                                                                   placeholder="Name On The Card" />
                                                  	<div class="has-error">
                                                          <form:errors style="color:red" path="cardName"
                                                                          class="help-inline" />
                                                     </div>
                                  </div>

                                  <div class="form-group">
                                          <label for="mm" style="color: gray; display: inline">Expiry</label>
                                          <label for="cvv" style="color: gray">CVV</label><br />
                                          <form:input type="number" path="mm" min="1" max="12"
                                                                          class="form-control" id="mm"
                                                                          style="width: 65px; display: inline" maxlength="3"
                                                                          placeholder="mm" />
                                           <div class="has-error">
                                              <form:errors style="color:red" path="mm" class="help-inline" />
                                       		</div>
                                                                          
                                            <form:input type="number" path="yy" min="2017" max="2027"
                                                                                class="form-control" maxlength="4"
                                                                                style="width: 75px; display: inline" placeholder="yy" />
                                                <div class="has-error">
                                                        <form:errors style="color:red" path="yy" class="help-inline" />
                                                </div>
                                                   <form:input type="text" path="cvv" minlength="3"
                                                                                       maxlength="3" length="3" class="form-control"
                                                                                       style="width: 75px; display: inline" placeholder="CVV" />
                                                        <div class="has-error">
                                                               <form:errors style="color:red" path="cvv"
                                                                                             class="help-inline" />
                                                         </div>
                                                         </div>


                                                         <div class="form-group">
                                                              <input type="submit" name="_eventId_submit" value="Make Payment"
                                                                                             class="btn btn-danger" /> 
                                                            <a href="${contextRoot}/index"
                                                                                             class="btn btn-md- btn-info">Back</a>
                                                          </div>
                                                                                <br />
                                                                                <br />
                                                                                <br />
                                                                                <br />
                                                    <div class="form-group">
                                           <p style="color: gray">By clicking on 'Make Payment' you are agreeing to terms and conditions .</p>
                                                  </div>
                           </form:form>
                    </div>
             </div>
             <div class="col-md-2"></div>
       </div>
</div>

       <div class="footer">
			<%@include file="./shared/footer.jsp"%>
			</div>
			</div>
			</body>
			</html>
