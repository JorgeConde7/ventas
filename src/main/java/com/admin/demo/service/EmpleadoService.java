package com.admin.demo.service;

import com.admin.demo.model.Empleado;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmpleadoService {
    List<Empleado> buscarPorNombreorApellido(String filtro) throws Exception;
}
