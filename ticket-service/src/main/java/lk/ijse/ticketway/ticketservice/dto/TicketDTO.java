package lk.ijse.ticketway.ticketservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author : L.H.J
 * @File: TicketDTO
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-02, Wednesday
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketDTO {
    private Long id;
    private String ticketId;
    private String ticketType;
    private String ticketPrice;
    private String ticketQty;
    private String ticketDate;
    private String ticketTime;
    private String ticketStatus;
    private String ticketLocation;
}
