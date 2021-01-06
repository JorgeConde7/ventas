package com.admin.demo.dao;

import com.admin.demo.model.Cliente;
import org.springframework.stereotype.Component;


import java.util.List;
@Component
public interface ClienteDAO {
    List<Cliente> findAll() throws Exception;
    Cliente findById(Integer id) throws Exception;

    Cliente save(Cliente model) throws Exception;

    Cliente update(Integer id, Cliente model) throws Exception;

    boolean delete(Integer id) throws Exception;


}
