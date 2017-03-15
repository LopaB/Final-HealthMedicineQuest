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
        { data: 'productCategory' },
        { "data": "",
            "render":function(data,type,row)
            {
             return "&#8377; "+row.productPrice+"";
          }  
          
          },
        { data: null,
            mRender: function ( data, type, row ) {
               return '<img src="/HealthMedicineQuestFrontEnd/resources/images/'+ row.imageUrl +'" height="50" width="50">'; }
        },
        {data: null,
             mRender: function ( data, type, row ) {
                return '<a href="/HealthMedicineQuestFrontEnd/user/'+row.productId+'/singleproduct" role="button" class="btn btn-primary btn-md" data-toggle="" data-target="#'+row.productId+'">View Item</a>';}
        }
        /*,
        {data: null,
             mRender: function ( data, type, row ) {
                return '<a class="btn btn-primary btn-md" href="/HealthMedicineQuestFrontEnd/user/'+row.productId+'">Add To Cart</a>';}
        }*/
    ]
} );
});
