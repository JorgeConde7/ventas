$(document).ready( function () {
    $('#tablaPersonas').DataTable({
        "columnDefs":[{
            "targets": -1,
            "data":null,
            "defaultContent": ""
        }],

        //Para cambiar el lenguaje a español
        "language": {
            "lengthMenu": "Mostrar _MENU_ registros",
            "zeroRecords": "No se encontraron resultados",
            "info": "Mostrando registros del _START_ al _END_ de un total de _TOTAL_ registros",
            "infoEmpty": "Mostrando registros del 0 al 0 de un total de 0 registros",
            "infoFiltered": "(filtrado de un total de _MAX_ registros)",
            "sSearch": "Buscar:",
            "oPaginate": {
                "sFirst": "Primero",
                "sLast":"Último",
                "sNext":"Siguiente",
                "sPrevious": "Anterior"
            },
            "sProcessing":"Procesando...",
        }
    });

    $("#btnNuevoCliente").click(function(){
        $("#formPersonas").trigger("reset");
        $(".modal-header").css("background-color", "#28a745");
        $(".modal-header").css("color", "white");
        $(".modal-title").text("Nuevo Cliente");
        $("#modalCRUD").modal("show");
        id=null;
        opcion = 1; //alta
    });

    $("#btnNuevoEmpleado").click(function(){
        $("#formEmpleado").trigger("reset");
        $(".modal-header").css("background-color", "#28a745");
        $(".modal-header").css("color", "white");
        $(".modal-title").text("Nuevo Empleado");
        $("#modalEmpleado").modal("show");
        id=null;
        opcion = 1; //alta
    });

    $("#btnNuevoProducto").click(function(){
        $("#formProducto").trigger("reset");
        $(".modal-header").css("background-color", "#28a745");
        $(".modal-header").css("color", "white");
        $(".modal-title").text("Nuevo Producto");
        $("#modalProducto").modal("show");
        id=null;
        opcion = 1; //alta
    });
} );
