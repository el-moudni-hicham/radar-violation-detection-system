package ma.enset.radarroad.models;

import lombok.Data;

@Data
public class Radar {
    private Long id;
    private String name;
    private boolean status;
    private int maxSpeed;
    private double longitude;
    private double latitude;
}