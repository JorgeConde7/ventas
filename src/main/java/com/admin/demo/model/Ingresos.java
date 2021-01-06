package com.admin.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Ingresos implements Serializable {
    private static final long serialVersionUID = 118095482568681135L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idIngreso;
    @Column(name="fecha")
    private Date fecha;
    @Column(name = "cantidad")
    private int cantidad;
    @JsonIgnore
    @ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
    @JoinColumn(name = "idProducto")
    private Producto producto;

    public Ingresos() {
    }

    public Ingresos(int idIngreso, Date fecha, int cantidad, Producto producto) {
        this.idIngreso = idIngreso;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public int getIdIngreso() {
        return idIngreso;
    }

    public void setIdIngreso(int idIngreso) {
        this.idIngreso = idIngreso;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
