$(document).ready(function() {
$('#myDataTable').DataTable( {
       "lengthMenu": [[1, 3, -1], [1, 3, "All"]],
ajax: {
               url: '/HealthMedicineQuestFrontEnd/allproducts',
               dataSrc: ''
           },
    columns: [
        { data: 'productId' },
        { data: 'productName' },
        { data: 'productDescription' },
        { data: 'productPrice' },
        { data: null,
            mRender: function ( data, type, row ) {
               return '<img src="/HealthMedicineQuestFrontEnd/resources/images/'+ row.imageUrl +'" height="50" width="50">'; }
        },
        {data: null,
             mRender: function ( data, type, row ) {
                return '<a href="#" role="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#'+row.productId+'">View Item</a>';}
        },
        {data: null,
             mRender: function ( data, type, row ) {
                return '<a class="btn btn-primary" href="'+data+'">Add To Cart</a>';}
        }
    ]
} );
});
