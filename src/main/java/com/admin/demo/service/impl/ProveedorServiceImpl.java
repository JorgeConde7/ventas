package com.admin.demo.service.impl;

import com.admin.demo.model.Producto;
import com.admin.demo.model.Proveedor;
import com.admin.demo.repository.ProveedorInterface;
import com.admin.demo.service.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "proveedorService")
public class ProveedorServiceImpl implements ProveedorService {

    @Autowired
    private ProveedorInterface proveedorInterface;

    @Override
    public List<Proveedor> listarProveedor() throws Exception {
        try{
            List<Proveedor> proveedors= proveedorInterface.findAll();
            return proveedors;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Proveedor guardarProveedor(Proveedor model) throws Exception {
        return null;
    }

    @Override
    public Proveedor actualizarProveedor(Integer id, Proveedor model) throws Exception {
        return null;
    }

    @Override
    public boolean eliminarProveedor(Integer id) throws Exception {
        return false;
    }
}
