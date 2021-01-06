package com.admin.demo.service.impl;

import com.admin.demo.model.Boleta;
import com.admin.demo.repository.BoletaInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class BoletaServiceImpl {

    @Autowired
    BoletaInterface boletaInterface;

    public List<Boleta> findAll(){
        return boletaInterface.findAll();
    }
}
