package ma.enset.regestrationservice.web.graphql;

import ma.enset.regestrationservice.entites.Vehicle;
import ma.enset.regestrationservice.repositories.VehicleRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class VehicleGraphqlController {
    private VehicleRepository vehicleRepository;

    // Dependencies Injection
    public VehicleGraphqlController(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    // Operations in Vehicles
    // - Get all vehicles
    @QueryMapping
    public List<Vehicle> getVehicles(){
        return vehicleRepository.findAll();
    }

    // - Get vehicle by id
    @QueryMapping
    public Vehicle getVehicleById(@Argument Long id){
        return vehicleRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(String.format("Vehicle %s not found ! ", id)));
    }

    // - Save vehicle
    @MutationMapping
    public Vehicle addVehicle(@Argument Vehicle vehicle){
        return vehicleRepository.save(vehicle);
    }

    // - Update vehicle


    // - Delete vehicle
    @MutationMapping
    public Boolean deleteVehicle(@Argument Long id){
        vehicleRepository.deleteById(id);
        return true;
    }
}

