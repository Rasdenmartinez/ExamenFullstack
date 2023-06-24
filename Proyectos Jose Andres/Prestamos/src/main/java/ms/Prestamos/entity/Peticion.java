package ms.Prestamos.entity;

import java.time.LocalDate;

public class Peticion {
    private LocalDate fechaActual;
    private String cliente;
    private Double tasaIVA;
    private Integer diasAñoComercial;

    public Peticion() {
    }

    public Peticion(LocalDate fechaActual, String cliente, Double tasaIVA, Integer diasAñoComercial) {
        this.fechaActual = fechaActual;
        this.cliente = cliente;
        this.tasaIVA = tasaIVA;
        this.diasAñoComercial = diasAñoComercial;
    }

    public LocalDate getFechaActual() {
        return fechaActual;
    }

    public void setFechaActual(LocalDate fechaActual) {
        this.fechaActual = fechaActual;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Double getTasaIVA() {
        return tasaIVA;
    }

    public void setTasaIVA(Double tasaIVA) {
        this.tasaIVA = tasaIVA;
    }

    public int getDiasAñoComercial() {
        return diasAñoComercial;
    }

    public void setDiasAñoComercial(int diasAñoComercial) {
        this.diasAñoComercial = diasAñoComercial;
    }
}
