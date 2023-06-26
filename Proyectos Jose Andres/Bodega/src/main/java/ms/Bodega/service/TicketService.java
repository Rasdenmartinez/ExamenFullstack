package ms.Bodega.service;

import ms.Bodega.entity.Ticket;
import ms.Bodega.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {
    @Autowired
    TicketRepository ticketRepository;

    public List<Ticket> leerProductos(){
        return ticketRepository.findAll();
    }
}
