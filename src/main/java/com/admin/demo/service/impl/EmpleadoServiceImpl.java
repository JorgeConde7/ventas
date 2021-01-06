package com.admin.demo.service.impl;

import com.admin.demo.model.Empleado;
import com.admin.demo.repository.EmpleadoInterface;
import com.admin.demo.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "empleadoService")
public class EmpleadoServiceImpl  implements EmpleadoService {

    @Autowired
    private EmpleadoInterface empleadoInterface;

    @Override
    public List<Empleado> buscarPorNombreorApellido(String filtro) throws Exception {
        try{
            /*List<Empleado> empleados= empleadoInterface.findByNombresContainingOrApellidosContaining(filtro,filtro);*/
            List<Empleado>empleados=empleadoInterface.BuscarPorNombreorApellido(filtro);
            return empleados;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
