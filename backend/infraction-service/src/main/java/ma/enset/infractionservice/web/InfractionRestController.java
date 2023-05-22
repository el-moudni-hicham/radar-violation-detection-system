package ma.enset.infractionservice.web;

import ma.enset.infractionservice.entites.Infraction;
import ma.enset.infractionservice.feign.RadarRestClient;
import ma.enset.infractionservice.feign.VehicleRestClient;
import ma.enset.infractionservice.models.NewData;
import ma.enset.infractionservice.models.Radar;
import ma.enset.infractionservice.models.Vehicle;
import ma.enset.infractionservice.repositories.InfractionRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Random;

@RestController
@RestResource
@RequestMapping("/api/infraction")
public class InfractionRestController {
    private VehicleRestClient vehicleRestClient;
    private RadarRestClient radarRestClient;
    private InfractionRepository infractionRepository;

    public InfractionRestController(VehicleRestClient vehicleRestClient, RadarRestClient radarRestClient, InfractionRepository infractionRepository) {
        this.vehicleRestClient = vehicleRestClient;
        this.radarRestClient = radarRestClient;
        this.infractionRepository = infractionRepository;
    }


    // - Save Infraction
   @PostMapping("/saveInfraction")
    public Infraction saveInfraction(@RequestBody NewData newData){
        Vehicle v = vehicleRestClient.getByRegestrationNumber(newData.getRn());
        Radar r = radarRestClient.getByRadarById(newData.getRadarId());
        r.setId(newData.getRadarId());

        /*double amount;
        if(newData.getVehicleSpeed() > r.getMaxSpeed()) amount = 500;
        else if(newData.getVehicleSpeed() > (r.getMaxSpeed()+20)) amount = 750;
        else if(newData.getVehicleSpeed() > (r.getMaxSpeed()+40)) amount = 850;
        else amount = 1000;*/

        Infraction infraction = Infraction.builder()
                .vehicle(v)
                .radar(r)
                .paid(false)
                .vehicleSpeed(newData.getVehicleSpeed())
                .vehicleMatricule(newData.getRn())
                .radarId(newData.getRadarId())
                .infractionAmount(new Random().nextInt(1000))
                .date(new Date())
                .radarMaxSpeed(r.getMaxSpeed())
                .build();

        infractionRepository.save(infraction);
        return infraction;
    }

    @GetMapping(path = "/fullInfractions")
    public List<Infraction> getFullInfractions(){
        List<Infraction> infractions = infractionRepository.findAll();
        infractions.forEach(infraction -> {
            Vehicle vehicle = vehicleRestClient.getByRegestrationNumber(infraction.getVehicleMatricule());
            infraction.setVehicle(vehicle);

            Radar radar = radarRestClient.getByRadarById(infraction.getRadarId());
            radar.setId(infraction.getRadarId());
            infraction.setRadar(radar);

        });
        return infractions;
    }

    @GetMapping("/count")
    public Long getInfractionsCount() {
        return infractionRepository.count();
    }


    @GetMapping(path = "/fullInfractionsPages")
    public Page<Infraction> getFullInfractions(
            @RequestParam(value = "page") int page,
            @RequestParam(value = "size") int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Infraction> infractionsPage = infractionRepository.findAll(pageable);
        List<Infraction> infractions = infractionsPage.getContent();
        infractions.forEach(infraction -> {
            Vehicle vehicle = vehicleRestClient.getByRegestrationNumber(infraction.getVehicleMatricule());
            infraction.setVehicle(vehicle);

            Radar radar = radarRestClient.getByRadarById(infraction.getRadarId());
            radar.setId(infraction.getRadarId());
            infraction.setRadar(radar);
        });
        long totalElements = infractionsPage.getTotalElements();

        return new PageImpl<>(infractions, pageable,totalElements);
    }

    @GetMapping(path = "/PageInfraction")
    public List<Infraction> getFullInPagefractions( @RequestParam(value = "page", defaultValue = "0") int page,
                                                    @RequestParam(value = "size", defaultValue = "5") int size){
        List<Infraction> infractions = infractionRepository.findAll();
        infractions.forEach(infraction -> {
            Vehicle vehicle = vehicleRestClient.getByRegestrationNumber(infraction.getVehicleMatricule());
            infraction.setVehicle(vehicle);

            Radar radar = radarRestClient.getByRadarById(infraction.getRadarId());
            radar.setId(infraction.getRadarId());
            infraction.setRadar(radar);

        });

        Pageable pageable = PageRequest.of(page, size);
        return infractions;
    }



    @GetMapping(path = "/save/{id}")
    public Infraction getInfraction(@PathVariable(name = "id") Long id){
        Infraction infraction = infractionRepository.findById(id).get();
        Vehicle v = vehicleRestClient.getByRegestrationNumber(infraction.getVehicleMatricule());
        Radar r = radarRestClient.getByRadarById(infraction.getRadarId());

        r.setId(infraction.getRadarId());
        infraction.setRadar(r);
        infraction.setVehicle(v);


        return infraction;
    }


}
