package ma.enset.radarservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data @NoArgsConstructor @AllArgsConstructor
public class Infraction {
    private Date date;
    private Long radarId;
    private String vehicleMatricule;
    private double vehicleSpeed;
    private double radarMaxSpeed;
    private double infractionAmount;
}
