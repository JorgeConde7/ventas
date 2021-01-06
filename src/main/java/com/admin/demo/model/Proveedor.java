package com.admin.demo.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Proveedor implements Serializable {
    private static final long serialVersionUID = 2392825773345568002L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProvedor;
    @Column(name = "nombreProveedor")
    private String nombreProveedor;
    @Column(name="nombreContacto")
    private String nombreContacto;
    @Column(name = "ruc")
    private String ruc;
    @Column(name="telefono")
    private String telefono;

    public Proveedor(int idProvedor, String nombreProveedor, String nombreContacto, String ruc, String telefono) {
        this.idProvedor = idProvedor;
        this.nombreProveedor = nombreProveedor;
        this.nombreContacto = nombreContacto;
        this.ruc = ruc;
        this.telefono = telefono;
    }

    public Proveedor() {
    }

    public int getIdProvedor() {
        return idProvedor;
    }

    public void setIdProvedor(int idProvedor) {
        this.idProvedor = idProvedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
