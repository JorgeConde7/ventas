package com.admin.demo.repository;

import com.admin.demo.model.MarcaProducto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarcaProductoInterface extends JpaRepository<MarcaProducto,Integer> {
}
