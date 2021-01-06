package com.admin.demo.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Cliente implements Serializable   {


    private static final long serialVersionUID = -7035882171004975838L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCliente;
    @Column(name = "nombres")
    private String nombres;
    @Column(name="apellidos")
    private String apellidos;
    @Column(name = "dni")
    private String dni;
    @Column(name = "edad")
    private String edad;

    public Cliente(int idCliente, String nombres, String apellidos, String dni, String edad) {
        this.idCliente = idCliente;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.edad = edad;
    }

    public Cliente() {

    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
}
