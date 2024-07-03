package lk.ijse.ticketway.paymentservice.service;

import lk.ijse.ticketway.paymentservice.dto.PaymentDTO;
import lk.ijse.ticketway.paymentservice.util.ResponseDTO;

/**
 * @author : L.H.J
 * @File: PaymentService
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-02, Wednesday
 **/
public interface PaymentService {
    ResponseDTO add(PaymentDTO paymentDTO);

    ResponseDTO update(PaymentDTO paymentDTO);
}
