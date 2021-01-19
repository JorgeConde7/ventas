$(document).ready( function () {
    listarCliente();
    guardarCliente();
    obtenerDatoCliente();
    EliminarCliente();

    listarEmpleado();
    obtenerDatoEmpleado();

    listarProducto();
    listarProveedor();


    $("#idCliente").attr('disabled', true);

    $("#btnNuevoCliente").click(function(){
        estiloModal();
        $(".modal-title").text("Nuevo Cliente");
        $("#modalCliente").modal("show");
    });

    $("#btnNuevoEmpleado").click(function(){
        estiloModal();
        $(".modal-title").text("Nuevo Empleado");
        $("#modalEmpleado").modal("show");
    });

    $("#btnNuevoProducto").click(function(){
        estiloModal();
        $(".modal-title").text("Nuevo Producto");
        $("#modalProducto").modal("show");
    });

    $("#btnNuevoProveedor").click(function(){
        estiloModal();
        $(".modal-title").text("Nuevo Proveedor");
        $("#modalProveedor").modal("show");
    });

    $("#btnCancelar").click(function (){
        $("#modalCliente").modal("hide");
        $("#modalEmpleado").modal("hide");
    });
    $("#btnCancelarEliminar").click(function (){
        $("#modalEliminarCliente").modal("hide");
        $("#modalEliminarEmpleado").modal("hide");
    });

});

var tablaCliente;
var tablaEmpleado;

var listarCliente=function () {
      tablaCliente=$('#tablaCliente').DataTable({
        "destroy":true,
        "responsive": true,
        "autoWidth": false,
        "ajax": {
            type: "GET",
            url: "http://localhost:8080/rest-v1/listar-clientes",
            dataType: "json",
            dataSrc: ""
        },
        "columns": [
            {data: "nombres"}, {data: "apellidos"}, {data: "dni"}, {data: "edad"},
            {
                "defaultContent":"<div class='text-center'> " +
                    "<div class='acciones'>" +
                    "<a class='btn btn-warning editar' style='padding: 0 10px'><i class='ion-edit'></i></a>" +
                    "<a class='btn btn-danger eliminar' style='padding: 0 10px'><i class='ion-trash-a'></i></a>" +
                    "</div>" +
                    "</div>"
            }
        ],
        "language": idioma_espanol,


    });

}

var obtenerDatoCliente=function (){
    $("#tablaCliente tbody").on("click", "a.editar",function (){
        var data=tablaCliente.row($(this).parents("tr")).data();
        console.log(data);
        $(".modal-header").css("background-color", "#007bff");
        $(".modal-header").css("color", "white");
        $(".modal-title").text("Editar Cliente");
        $("#modalCliente").modal("show");

        $("#idCliente").val(data.idCliente);
        $("#nombres").val(data.nombres);
        $("#apellidos").val(data.apellidos);
        $("#dni").val(data.dni);
        $("#edad").val(data.edad);



    });
}

var guardarCliente=function (){
    $("#formCliente").submit(function (e) {
        e.preventDefault();
        var id= $("#idCliente").val();
        var nombres=$("#nombres").val();
        var apellidos=$("#apellidos").val();
        var dni=$("#dni").val();
        var edad=$("#edad").val();

        let jsonData={
            "idCliente":id,
            "nombres": nombres,
            "apellidos":apellidos,
            "dni":dni,
            "edad":edad
        }
        let methodType=(id==0)?"POST":"PUT";
        let url_type = (id==0)?"http://localhost:8080/rest-v1/guardar-cliente":`http://localhost:8080/rest-v1/${id}`;

        console.log(jsonData);
        $.ajax({
            type: methodType,
            contentType: "application/json; charset=utf-8",
            url: url_type,
            dataType:"json",
            processData: false,
            data: JSON.stringify(jsonData)
        })
        listarCliente();
        $("#modalCliente").modal("hide");
    });
}


var EliminarCliente=function (){
    let idCliente=0;

    $("#tablaCliente tbody").on("click", "a.eliminar",function (){
        var data=tablaCliente.row($(this).parents("tr")).data();
        $("#modalEliminarCliente").modal("show");
        $(".modal-header").css("background-color", "#fff");
        $(".modal-header").css("color", "black");
        idCliente=data.idCliente;

    });

    $("#btnAceptarEliminar").on("click",function (){
        $.ajax({
            type: "DELETE",
            url: `http://localhost:8080/rest-v1/${idCliente}`,
            contentType: "application/json; charset=utf-8",
            dataType: "json",
        })
        $("#modalEliminarCliente").modal("hide");

        console.log(idCliente);
        listarCliente();

    });
}


var listarEmpleado=function () {
    tablaEmpleado=$('#tablaEmpleado').DataTable({
        "destroy":true,
        "responsive": true,
        "autoWidth": false,
        "ajax": {
            type: "GET",
            url: "http://localhost:8080/rest-v1/listar-empleados",
            dataType: "json",
            dataSrc: ""
        },
        "columns": [
            {data: "nombres"}, {data: "apellidos"}, {data: "dni"}, {data: "edad"}, {data:"celular"}, {data:"direccion"}, {data:"cargo"},
            {
                "defaultContent": "<div class='text-center'>" +
                    "<div class='acciones'>" +
                    "<a class='btn btn-warning editar' style='padding: 0 10px'><i class='ion-edit'></i> </a>" +
                    "<a class='btn btn-danger eliminar' style='padding: 0 10px'><i class='ion-trash-a'></i> </a>" +
                    "</div>" +
                    "</div>"
            }
        ],
        "language": idioma_espanol
    });
}

var obtenerDatoEmpleado=function (){
    $("#tablaEmpleado tbody").on("click", "a.editar",function (){
        var data=tablaEmpleado.row($(this).parents("tr")).data();
        console.log(data);
        $(".modal-header").css("background-color", "#007bff");
        $(".modal-header").css("color", "white");
        $(".modal-title").text("Editar Empleado");
        $("#modalEmpleado").modal("show");

        $("#idCliente").val(data.idEmpleado);
        $("#nombres").val(data.nombres);
        $("#apellidos").val(data.apellidos);
        $("#dni").val(data.dni);
        $("#edad").val(data.edad);
        $("#celular").val(data.celular);
        $("#direccion").val(data.direccion);
        $("#cargo").val(data.cargo);

    });
}

var guardarEmpleado=function (){
    $("#formCliente").submit(function (e) {
        e.preventDefault();
        var id= $("#idCliente").val();
        var nombres=$("#nombres").val();
        var apellidos=$("#apellidos").val();
        var dni=$("#dni").val();
        var edad=$("#edad").val();

        let jsonData={
            "idCliente":id,
            "nombres": nombres,
            "apellidos":apellidos,
            "dni":dni,
            "edad":edad
        }
        let methodType=(id==0)?"POST":"PUT";
        let url_type = (id==0)?"http://localhost:8080/rest-v1/guardar-cliente":`http://localhost:8080/rest-v1/${id}`;

        console.log(jsonData);
        $.ajax({
            type: methodType,
            contentType: "application/json; charset=utf-8",
            url: url_type,
            dataType:"json",
            processData: false,
            data: JSON.stringify(jsonData)
        })
        listarCliente();
        $("#modalCliente").modal("hide");
    });
}

var listarProducto=function () {
    $('#tablaProducto').DataTable({
        responsive: true,
        autoWidth: false,
        "ajax": {
            type: "GET",
            url: "http://localhost:8080/rest-v1/listar-productos",
            dataType: "json",
            dataSrc: ""
        },
        "columns": [
            {data: "codigoProducto"}, {data: "nombre"}, {data: "precioUnitario"}, {data: "marca.nombre"}, {data:"proveedor.nombreProveedor"}, {data:"stock"},
            {
                "defaultContent": "<div class='text-center'>" +
                    "<div class='acciones'>" +
                    "<a class=\"btn btn-warning\" style='padding: 0 10px'><i class=\"ion-edit\"></i> </a>" +
                    "<a class=\"btn btn-danger\" style='padding: 0 10px'><i class=\"ion-trash-a\"></i> </a>" +
                    "</div>" +
                    "</div>"
            }
        ],
        "language": idioma_espanol
    });
}

var listarProveedor=function () {
    $('#tablaProveedor').DataTable({
        responsive: true,
        autoWidth: false,
        "ajax": {
            type: "GET",
            url: "http://localhost:8080/rest-v1/listar-proveedores",
            dataType: "json",
            dataSrc: ""
        },
        "columns": [
            {data: "nombreProveedor"}, {data: "nombreContacto"}, {data: "ruc"}, {data: "telefono"},
            {
                "defaultContent": "<div class='text-center'>" +
                    "<div class='acciones'>" +
                    "<a class=\"btn btn-warning\" style='padding: 0 10px'><i class=\"ion-edit\"></i> </a>" +
                    "<a class=\"btn btn-danger\" style='padding: 0 10px'><i class=\"ion-trash-a\"></i> </a>" +
                    "</div>" +
                    "</div>"
            }
        ],
        "language": idioma_espanol
    });
}

var idioma_espanol={
    "lengthMenu": "Mostrar _MENU_ registros",
    "zeroRecords": "No se encontraron resultados",
    "info": "Mostrando registros del _START_ al _END_ de un total de _TOTAL_ registros",
    "infoEmpty": "Mostrando registros del 0 al 0 de un total de 0 registros",
    "infoFiltered": "(filtrado de un total de _MAX_ registros)",
    "sSearch": "Buscar:",
    "oPaginate": {
        "sFirst": "Primero",
        "sLast": "Último",
        "sNext": "Siguiente",
        "sPrevious": "Anterior"
    },
    "sProcessing": "Procesando...",
}

var estiloModal=function (){
    $("#formCliente").trigger("reset");
    $(".modal-header").css("background-color", "#28a745");
    $(".modal-header").css("color", "white");
}
function mostrarPassword(){
    var cambio = document.getElementById("contraseña");
    if(cambio.type == "password"){
        cambio.type = "text";
        $('.icon').removeClass('fa fa-eye-slash').addClass('fa fa-eye');
    }else{
        cambio.type = "password";
        $('.icon').removeClass('fa fa-eye').addClass('fa fa-eye-slash');
    }
}