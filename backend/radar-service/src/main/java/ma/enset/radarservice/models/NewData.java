package ma.enset.radarservice.models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class NewData {
    private Long radarId;
    private String rn;
    private double vehicleSpeed;


}
