package com.admin.demo.repository;

import com.admin.demo.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteInterface extends JpaRepository<Cliente,Integer> {
    List<Cliente> findByNombresContainingOrApellidosContaining(String nombre, String apellido);

    @Query(value="SELECT p FROM Cliente p WHERE p.nombres LIKE :filtro OR p.apellidos LIKE :filtro")
    List<Cliente> search (@Param("filtro") String filtro);
}
