package com.admin.demo.service.impl;

import com.admin.demo.dao.ClienteDAO;
import com.admin.demo.model.Boleta;
import com.admin.demo.model.Cliente;
import com.admin.demo.repository.ClienteInterface;
import com.admin.demo.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service(value = "clienteService")
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteInterface clienteInterface;

    @Override
    @Transactional
    public List<Cliente> listarCliente() throws Exception{
        try{
            List<Cliente> clientes= clienteInterface.findAll();
            return clientes;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Cliente findById(Integer id)throws Exception {
        try{
            Optional<Cliente> clienteOptional= clienteInterface.findById(id);
            return clienteOptional.get();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Cliente save(Cliente model) throws Exception{
        try{
            model=clienteInterface.save(model);
            return model;

        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Cliente update(Integer id, Cliente model)throws Exception {
        try{
            Optional<Cliente> clienteOptional= clienteInterface.findById(id);
            Cliente cliente= clienteOptional.get();
            cliente=clienteInterface.save(model);
            return cliente;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(Integer id)throws Exception {
        try {
            if (clienteInterface.existsById(id)) {
                clienteInterface.deleteById(id);
                return true;
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}





