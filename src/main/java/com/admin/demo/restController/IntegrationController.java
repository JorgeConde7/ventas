package com.admin.demo.restController;

import com.admin.demo.model.*;
import com.admin.demo.repository.*;
import com.admin.demo.service.ClienteService;
import com.admin.demo.service.EmpleadoService;
import com.admin.demo.service.ProductoService;
import com.admin.demo.service.ProveedorService;
import com.admin.demo.service.impl.EmpleadoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/rest-v1")
public class IntegrationController {

    @Autowired
    private ClienteService clienteService;
    @Autowired
    private EmpleadoService empleadoService;
    @Autowired
    private ProductoService productoService;
    @Autowired
    private ProveedorService proveedorService;
    @Autowired
    private BoletaInterface boletaInterface;
    @Autowired
    private MarcaProductoInterface marcaProductoInterface;

    @GetMapping("listar-clientes")
    public ResponseEntity<?>listarCliente(){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(clienteService.listarCliente());
        }catch (Exception e){
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"Error\"*:\"Error. Por favor intente mas tarde.\"}");
        }
    }
    @GetMapping("listar-clientes/{id}")
    public ResponseEntity<?> getOne(@PathVariable Integer id){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(clienteService.findById(id));
        }catch (Exception e){
            return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"Error\"*:\"Error. Por favor intente mas tarde.\"}");
        }
    }

    @PostMapping("guardar-cliente")
    public ResponseEntity<?> save (@RequestBody  Cliente model){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(clienteService.save(model));
        }catch (Exception e){
            return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"Error\"*:\"Error. Por favor intente mas tarde.\"}");
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> actualizar(@PathVariable Integer id,@RequestBody Cliente cliente){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(clienteService.update(id,cliente));
        }catch (Exception e){
            return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"Error\"*:\"Error. Por favor intente mas tarde.\"}");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete( @PathVariable Integer id){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(clienteService.delete(id));
        }catch (Exception e){
            return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"Error\"*:\"Error. Por favor intente mas tarde.\"}");
        }
    }
    /*Clientes end*/

    @GetMapping("buscar-empleado")
    public ResponseEntity<?> buscar (@RequestParam String filtro){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(empleadoService.buscarPorNombreorApellido(filtro));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"Error\"*:\"Error. Por favor intente mas tarde.\"}");
        }
    }

    @GetMapping("listar-empleados")
    public ResponseEntity<?> listarEmpleados(){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(empleadoService.listarEmpleado());
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"Error\"*:\"Error. Por favor intente mas tarde.\"}");
        }
    }

    @PostMapping("guardar-empleado")
    public ResponseEntity<?> guardarEmpleado (@RequestBody  Empleado empleado){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(empleadoService.guardarEmpleado(empleado));
        }catch (Exception e){
            return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"Error\"*:\"Error. Por favor intente mas tarde.\"}");
        }
    }

    @GetMapping("/listar-productos")
    public ResponseEntity<?> listarProductos(){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(productoService.listarProducto());
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"Error\"*:\"Error. Por favor intente mas tarde.\"}");
        }
    }

    @GetMapping("/listar-proveedores")
    public ResponseEntity<?> listarProveedores(){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(proveedorService.listarProveedor());
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"Error\"*:\"Error. Por favor intente mas tarde.\"}");
        }
    }


    @GetMapping("/listar-boletas")
    public List<Boleta> ListarBoletas(){return boletaInterface.findAll();}


    @GetMapping("/listar-marcas")
    public List<MarcaProducto> listarMarcas(){return marcaProductoInterface.findAll();}
}
