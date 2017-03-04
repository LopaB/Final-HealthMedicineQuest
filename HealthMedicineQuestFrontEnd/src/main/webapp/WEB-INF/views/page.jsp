<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
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
<script language="JavaScript" type="text/javascript"  src="${js}/dataTables.bootstrap.min.js"></script>

<!-- Self coded js file -->
<script src="${js}/myapp.js"></script> 
    <style>
    	body {
  padding-bottom: 40px;
  color: #5a5a5a;
  background-color:#F0F4F5;
}

/* CUSTOMIZE THE CAROUSEL
-------------------------------------------------- */

/* Carousel base class */
.carousel {
    border-radius: 25px;
     overflow: hidden;
  height: 350px;
  margin-bottom: 40px;
}
/* Since positioning the image, we need to help out the caption */
.carousel-caption {
  z-index: 10;
}

/* Declare heights because of positioning of img element */
.carousel .item {
  height: 350px;
  background-color: #87CEFA;
  border-radius: 25px;
  overflow: hidden;
}
.carousel-inner > .item > img {
  position: absolute;
  top: 0;
  left: 0;
  min-width: 100%;
  height: 350px;
}
 ==============================================
 .brandLogos {
    text-align: center;
    background-color: #fff;
    padding: 10px 0;
    box-shadow: 0 0 5px #F4F4F4;
    border:none;
}   	
    </style>
</head>
<body>
	<div class="wrapper">
		
		<div class="header">
			<!-- Navigation -->
			<!-- Menu bar -->
			<%@include file="./shared/navbar.jsp" %>
    	</div>
    	
    	<!-- Page Content -->
    	<div class="content">
    		<!-- Loading the home content -->
    		<c:if test="${userClickHome==true}">
    			<%@include file="home.jsp" %>
    		</c:if>
    		<!-- Loading only when user clicks about -->
    		<c:if test="${userClickAbout==true}">
    			<%@include file="about.jsp" %>
    		</c:if>
    		<!-- Loading only when user clicks contact -->
    		<c:if test="${userClickContact==true}">
    			<%@include file="contact.jsp" %>
    		</c:if>
    		<!-- Loading only when user clicks contact -->
    		<c:if test="${userClickProducts==true}">
    			<%@include file="products.jsp" %>
    		</c:if>
    	</div>
    	
 		<hr />
 		
        <!-- FOOTER -->
        <div class="footer">
        	<%@include file="./shared/footer.jsp" %>
        </div>
        
	</div>

</body>
</html>
