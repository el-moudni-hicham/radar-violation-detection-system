package ma.enset.infractionservice.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.enset.infractionservice.models.Radar;
import ma.enset.infractionservice.models.Vehicle;

import java.util.Date;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Infraction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;

    private boolean paid;
    private Long radarId;
    private String vehicleMatricule;
    @Transient
    private Vehicle vehicle;
    private double vehicleSpeed;
    @Transient
    private Radar radar;
    private double radarMaxSpeed;
    private double infractionAmount;
}
