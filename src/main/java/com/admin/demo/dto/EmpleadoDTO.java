package com.admin.demo.dto;

import com.admin.demo.enums.Cargo;

import javax.persistence.Column;
import javax.persistence.Enumerated;


public class EmpleadoDTO {
    @Column(name = "nombres")
    private String nombres;
    @Column(name="apellidos")
    private String apellidos;
    @Column(name = "dni")
    private String dni;

}
