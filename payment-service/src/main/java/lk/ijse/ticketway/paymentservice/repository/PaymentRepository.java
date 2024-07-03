package lk.ijse.ticketway.paymentservice.repository;

import lk.ijse.ticketway.paymentservice.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author : L.H.J
 * @File: PaymentRepository
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-02, Wednesday
 **/
@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
