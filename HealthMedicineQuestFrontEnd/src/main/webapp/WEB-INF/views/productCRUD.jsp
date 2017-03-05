<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="container">
	<div class="row">
		<div class="col-md-3"></div>
		<div class="col-md-6">
		<h1>Product Data</h1>
			<form:form action="productData.do" method="POST" commandName="product" modelAttribute="product">
			
				<table>
					<caption></caption>
					<tr>
						<td>Product Name</td>
						<td><form:input path="productName"/>
						<div class="has-error">
                        <form:errors path="productName" class="help-inline"/>
                    	</div>
						</td>
					</tr>
					<tr>
						<td>Product Description</td>
						<td><form:input path="productDescription"/>
						<div class="has-error">
                        <form:errors path="productDescription" class="help-inline"/>
                    	</div>
						</td>
					</tr>
					<tr>
						<td>Image Url</td>
						<td><form:input path="imageUrl"/>
						<div class="has-error">
                        <form:errors path="imageUrl" class="help-inline"/>
                    	</div>
						</td>
					</tr>
					<tr>
						<td>Product Price</td>
						<td><form:input path="productPrice"/>
						<div class="has-error">
                        <form:errors path="productPrice" class="help-inline"/>
                    	</div>
						</td>
					</tr>
					<tr>
						<td>Product Quantity</td>
						<td><form:input path="productQuantity"/>
						<div class="has-error">
                        <form:errors path="productQuantity" class="help-inline"/>
                    	</div>
						</td>
					</tr>
					<tr>
						<td colspan="2">
							<input type="submit" name="action" value="Add"/>
						</td>
					</tr>
				</table>
				
					</div>
					<div class="col-md-3"></div>
						</div>
				<br/>
				<br/>
				<div class="row">
				<div class="col-xs-12">
				<div class="table-responsive">
				<table border="1" id="mycrudTable" class="table table-bordered table-striped">
					<tr>
						<thead>
						<th>Product Id</th>
						<th>Product Name</th>
						<th>Product Description</th>
						<th>Product Price</th>
						<th>Product Quantity</th>
						<th>Image</th>
						<th>Update</th>
						<th>Delete<th>
						</thead>
					</tr>
					
				</table>
				</div>
				</div>
				</div>
			</form:form>
	

</div>