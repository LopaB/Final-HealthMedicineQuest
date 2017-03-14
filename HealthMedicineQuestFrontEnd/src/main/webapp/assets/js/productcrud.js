$(document).ready(function() {
$('#mycrudTable').DataTable( {
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
        { data: 'productPrice' },
        { data: 'productQuantity' },
        { data: null,
            mRender: function ( data, type, row ) {
               return '<img src="/HealthMedicineQuestFrontEnd/resources/images/'+ row.imageUrl +'" height="50" width="50">'; }
        },
        {data: null,
             mRender: function ( data, type, row ) {
                return '<a href="/HealthMedicineQuestFrontEnd/admin/update/'+row.productId+'" role="button" class="btn btn-primary btn-md"><span class="glyphicon glyphicon-edit"></span></a>';}
        },
        {data: null,
             mRender: function ( data, type, row ) {
                 return '<a  class="btn btn-warning btn-md" href="/HealthMedicineQuestFrontEnd/delete/'+row.productId+'/productD" role="button"><span class="glyphicon glyphicon-trash"></span></a>';}
        }
    ]
});
});
