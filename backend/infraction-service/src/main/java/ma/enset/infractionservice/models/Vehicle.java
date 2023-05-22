package ma.enset.infractionservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class Vehicle {
    private Long id;
    private String regestrationNumber;
    private String brand;
    private Double fiscalPower;
    private String model;
    private Owner owner;
}
