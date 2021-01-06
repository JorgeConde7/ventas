package com.admin.demo.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Boleta implements Serializable {

    private static final long serialVersionUID = 891993497965219926L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numBoleta;
    @ManyToOne
    @JoinColumn(name="idCliente")
    private Cliente cliente;
    @ManyToOne
    @JoinColumn(name="idEmpleado")
    private Empleado empleado;
    @Column(name="fechaBoleta")
    private Date fechaBoleta;
    @Column(name="precioTotal")
    private float precioTotal;

    public Boleta() {
    }

    public Boleta(int numBoleta, Cliente cliente, Empleado empleado, Date fechaBoleta, float precioTotal) {
        this.numBoleta = numBoleta;
        this.cliente = cliente;
        this.empleado = empleado;
        this.fechaBoleta = fechaBoleta;
        this.precioTotal = precioTotal;
    }

    public int getNumBoleta() {
        return numBoleta;
    }

    public void setNumBoleta(int numBoleta) {
        this.numBoleta = numBoleta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Date getFechaBoleta() {
        return fechaBoleta;
    }

    public void setFechaBoleta(Date fechaBoleta) {
        this.fechaBoleta = fechaBoleta;
    }

    public float getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(float precioTotal) {
        this.precioTotal = precioTotal;
    }
}
