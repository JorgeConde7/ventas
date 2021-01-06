package com.admin.demo.model;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Producto implements Serializable {
    private static final long serialVersionUID = -2986354000998151219L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProducto;
    @Column(name="codigoProducto")
    private String codigoProducto;
    @Column(name="nombre")
    private String nombre;
    @Column(name = "precioUnitario")
    private String precioUnitario;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "idMarca")
    private MarcaProducto marca;
    @ManyToOne
    @JoinColumn(name="idProveedor")
    private Proveedor proveedor;
    @Column(name="stock")
    private String stock;
    @OneToMany(mappedBy = "producto",fetch = FetchType.EAGER,cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Ingresos>ingresos;


    public Producto() {
    }

    public Producto(int idProducto, String codigoProducto, String nombre, String precioUnitario, MarcaProducto marca, Proveedor proveedor, String stock, List<Ingresos> ingresos) {
        this.idProducto = idProducto;
        this.codigoProducto = codigoProducto;
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.marca = marca;
        this.proveedor = proveedor;
        this.stock = stock;
        this.ingresos = ingresos;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(String precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public MarcaProducto getMarca() {
        return marca;
    }

    public void setMarca(MarcaProducto marca) {
        this.marca = marca;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public List<Ingresos> getIngresos() {
        return ingresos;
    }

    public void setIngresos(List<Ingresos> ingresos) {
        this.ingresos = ingresos;
    }
}
