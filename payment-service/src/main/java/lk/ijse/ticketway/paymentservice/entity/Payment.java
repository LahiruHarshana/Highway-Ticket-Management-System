package lk.ijse.ticketway.paymentservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

/**
 * @author : L.H.J
 * @File: Payment
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-02, Wednesday
 **/
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
