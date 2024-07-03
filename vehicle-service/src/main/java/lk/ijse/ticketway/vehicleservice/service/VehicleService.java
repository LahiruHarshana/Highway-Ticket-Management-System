package lk.ijse.ticketway.vehicleservice.service;

import lk.ijse.ticketway.vehicleservice.dto.VehicleDTO;
import lk.ijse.ticketway.vehicleservice.util.ResponseDTO;

import java.util.List;

/**
 * @author : L.H.J
 * @File: VehicleService
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-02, Wednesday
 **/
public interface VehicleService {
    ResponseDTO registerVehicle(VehicleDTO vehicleDTO);

    ResponseDTO updateVehicle(VehicleDTO vehicleDTO);

    List<VehicleDTO> getAllVehicles();
}
