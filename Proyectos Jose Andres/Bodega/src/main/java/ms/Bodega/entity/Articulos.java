package ms.Bodega.entity;

import javax.persistence.*;

@Entity
@Table(name = "articulos")
public class Articulos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "CODIGO_BARRA")
    private String codigoBarra;
    @Column(name = "PRECIO")
    private Double precio;
    @Column(name = "EXISTENCIA")
    private Long existencia;

    public Articulos() {
    }

    public Articulos(Long id, String nombre, String codigoBarra, Double precio, Long existencia) {
        this.id = id;
        this.nombre = nombre;
        this.codigoBarra = codigoBarra;
        this.precio = precio;
        this.existencia = existencia;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Long getExistencia() {
        return existencia;
    }

    public void setExistencia(Long existencia) {
        this.existencia = existencia;
    }

    @Override
    public String toString() {
        return "Articulos{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", codigoBarra='" + codigoBarra + '\'' +
                ", precio=" + precio +
                ", existencia=" + existencia +
                '}';
    }
}
