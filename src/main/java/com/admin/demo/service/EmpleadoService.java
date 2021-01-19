package com.admin.demo.service;



import com.admin.demo.model.Empleado;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmpleadoService {
    List<Empleado> buscarPorNombreorApellido(String filtro) throws Exception;

    List<Empleado> listarEmpleado() throws Exception;

    Empleado guardarEmpleado(Empleado model) throws Exception;

    Empleado actualizarEmpleado(Integer id, Empleado model) throws Exception;

    boolean eliminarEmpleado(Integer id) throws Exception;
}
