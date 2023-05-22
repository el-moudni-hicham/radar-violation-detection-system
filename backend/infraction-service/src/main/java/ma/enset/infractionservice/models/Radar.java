package ma.enset.infractionservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class Radar {
    private Long id;
    private String name;
    private boolean status;
    private int maxSpeed;
    private double longitude;
    private double latitude;
}
