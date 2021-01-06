package com.admin.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;

@Entity
public class Login {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idlogin;
    @Column(name = "usuario")
    private String usuario;
    @Column(name="contrasena")
    private String contrasena;
    @JsonIgnore
    @OneToOne(mappedBy ="login" )
    private Empleado empleado;

    public Login() {
    }

    public Login(int idlogin, String usuario, String contrasena, Empleado empleado) {
        this.idlogin = idlogin;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.empleado = empleado;
    }

    public int getIdlogin() {
        return idlogin;
    }

    public void setIdlogin(int idlogin) {
        this.idlogin = idlogin;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
}
