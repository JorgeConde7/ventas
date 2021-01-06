package com.admin.demo.model;

import com.admin.demo.enums.Cargo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Empleado implements Serializable {
    private static final long serialVersionUID = 4785291548569136001L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEmpleado;
    @Column(name = "nombres")
    private String nombres;
    @Column(name="apellidos")
    private String apellidos;
    @Column(name = "dni")
    private String dni;
    @Column(name = "edad")
    private String edad;
    @Column(name="celular")
    private String celular;
    @Column (name="direccion")
    private String direccion;
    @Enumerated(EnumType.STRING)
    private Cargo cargo;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idlogin")
    private Login login;


    public Empleado() {
    }

    public Empleado(int idEmpleado, String nombres, String apellidos, String dni, String edad, String celular, String direccion, Cargo cargo, Login login) {
        this.idEmpleado = idEmpleado;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.edad = edad;
        this.celular = celular;
        this.direccion = direccion;
        this.cargo = cargo;
        this.login = login;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
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

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }
}
