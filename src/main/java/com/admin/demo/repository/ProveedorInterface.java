package com.admin.demo.repository;

import com.admin.demo.model.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProveedorInterface extends JpaRepository<Proveedor,Integer> {
}
