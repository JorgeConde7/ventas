package com.admin.demo.service;

import com.admin.demo.model.Proveedor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProveedorService {
    List<Proveedor> listarProveedor() throws Exception;

    Proveedor guardarProveedor(Proveedor model) throws Exception;

    Proveedor actualizarProveedor(Integer id, Proveedor model) throws Exception;

    boolean eliminarProveedor(Integer id) throws Exception;
}
