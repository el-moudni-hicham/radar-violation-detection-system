package ma.enset.regestrationservice.repositories;

import ma.enset.regestrationservice.entites.Owner;
import ma.enset.regestrationservice.entites.Vehicle;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    Vehicle findVehicleByRegestrationNumber(String rn);

    Page<Vehicle> findByRegestrationNumberContaining(String keyword, Pageable pageable);
}
