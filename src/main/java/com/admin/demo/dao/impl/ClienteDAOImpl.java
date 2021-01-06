package com.admin.demo.dao.impl;

import com.admin.demo.dao.ClienteDAO;
import com.admin.demo.model.Cliente;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import java.util.List;
@Component
public class ClienteDAOImpl implements ClienteDAO {

    @Override
    public List<Cliente> findAll() throws Exception {
        return null;
    }

    @Override
    public Cliente findById(Integer id) throws Exception {
        return null;
    }

    @Override
    public Cliente save(Cliente model) throws Exception {
        return null;
    }

    @Override
    public Cliente update(Integer id, Cliente model) throws Exception {
        return null;
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        return false;
    }


}
