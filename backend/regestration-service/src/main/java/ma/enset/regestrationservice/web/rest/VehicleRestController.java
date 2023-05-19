package ma.enset.regestrationservice.web.rest;


import ma.enset.regestrationservice.entites.Vehicle;
import ma.enset.regestrationservice.repositories.VehicleRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehicle")
public class VehicleRestController {
    private VehicleRepository vehicleRepository;

    // Dependencies Injection
    public VehicleRestController(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }



    @GetMapping("/pageVehicle")
    public Page<Vehicle> getPageVehicle(
            @RequestParam(value = "page", defaultValue = "0") int page,
            @RequestParam(value = "size", defaultValue = "5") int size) {

        Pageable pageable = PageRequest.of(page, size);
        return vehicleRepository.findAll(pageable);
    }

    @GetMapping("/pageVehicleName/{keyword}")
    public Page<Vehicle> getVehiclesByName(@PathVariable String keyword,
                                       @RequestParam(value = "page", defaultValue = "0") int page,
                                       @RequestParam(value = "size", defaultValue = "5") int size) {

        Pageable pageable = PageRequest.of(page, size);

        if (keyword.equals(null)) return vehicleRepository.findAll(pageable);
        return vehicleRepository.findByRegestrationNumberContaining(keyword, pageable);
    }

    @GetMapping("/count")
    public Long getVehiclesCount() {
        return vehicleRepository.count();
    }


    @GetMapping("/vehicleByRn/{rn}")
    public Vehicle getByRegestrationNumber(@PathVariable String rn){
        return vehicleRepository.findVehicleByRegestrationNumber(rn);
    }
    // Operations in Vehicles

    // - Get all vehicles
    @GetMapping("/vehicles")
    public List<Vehicle> getVehicles(){
        return vehicleRepository.findAll();
    }

    // - Get vehicle by id
    @GetMapping("/vehicles/{id}")
    public Vehicle getVehicleById(@PathVariable Long id){
        return vehicleRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(String.format("Vehicle %s not found !", id)));
    }

    // - Get all vehicles
    @PostMapping("/vehicles")
    public Vehicle saveVehicle(@RequestBody Vehicle vehicle){
        return vehicleRepository.save(vehicle);
    }

    // - Update vehicle
    @PutMapping ("/vehicles/{id}")
    public Vehicle updateVehicle(@PathVariable Long id, @RequestBody Vehicle vehicle){
        Vehicle v = vehicleRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(String.format("Vehicle %s not found !", id)));

        if(vehicle.getModel() != null) v.setModel(vehicle.getModel());
        if(vehicle.getBrand() != null) v.setBrand(vehicle.getBrand());
        if(vehicle.getFiscalPower() != null) v.setFiscalPower(vehicle.getFiscalPower());
        if(vehicle.getRegestrationNumber() != null) v.setRegestrationNumber(vehicle.getRegestrationNumber());
        if(vehicle.getOwner() != null) v.setOwner(vehicle.getOwner());

        return vehicleRepository.save(v);
    }

    // - Delete vehicle
    @DeleteMapping("/vehicles/{id}")
    public void deleteVehicle(@PathVariable Long id){
        vehicleRepository.deleteById(id);
    }

}
