package lk.ijse.ticketway.vehicleservice.repository;

import lk.ijse.ticketway.vehicleservice.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author : L.H.J
 * @File: VehicleRepository
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-02, Wednesday
 **/
@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

}
