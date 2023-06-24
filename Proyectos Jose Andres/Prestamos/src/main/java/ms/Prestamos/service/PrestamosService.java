package ms.Prestamos.service;

import ms.Prestamos.entity.Peticion;
import ms.Prestamos.entity.Prestamos;
import ms.Prestamos.entity.Salida;
import ms.Prestamos.entity.Tasas;
import ms.Prestamos.repositiry.PrestamosRepository;
import ms.Prestamos.repositiry.TasasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PrestamosService {
    @Autowired
    PrestamosRepository prestamosRepository;
    @Autowired
    TasasRepository tasasRepository;
    public Prestamos agregarPrestamo(Prestamos prestamo){
        LocalDate fechaActual = LocalDate.now();
        prestamo.setFecha(fechaActual);
        return  prestamosRepository.save(prestamo);
    }
//    public List<Salida> obtenerDeuda(Peticion peticion) {
//        String cliente = peticion.getCliente();
//        List<Prestamos> datoscliente = prestamosRepository.findByClienteAndEstadoIsFalse(cliente);
//        LocalDate fechaActual = peticion.getFechaActual();
//        DecimalFormat df = new DecimalFormat("#.##");
//
//        if (datosCliente == null) {
//            System.out.println("No se encontró al Cliente");
//            return new ArrayList<>();
//        }
//        return datosCliente.stream()
//                .map(prestamo -> {
//                    LocalDate fechaPrestamo = prestamo.getFecha();
//                    long diferenciaDias = Math.abs(ChronoUnit.DAYS.between(fechaActual, fechaPrestamo));
//                    int plazoEntero = Math.toIntExact(diferenciaDias);
//                    Double tasainteres = tasasRepository.findTasaInteresByRange(plazoEntero);
//                    Double monto = prestamo.getMonto();
//                    Integer diasAñoComersial = peticion.getDiasAñoComercial();
//                    Double interes = monto * plazoEntero * tasainteres / diasAñoComersial;
//                    interes = Double.parseDouble(df.format(interes));
//                    Double iva = interes * peticion.getTasaIVA();
//                    iva = Double.parseDouble(df.format(iva));
//                    Double pago = monto + interes + iva;
//                    pago = Double.parseDouble(df.format(pago));
//                    return new Salida(cliente, plazoEntero, tasainteres, monto, interes, iva, pago);
//                })
//                .collect(Collectors.toList());
//    }
       public List<Salida> obtenerDeuda(Peticion peticion) {
           String cliente = peticion.getCliente();
           List<Prestamos> datoscliente = prestamosRepository.findByClienteAndEstadoIsFalse(cliente);
           LocalDate fechaActual = peticion.getFechaActual();
           List<Salida> tasasInteres = new ArrayList<>();
           DecimalFormat df = new DecimalFormat("#.##");
           if (datoscliente != null) {
               for (Prestamos prestamo : datoscliente) {
                   LocalDate fechaPrestamo = prestamo.getFecha();
                   long diferenciaDias = Math.abs(ChronoUnit.DAYS.between(fechaActual, fechaPrestamo));
                   Integer plazoEntero = Math.toIntExact(diferenciaDias);
                   Double tasainteres = tasasRepository.findTasaInteresByRange(plazoEntero);
                   Double monto = prestamo.getMonto();
                   Integer diasAñoComersial = peticion.getDiasAñoComercial();
                   Double interes = (monto * plazoEntero * tasainteres) / diasAñoComersial;
                   interes = Double.parseDouble(df.format(interes));
                   Double iva = interes * peticion.getTasaIVA();
                   iva = Double.parseDouble(df.format(iva));
                   Double pago = monto + interes + iva;
                   pago = Double.parseDouble(df.format(pago));
                   Salida salida =new Salida(cliente,plazoEntero,tasainteres,monto,interes,iva,pago);
                   tasasInteres.add(salida);
               }
           }else {
               System.out.println("No se encontro al Cliente");
           }
           return tasasInteres;
   }
}
