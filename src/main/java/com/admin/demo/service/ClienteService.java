package com.admin.demo.service;

import com.admin.demo.model.Cliente;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClienteService {

    List<Cliente> listarCliente() throws Exception;
    Cliente findById(Integer id) throws Exception;

    Cliente save(Cliente model) throws Exception;

    Cliente update(Integer id, Cliente model) throws Exception;

    boolean delete(Integer id) throws Exception;


}
