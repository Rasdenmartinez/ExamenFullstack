package ms.Prestamos.entity;

import javax.persistence.*;
@Entity
@Table(name = "tasas")
public class Tasas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "PLAZO_MIN")
    private Integer plazoMin;
    @Column(name = "PLAZO_MAX")
    private  Integer plazoMax;
    @Column(name = "TASA_INTERES")
    private Double tasaInteres;

    public Tasas() {

    }

    public Tasas(Long id, Integer plazoMin, Integer plazoMax, Double tasaInteres) {
        this.id = id;
        this.plazoMin = plazoMin;
        this.plazoMax = plazoMax;
        this.tasaInteres = tasaInteres;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPlazoMin() {
        return plazoMin;
    }

    public void setPlazoMin(Integer plazoMin) {
        this.plazoMin = plazoMin;
    }

    public Integer getPlazoMax() {
        return plazoMax;
    }

    public void setPlazoMax(Integer plazoMax) {
        this.plazoMax = plazoMax;
    }

    public Double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(Double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    @Override
    public String toString() {
        return "Tasas{" +
                "id=" + id +
                ", plazoMin=" + plazoMin +
                ", plazoMax=" + plazoMax +
                ", tasaInteres=" + tasaInteres +
                '}';
    }
}
