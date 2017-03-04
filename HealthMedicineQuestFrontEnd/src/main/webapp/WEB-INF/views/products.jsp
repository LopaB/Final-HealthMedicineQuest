<div class="container content">
	<div class="row">
		<div class="col-md-12">
		<!-- DataTable -->
			<h2 style="color:">All Product Details</h2>
			<div class="table-responsive">
				<table id="myDataTable" class="table table-bordered table-striped">
					<thead>
						<th>Product Id</th>
						<th>Product Name</th>
						<th>Product Benefit</th>
						<th>Price/Unit</th>
						<th>Product Image</th>
						<th>View Item</th>
						<th>Add To Cart</th>
					</thead>
				</table>
				<!-- Modal -->
				<c:forEach var="p" items="${list}">
					<div class="modal fade" id="${p.productId}" tabindex="-1"
						role="dialog" aria-labelledby="myModalLabel">
						<div class="modal-dialog" role="document">
							<div class="modal-content">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal"
										aria-label="Close">
										<span aria-hidden="true">&times;</span>
									</button>
									<h2 class="modal-title" id="myModalLabel">Product Details</h2>

								</div>
								<div class="modal-body">
									<div class="col-sm-12" id="letv">
										<div class="thumbnail">
											<img src="${images}/${p.imageUrl}" alt="">
											<div class="caption">
												<h2>${p.productName}</h2>
												<h2>${p.productDescription}</h2>
												<p>${p.productPrice}</p>
												<p>
													<a href="#" class="btn btn-info btn-xs" role="button">close</a>
												</p>
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
</div>
			