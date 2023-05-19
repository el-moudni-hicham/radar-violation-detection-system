package ma.enset.regestrationservice.web.soap;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import lombok.AllArgsConstructor;
import ma.enset.regestrationservice.entites.Owner;
import ma.enset.regestrationservice.repositories.OwnerRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@WebService
@AllArgsConstructor
public class OwnerSoapService {
    private OwnerRepository ownerRepository;

    @WebMethod
    public List<Owner> getOwners(){
        return ownerRepository.findAll();
    }

    @WebMethod
    public Owner getOwnerById(@WebParam(name = "id") Long id){
        Owner owner = ownerRepository.findById(id).get();
        return owner;
    }

}
