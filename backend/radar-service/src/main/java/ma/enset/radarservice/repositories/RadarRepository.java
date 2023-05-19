package ma.enset.radarservice.repositories;

import ma.enset.radarservice.entites.Radar;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface RadarRepository extends JpaRepository<Radar, Long> {



    Page<Radar> findByNameContains(String name, Pageable pageable);
}
