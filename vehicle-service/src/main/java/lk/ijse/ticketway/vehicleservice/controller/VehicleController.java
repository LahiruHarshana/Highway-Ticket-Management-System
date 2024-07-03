package lk.ijse.ticketway.vehicleservice.controller;

import lk.ijse.ticketway.vehicleservice.dto.VehicleDTO;
import lk.ijse.ticketway.vehicleservice.service.VehicleService;
import lk.ijse.ticketway.vehicleservice.util.ResponseDTO;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

/**
 * @author : L.H.J
 * @File: VehicleController
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-02, Wednesday
 **/
@RestController
@RequestMapping("/actions")
public class VehicleController {

    private final VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @PostMapping("/register")
    public ResponseDTO register(@RequestBody VehicleDTO vehicleDTO) {
        try {
            return vehicleService.registerVehicle(vehicleDTO);
        } catch (Exception e) {
            return new ResponseDTO(e.getMessage(), 500);
        }
    }

    @PutMapping("/update")
    public ResponseDTO update(@RequestBody VehicleDTO vehicleDTO) {
        try {
            return vehicleService.updateVehicle(vehicleDTO);
        } catch (Exception e) {
            return new ResponseDTO(e.getMessage(), 500);
        }
    }

    @GetMapping
    public ResponseDTO get() {
        try {
            HashMap<String, Object> objectObjectHashMap = new HashMap<>();
            objectObjectHashMap.put("vehicles", vehicleService.getAllVehicles());
            return new ResponseDTO(200, "vehicle Fetch Successfully !", objectObjectHashMap);
        } catch (Exception e) {
            return new ResponseDTO(e.getMessage(), 500);
        }
    }
}
