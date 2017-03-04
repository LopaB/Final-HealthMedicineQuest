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
                <li id="products"><a href="${contextRoot}/products"><span class="glyphicon glyphicon-list" style="font-size:12pt;"></span> View All Products</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li id="login"><a href="${contextRoot}/login"><span class="glyphicon glyphicon-lock" style="font-size:12pt;"></span> SignIn</a></li>
                <li><a href="logout.jsp"><span class="glyphicon glyphicon-log-out" style="font-size:12pt;"></span> SignOut</a></li>
                <li id="register"><a href="${contextRoot}/register"><span class="glyphicon glyphicon-user" style="font-size:12pt;"></span> Register</a></li>
                <li class="dropdown" style="padding-right:10pt">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-cog" style="font-size:12pt;"></span><strong class="caret"></strong></a>
                    <ul class="dropdown-menu">
                        <li><a href="#">Change Password</a></li>
                        <li class="divider"></li>
                        <li><a href="#">My Profile</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </nav>