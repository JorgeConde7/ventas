package com.admin.demo.repository;

import com.admin.demo.model.Ingresos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngresosInterface extends JpaRepository<Ingresos,Integer> {
}
