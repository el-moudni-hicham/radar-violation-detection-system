package ma.enset.regestrationservice.repositories;

import ma.enset.regestrationservice.entites.Vehicle;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    // get vehicle by regestration number
    Vehicle findVehicleByRegestrationNumber(String rn);

    // Search vehiclen by regestration number containing keyword
    Page<Vehicle> findByRegestrationNumberContaining(String keyword, Pageable pageable);
}
