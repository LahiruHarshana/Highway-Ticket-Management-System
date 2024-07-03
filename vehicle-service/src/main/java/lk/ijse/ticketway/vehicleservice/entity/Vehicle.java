package lk.ijse.ticketway.vehicleservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author : L.H.J
 * @File: Vehicle
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-02, Wednesday
 **/
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;
    private String vehicleId;
    private String vehicleType;
    private String vehicleBrand;
    private String vehicleModel;
    private String vehicleYear;
    private String vehicleColor;
    private String vehicleFuelType;
    private String vehicleTransmissionType;
    private String vehicleEngineCapacity;
    private String vehicleMileage;
    private String vehiclePrice;
    private String vehicleStatus;
    private String vehicleLocation;
    private String vehicleDate;
    private String vehicleTime;
}
