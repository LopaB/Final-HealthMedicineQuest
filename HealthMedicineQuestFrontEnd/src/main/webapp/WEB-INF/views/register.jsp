<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<form:form action="userData.do" method="POST" commandName="user" modelAttribute="user" 
			class="form-horizontal">
<div class="container">
		<div class="row">
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
					<div class=" row form-group"
						style="padding-left: 10%; padding-right: 10%; padding-bottom: 2%">
						<div class="col-md-12">
							<form:input path="userName" type="text" placeholder="User Name"
								class="form-control input-md"/>
								<div class="has-error">
									<form:errors path="userName" class="help-inline"  style="color:red"/>
								</div>
						</div>

					</div>
					<!-- Text input-->
					<div class="row form-group"
						style="padding-left: 10%; padding-right: 10%; padding-bottom: 2%">
						<div class="col-md-6">
							<form:input path="userPassword" type="password" placeholder="Password"
								class="form-control input-md"/>
							<div class="has-error">
								<form:errors path="userPassword" class="help-inline"  style="color:red"/>
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
					<div class="row form-group"
						style="padding-left: 10%; padding-right: 10%; padding-bottom: 2%">
						<div class="col-md-12">
							<form:select path="userRole" type="email" class="form-control">
							<form:options value="user" selected>User</form:options>
							<form:options value="supplier" selected>Supplier</form:options>							
							</form:select>
								<div class="has-error">
									<form:errors path="userRole" class="help-inline"  style="color:red"/>
								</div>	
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
							<form:input path="userPhone" type="tel" placeholder="Phone Number"
								class="form-control input-md"/>
								<div class="has-error">
									<form:errors path="userPhone" class="help-inline"  style="color:red"/>
								</div>
						</div>

					</div>
					<!-- Text input-->
					<div class="row form-group"
						style="padding-left: 10%; padding-right: 10%; padding-bottom: 2%">
						<div class="col-md-12">
							<form:input path="userQuestion" type="text" placeholder="Security Question"
								class="form-control input-md"/>
								<div class="has-error">
									<form:errors path="userQuestion" class="help-inline"  style="color:red"/>
								</div>
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
							<button id="RegisterButton" class="btn btn-success btn-block"
								style="text-size: 10px">Register</button>
						</div>
					</div>

				</form>
			</div>
		</div>
		</div>
</form:form>