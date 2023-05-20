package ma.enset.regestrationservice.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

// for GraphQL
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OwnerRequest {

    private String name;
    private Date birthDate;
    private String email;

}
