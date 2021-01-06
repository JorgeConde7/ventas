package com.admin.demo.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class DetalleBoleta implements Serializable {

    private static final long serialVersionUID = -1963261804446674314L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDetalleBoleta;
    @ManyToOne
    @JoinColumn(name="numBoleta")
    private Boleta boleta;
    @OneToOne
    @JoinColumn(name="idProducto")
    private Producto producto;
    @Column(name = "cantidad")
    private int cantidad;

    public DetalleBoleta() {
    }

    public DetalleBoleta(int idDetalleBoleta, Boleta boleta, Producto producto, int cantidad) {
        this.idDetalleBoleta = idDetalleBoleta;
        this.boleta = boleta;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public int getIdDetalleBoleta() {
        return idDetalleBoleta;
    }

    public void setIdDetalleBoleta(int idDetalleBoleta) {
        this.idDetalleBoleta = idDetalleBoleta;
    }

    public Boleta getBoleta() {
        return boleta;
    }

    public void setBoleta(Boleta boleta) {
        this.boleta = boleta;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
