package com.admin.demo.service.impl;

import com.admin.demo.model.Empleado;
import com.admin.demo.repository.EmpleadoInterface;
import com.admin.demo.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service(value = "empleadoService")
public class EmpleadoServiceImpl  implements EmpleadoService {

    @Autowired
    private EmpleadoInterface empleadoInterface;

    @Override
    @Transactional
    public List<Empleado> buscarPorNombreorApellido(String filtro) throws Exception {
        try{
            /*List<Empleado> empleados= empleadoInterface.findByNombresContainingOrApellidosContaining(filtro,filtro);*/
            List<Empleado>empleados=empleadoInterface.BuscarPorNombreorApellido(filtro);
            return empleados;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public List<Empleado> listarEmpleado() throws Exception {
        try{
            List<Empleado> empleados= empleadoInterface.findAll();
            return empleados;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }

    }

    @Override
    @Transactional
    public Empleado guardarEmpleado(Empleado empleado) throws Exception {
        try{
            empleado=empleadoInterface.save(empleado);
            return empleado;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Empleado actualizarEmpleado(Integer id, Empleado model) throws Exception {
        try{
            return null;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean eliminarEmpleado(Integer id) throws Exception {
        try{
            return true;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

}
