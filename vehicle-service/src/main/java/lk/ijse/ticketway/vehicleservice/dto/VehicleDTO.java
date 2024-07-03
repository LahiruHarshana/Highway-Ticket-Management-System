package lk.ijse.ticketway.vehicleservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : L.H.J
 * @File: VehicleDTO
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-02, Wednesday
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VehicleDTO {
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
