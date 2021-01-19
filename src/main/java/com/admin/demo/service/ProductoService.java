package com.admin.demo.service;

import com.admin.demo.model.Producto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductoService {

    List<Producto> listarProducto() throws Exception;

    Producto guardarProducto(Producto model) throws Exception;

    Producto actualizarProducto(Integer id, Producto model) throws Exception;

    boolean eliminarProducto(Integer id) throws Exception;

}
