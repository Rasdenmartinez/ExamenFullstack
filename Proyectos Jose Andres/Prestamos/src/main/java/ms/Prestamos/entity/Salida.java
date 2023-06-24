package ms.Prestamos.entity;

public class Salida {
    private String cliente;
    private Integer plazo;
    private Double tasaInteres;
    private Double monto;
    private Double interes;
    private Double iva;
    private Double pago;

    public Salida() {
    }

    public Salida(String cliente, Integer plazo, Double tasaInteres, Double monto, Double interes, Double iva, Double pago) {
        this.cliente = cliente;
        this.plazo = plazo;
        this.tasaInteres = tasaInteres;
        this.monto = monto;
        this.interes = interes;
        this.iva = iva;
        this.pago = pago;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Integer getPlazo() {
        return plazo;
    }

    public void setPlazo(Integer plazo) {
        this.plazo = plazo;
    }

    public Double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(Double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Double getInteres() {
        return interes;
    }

    public void setInteres(Double interes) {
        this.interes = interes;
    }

    public Double getIva() {
        return iva;
    }

    public void setIva(Double iva) {
        this.iva = iva;
    }

    public Double getPago() {
        return pago;
    }

    public void setPago(Double pago) {
        this.pago = pago;
    }

    @Override
    public String toString() {
        return "Salida{" +
                "cliente='" + cliente + '\'' +
                ", plazo=" + plazo +
                ", tasaInteres=" + tasaInteres +
                ", monto=" + monto +
                ", interes=" + interes +
                ", iva=" + iva +
                ", pago=" + pago +
                '}';
    }
}
