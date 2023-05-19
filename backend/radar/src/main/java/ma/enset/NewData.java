package ma.enset;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class NewData implements Serializable {
    private Long radarId;
    private String rn;

    @JsonCreator
    public NewData(@JsonProperty("radarId") Long radarId, @JsonProperty("rn") String rn) {
        this.radarId = radarId;
        this.rn = rn;
    }

    @JsonProperty("radarId")
    public Long getRadarId() {
        return radarId;
    }

    @JsonProperty("rn")
    public String getRn() {
        return rn;
    }
}
