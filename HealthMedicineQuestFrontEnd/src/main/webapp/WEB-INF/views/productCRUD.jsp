<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<form:form action="productData.do" method="POST" commandName="product" modelAttribute="product" 
			class="form-horizontal" enctype="multipart/form-data">
<div class="container">
	<div class="row">
		<div class="col-md-3"></div>
		<div class="col-md-6">
		<div class="form-container">
		<h1>Product Data</h1>
			

				<div class="row">
					<div class="form-group col-md-12">
						<label class="col-md-4 control-lable" for="productName">Product
							Name</label>
						<div class="col-md-7">
							<form:input type="text" path="productName" id="productName"
								class="form-control input-sm" />
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
                		<input type="submit" name="action" value="Add" class="btn btn-primary btn-sm">
            		</div>
        		</div>
					
			
			<hr/>	
				</div>	
					<div class="col-md-3"></div>
				</div>		
				<br/>
				<br/>
				<div class="container">
				<div class="row">
				<div class="col-md-12">
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
				</div>
			</form:form>
			<div>
			<!-- Modal -->
				<c:forEach var="p" items="${productList}">
					<div class="modal fade" id="${p.productId}" tabindex="-1"
						role="dialog" aria-labelledby="myModalLabel">
						<div class="modal-dialog" role="document">
							<div class="modal-content">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal"
											aria-label="Close">
											<span aria-hidden="true">&times;</span>
										</button>
										<span aria-hidden="true">&times;</span>
									</button>
									<h2 class="modal-title" id="myModalLabel">Update Product Detail</h2>

								</div>
								<div class="modal-body">
									<div class="col-sm-12" id="letv">
										<div class="thumbnail">
										<form:form action="productData.do" method="POST" commandName="product" modelAttribute="product" 
			class="form-horizontal" enctype="multipart/form-data">
											<div class="row">
					<div class="form-group col-md-12">
						<label class="col-md-4 control-lable" for="productName">Product
							Name</label>
						<div class="col-md-7">
							<form:input type="text" path="productName" id="productName"
								class="form-control input-sm" />
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
                		<input type="submit" name="action" value="Update" class="btn btn-primary btn-md">
            		</div>
        		</div>
        		</form:form>
											</div>
										</div>
									</div>
								</div>

							</div>
						</div>
					</div>
				</c:forEach>
			</div>
	</div>
	</div>
