
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
<div class="container wrapper">
<div class="header">
<%@include file="navbar.jsp"%>
</div>
	<div class="content">

		<div class="row form-container">
		<form:form modelAttribute="user">
			<div class="col-md-3"></div>
			<div class="panel col-md-6"
				style="padding-bottom: 10px; border: 1px solid; background-color: #337ab7; color: white; border-color: #2e6da4;">
				<div class="panel-heading"
					style="text-align: center; font-weight: bolder">
					<h2>Sign up now</h2>
					<h4>Fill in the form below to get instant access</h4>
					<hr />
				</div>

				
					<!-- Text input-->
					<div class="row form-group" style="padding-left: 10%; padding-right: 10%; padding-bottom: 2%">
						<div class="col-md-12">
							<form:input path="userName" id="userName" type="text" placeholder="User Name" class="form-control input-md"/>
								<div class="has-error">
									<form:errors path="userName" class="help-inline"  style="color:red"/>
								</div>
						</div>

					</div>
					<!-- Text input-->
					<div class="row form-group"
						style="padding-left: 10%; padding-right: 10%; padding-bottom: 2%">
						<div class="col-md-6">
							<form:input path="password" type="password" placeholder="Password"
								class="form-control input-md"/>
							<div class="has-error">
								<form:errors path="password" class="help-inline"  style="color:red"/>
							</div>	
						</div>

						<div class="col-md-6" style="padding-left: 2%">
							<form:input path="userConfirmPassword" type="Password"
								placeholder="Confirm Password" class="form-control input-md"/>
								<div class="has-error">
									<form:errors path="userConfirmPassword" class="help-inline"  style="color:red"/>
								</div>	
						</div>

					</div>

					<!-- Text input-->
					<div class="row form-group"
						style="padding-left: 10%; padding-right: 10%; padding-bottom: 2%">
						<div class="col-md-12">
							<form:input path="userFullName" type="text" placeholder="Name"
								class="form-control input-md"/>
								<div class="has-error">
									<form:errors path="userFullName" class="help-inline"  style="color:red"/>
								</div>	
						</div>

					</div>
					<!-- Text Select -->
				<div class="row form-group" style="padding-left: 10%; padding-right: 10%; padding-bottom: 2%">
						<div class="col-md-12">
							<form:select path="role" class="form-control">
							<form:option value="0" label="--  Select User Role --" selected="true"/>
							<form:option value="User" label="User"/>
							<form:option value="Supplier" label="Supplier"/>					
							</form:select>
								
						</div>

					</div>
					<!-- Text input-->
					<div class="row form-group"
						style="padding-left: 10%; padding-right: 10%; padding-bottom: 2%">
						<div class="col-md-12">
							<form:input path="userEmail" type="email" placeholder="Email"
								class="form-control input-md"/>
								<div class="has-error">
									<form:errors path="userEmail" class="help-inline"  style="color:red"/>
								</div>	
						</div>

					</div>
					<!-- Text input-->
					<div class="row form-group"
						style="padding-left: 10%; padding-right: 10%; padding-bottom: 2%">
						<div class="col-md-12">
							<form:input path="userPhoneNumber" type="tel" placeholder="Phone Number"
								class="form-control input-md"/>
								<div class="has-error">
									<form:errors path="userPhoneNumber" class="help-inline"  style="color:red"/>
								</div>
						</div>

					</div>
					<!-- Text input-->
					<div class="row form-group"
						style="padding-left: 10%; padding-right: 10%; padding-bottom: 2%">
						<div class="col-md-12">
							<form:input path="userQuestion" type="text" placeholder="Security Question"
								class="form-control input-md"/>
								
						</div>

					</div>
					<!-- Text input-->
					<div class="row form-group"
						style="padding-left: 10%; padding-right: 10%; padding-bottom: 2%">
						<div class="col-md-12">
							<form:input path="userAnswer" type="text" placeholder="Security Answer"
								class="form-control input-md"/>
								<div class="has-error">
									<form:errors path="userAnswer" class="help-inline"  style="color:red"/>
								</div>
								
						</div>

					</div>
					<div class="row form-group"
						style="padding-left: 10%; padding-right: 10%; padding-bottom: 2%"">
						<div class="col-md-12"></div>
					</div>
					<div class=" row form-group"
						style="padding-left: 10%; padding-right: 10%; padding-bottom: 2%"">
						<div class="col-md-12">
							<input type="submit" name="_eventId_submit" value="Register" class="btn btn-primary btn-md"/>
						</div>
					</div>

				
			</div>
			</form:form>
		</div>
	
		
		</div>
		<div class="footer">
			<%@include file="../shared/footer.jsp"%>
			</div>
			</div>	
			</body>
			</html>
		
