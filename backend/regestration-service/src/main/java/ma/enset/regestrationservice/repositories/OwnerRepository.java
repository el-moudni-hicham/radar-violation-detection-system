package ma.enset.regestrationservice.repositories;

import ma.enset.regestrationservice.entites.Owner;
import ma.enset.regestrationservice.entites.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner, Long> {
}
