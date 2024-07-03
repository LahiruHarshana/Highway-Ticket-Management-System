package lk.ijse.ticketway.paymentservice.controller;

import lk.ijse.ticketway.paymentservice.dto.PaymentDTO;
import lk.ijse.ticketway.paymentservice.service.PaymentService;
import lk.ijse.ticketway.paymentservice.util.ResponseDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : L.H.J
 * @File: PaymentController
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-02, Wednesday
 **/
@RestController
@RequestMapping("/actions")
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/validate")
    public ResponseDTO add(@RequestBody PaymentDTO paymentDTO) {
        try{
            return paymentService.add(paymentDTO);
        }catch (Exception e) {
            return new ResponseDTO("Error", 500);
        }
    }

    @PostMapping("/process")
    public ResponseDTO update(@RequestBody PaymentDTO paymentDTO) {
        try{
            return paymentService.update(paymentDTO);
        }catch (Exception e) {
            return new ResponseDTO("Error", 500);
        }
    }
}
