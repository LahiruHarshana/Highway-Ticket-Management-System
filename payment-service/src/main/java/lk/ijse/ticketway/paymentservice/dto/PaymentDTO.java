package lk.ijse.ticketway.paymentservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author : L.H.J
 * @File: PaymentDTO
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-02, Wednesday
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDTO {
    private Long id;
    private String paymentId;
    private String paymentType;
    private String paymentAmount;
    private String paymentDate;
    private String paymentTime;
    private String paymentStatus;
    private String paymentLocation;
    private Date date;
}
