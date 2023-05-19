package ma.enset.regestrationservice.web.graphql;

import ma.enset.regestrationservice.entites.Owner;
import ma.enset.regestrationservice.entites.OwnerRequest;
import ma.enset.regestrationservice.repositories.OwnerRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class OwnerGraphqlController {
    private OwnerRepository ownerRepository;

    // Dependencies Injection
    public OwnerGraphqlController(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    // Operations in owners
    // - Get all owners
    @QueryMapping
    public List<Owner> getOwners(){
        return ownerRepository.findAll();
    }

    // - Get owner by id
    @QueryMapping
    public Owner getOwnerById(@Argument Long id){
        return ownerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(String.format("Owner %s not found ! ", id)));
    }

    // - Save owner
    @MutationMapping
    public Owner addOwner(@Argument OwnerRequest owner){
        Owner o = new Owner();
        o.setName(owner.getName());
        o.setEmail(owner.getEmail());
        o.setBirthDate(owner.getBirthDate());
        return ownerRepository.save(o);
    }

    // - Update owner

    // - Delete owner
    @MutationMapping
    public Boolean deleteOwner(@Argument Long id){
        ownerRepository.deleteById(id);
        return true;
    }
}

