package com.admin.demo.service.impl;

import com.admin.demo.model.Empleado;
import com.admin.demo.model.Producto;
import com.admin.demo.repository.ProductoInterface;
import com.admin.demo.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service(value = "productoService")
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoInterface productoInterface;

    @Override
    @Transactional
    public List<Producto> listarProducto() throws Exception {
        try{
            List<Producto> productos= productoInterface.findAll();
            return productos;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Producto guardarProducto(Producto model) throws Exception {
        return null;
    }

    @Override
    @Transactional
    public Producto actualizarProducto(Integer id, Producto model) throws Exception {
        return null;
    }

    @Override
    @Transactional
    public boolean eliminarProducto(Integer id) throws Exception {
        return false;
    }
}
