package com.admin.demo.repository;

import com.admin.demo.model.Boleta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoletaInterface  extends JpaRepository<Boleta,Integer> {


}
