<%@taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
<nav class="navbar navbar-default" role="navigation">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
        </div>
        <div class="collapse navbar-collapse" style="color:white;">
            <ul class="nav navbar-nav navbar-left">                
                <li style="border-right:1px solid black"><img src="${images}/Logo.jpg" height="50" width="60" style="float:left;"/><a class="navbar-brand" href="#" style="padding-left:5px">Health Medicine Quest</a></li>
                <li id="home"><a href="${contextRoot}/home"><span class="glyphicon glyphicon-home" style="font-size:12pt;"></span> Home</a></li>
                <li id="contact"><a href="${contextRoot}/contact"><span class="	glyphicon glyphicon-earphone" style="font-size:12pt;"></span> Contact Us</a></li>
                <li id="about"><a href="${contextRoot}/about"><span class="glyphicon glyphicon-info-sign" style="font-size:12pt;"></span> About Us</a></li>
                <security:authorize access="hasAuthority('User')">
				<li id="cart"><a href="/#/"><span
						class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li>
				<li id="products"><a href="${contextRoot}/user/products"><span
						class="glyphicon glyphicon-list"></span> View All</a></li>
				</security:authorize>
				<security:authorize access="hasAuthority('ADMIN')">
			<li class="dropdown"><a class="dropdown-toggle"
				data-toggle="dropdown" href="/#/"><span
					class="glyphicon glyphicon-user"></span> ADMIN<span class="caret"></span></a>
				<ul class="dropdown-menu">
					<li><a href="${contextRoot}/admin/productCRUD"><span
							class="glyphicon glyphicon-list"></span>Product Management</a></li>
				</ul></li>
				</security:authorize>
            </ul>
            <ul class="nav navbar-nav navbar-right">
               <security:authorize access="isAnonymous()">
				<li id="register"><a href="register"><span
						class="glyphicon glyphicon-plus"></span> Register</a></li>
				<li id="login"><a href="${contextRoot}/login"><span
						class="glyphicon glyphicon-user"></span> Login</a></li>
						<li class="dropdown" style="padding-right:10pt">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-cog" style="font-size:12pt;"></span><strong class="caret"></strong></a>
                    <ul class="dropdown-menu">
                        <li><a href="#">Change Password</a></li>
                        <li class="divider"></li>
                        <li><a href="#">My Profile</a></li>
                    </ul>
                </li>
			</security:authorize>
<security:authorize access="isAuthenticated()">
				<li id="logout"><a href="${contextRoot}/logout">Logout</a></li>
			</security:authorize>


                
            </ul>
        </div>
    </nav>
    
    