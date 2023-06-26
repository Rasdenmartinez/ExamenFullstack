package ms.Bodega.entity;
import javax.persistence.*;

@Entity
@Table(name = "ticket")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "articulo")
    private String articulo;

    @Column(name = "precio_unidad")
    private Double precioUnidad;

    @Column(name = "precio_total_producto")
    private Double precioTotalProducto;

    @Column(name = "total_venta")
    private Double totalVenta;

    @Column(name = "pago_cliente")
    private Double pagoCliente;

    @Column(name = "cambio")
    private Double cambio;

    public Ticket() {
    }

    public Ticket(Long id, String articulo, Double precioUnidad, Double precioTotalProducto, Double totalVenta, Double pagoCliente, Double cambio) {
        this.id = id;
        this.articulo = articulo;
        this.precioUnidad = precioUnidad;
        this.precioTotalProducto = precioTotalProducto;
        this.totalVenta = totalVenta;
        this.pagoCliente = pagoCliente;
        this.cambio = cambio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public Double getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(Double precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public Double getPrecioTotalProducto() {
        return precioTotalProducto;
    }

    public void setPrecioTotalProducto(Double precioTotalProducto) {
        this.precioTotalProducto = precioTotalProducto;
    }

    public Double getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(Double totalVenta) {
        this.totalVenta = totalVenta;
    }

    public Double getPagoCliente() {
        return pagoCliente;
    }

    public void setPagoCliente(Double pagoCliente) {
        this.pagoCliente = pagoCliente;
    }

    public Double getCambio() {
        return cambio;
    }

    public void setCambio(Double cambio) {
        this.cambio = cambio;
    }
    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", articulo='" + articulo + '\'' +
                ", precioUnidad=" + precioUnidad +
                ", precioTotalProducto=" + precioTotalProducto +
                ", totalVenta=" + totalVenta +
                ", pagoCliente=" + pagoCliente +
                ", cambio=" + cambio +
                '}';
    }
}