package com.admin.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class MarcaProducto implements Serializable {
    private static final long serialVersionUID = -56728186963767651L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMarca;
    @Column(name = "nombre")
    private String nombre;
    @JsonIgnore
    @OneToMany(mappedBy = "marca",fetch = FetchType.EAGER)
    private List<Producto> productos =new ArrayList<Producto>();

    public MarcaProducto() {
    }

    public MarcaProducto(int idMarca, String nombre, List<Producto> productos) {
        this.idMarca = idMarca;
        this.nombre = nombre;
        this.productos = productos;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}
