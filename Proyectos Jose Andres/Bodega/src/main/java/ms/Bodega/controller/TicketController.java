package ms.Bodega.controller;

import ms.Bodega.entity.Ticket;
import ms.Bodega.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ticket")
public class TicketController {

    @Autowired
    TicketService ticketService;

    @GetMapping("/leerProductos")
    public List<Ticket> leerProductos() {
        return ticketService.leerProductos();
    }
}
