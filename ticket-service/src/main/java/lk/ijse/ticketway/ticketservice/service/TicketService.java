package lk.ijse.ticketway.ticketservice.service;

import lk.ijse.ticketway.ticketservice.dto.TicketDTO;
import lk.ijse.ticketway.ticketservice.util.ResponseDTO;

/**
 * @author : L.H.J
 * @File: TicketService
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-02, Wednesday
 **/
public interface TicketService {
    ResponseDTO save(TicketDTO ticketDTO);

    ResponseDTO update(TicketDTO ticketDTO);

    ResponseDTO getAll();
}
