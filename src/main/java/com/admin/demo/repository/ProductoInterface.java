package com.admin.demo.repository;

import com.admin.demo.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoInterface extends JpaRepository<Producto,Integer> {
}
