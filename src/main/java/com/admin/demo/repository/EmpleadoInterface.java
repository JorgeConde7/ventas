package com.admin.demo.repository;

import com.admin.demo.model.Cliente;
import com.admin.demo.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpleadoInterface  extends JpaRepository<Empleado,Integer> {

    List<Empleado> findByNombresContainingOrApellidosContaining(String nombre, String apellido);

    @Query(value="SELECT p FROM Empleado p WHERE p.nombres LIKE %:filtro% OR p.apellidos LIKE %:filtro%")
    List<Empleado> BuscarPorNombreorApellido (@Param("filtro") String filtro);
}
