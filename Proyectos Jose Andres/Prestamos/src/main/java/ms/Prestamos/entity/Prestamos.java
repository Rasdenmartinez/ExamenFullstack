package ms.Prestamos.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "prestamos")
public class Prestamos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "CLIENTE")
    private String cliente;
    @Column(name = "FECHA")
    private LocalDate fecha;
    @Column(name = "MONTO")
    private Double monto;
    @Column(name = "ESTADO")
    private Boolean estado;

    public Prestamos() {
    }

    public Prestamos(Long id, String cliente, LocalDate fecha, Double monto, Boolean estado) {
        this.id = id;
        this.cliente = cliente;
        this.fecha = fecha;
        this.monto = monto;
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Prestamos{" +
                "id=" + id +
                ", cliente='" + cliente + '\'' +
                ", fecha=" + fecha +
                ", monto=" + monto +
                ", estado=" + estado +
                '}';
    }
}
