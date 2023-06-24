package ms.Prestamos.controller;

import ms.Prestamos.entity.Peticion;
import ms.Prestamos.entity.Prestamos;
import ms.Prestamos.entity.Salida;
import ms.Prestamos.service.PrestamosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@RestController
@RequestMapping("/prestamos")
public class PrestamosController {
    @Autowired
    PrestamosService prestamosService;
    @PostMapping("/agregarPrestamo")
    public Prestamos agregarPrestamos(@RequestBody Prestamos prestamo){
        return  prestamosService.agregarPrestamo(prestamo);
    }

    @GetMapping("/obtenerDeuda")
    public List<Salida> obtenerDeuda(@RequestBody Peticion peticion) {

        return prestamosService.obtenerDeuda(peticion);
    }

}
