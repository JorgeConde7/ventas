package com.admin.demo.dto;

import com.admin.demo.enums.Cargo;

import javax.persistence.Column;
import javax.persistence.Enumerated;


public class EmpleadoDTO {
    private int idEmpleado;
    private String nombres;
    private String apellidos;
    private String dni;
    private String edad;
    private String celular;
    private String direccion;
    private Cargo cargo;

}
