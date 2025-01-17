package lk.ijse.ticketway.ticketservice.service.impl;

import lk.ijse.ticketway.ticketservice.dto.TicketDTO;
import lk.ijse.ticketway.ticketservice.entity.Ticket;
import lk.ijse.ticketway.ticketservice.repository.TicketRepository;
import lk.ijse.ticketway.ticketservice.service.TicketService;
import lk.ijse.ticketway.ticketservice.util.ResponseDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * @author : L.H.J
 * @File: TicketServiceImpl
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-02, Wednesday
 **/
@Service
public class TicketServiceImpl implements TicketService {

    private final TicketRepository ticketRepository;
    private final ModelMapper mapper;

    public TicketServiceImpl(TicketRepository ticketRepository, ModelMapper mapper) {
        this.ticketRepository = ticketRepository;
        this.mapper = mapper;
    }

    @Override
    public ResponseDTO save(TicketDTO ticketDTO) {
        ticketRepository.save(mapper.map(ticketDTO, Ticket.class));
        return new ResponseDTO("Ticket saved successfully", 200);
    }

    @Override
    public ResponseDTO update(TicketDTO ticketDTO) {
        ticketRepository.save(mapper.map(ticketDTO, Ticket.class));
        return new ResponseDTO("Ticket updated successfully", 200);
    }

    @Override
    public ResponseDTO getAll() {
        List<Ticket> all = ticketRepository.findAll();
        HashMap<String, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("tickets", all);
        return new ResponseDTO(200, "Ticket fetched successfully", objectObjectHashMap);
    }
}
