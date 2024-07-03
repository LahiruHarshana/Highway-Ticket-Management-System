package lk.ijse.ticketway.ticketservice.repository;

import lk.ijse.ticketway.ticketservice.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author : L.H.J
 * @File: TicketRepository
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-02, Wednesday
 **/
@Repository
public interface TicketRepository extends JpaRepository<Ticket,Long> {
}
