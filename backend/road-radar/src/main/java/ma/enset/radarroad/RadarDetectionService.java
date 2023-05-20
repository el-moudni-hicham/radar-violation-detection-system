package ma.enset.radarroad;

import lombok.extern.slf4j.Slf4j;
import ma.enset.radarroad.models.NewData;
import ma.enset.radarroad.models.Radar;
import ma.enset.radarroad.models.Vehicle;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
@Slf4j
@EnableScheduling
public class RadarDetectionService {
    private final RestTemplate restTemplate;
    private List<Radar> radarList = new ArrayList<>();
    private List<Vehicle> vehicleList = new ArrayList<>();
    private final Random random = new Random();

    public RadarDetectionService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public void loadRadars() {
        ResponseEntity<Radar[]> exchange = restTemplate.exchange("http://localhost:8890/RADAR-SERVICE/api/radar/radars", HttpMethod.GET, null, Radar[].class);
        ResponseEntity<Vehicle[]> exchangeVehicle = restTemplate.exchange("http://localhost:8890/REGESTRATION-SERVICE/api/vehicle/vehicles", HttpMethod.GET, null, Vehicle[].class);
        this.radarList = Arrays.asList(exchange.getBody());
        this.vehicleList = Arrays.asList(exchangeVehicle.getBody());
    }

    @Scheduled(fixedRate = 4000)
    public void submitOverSpeedDetection() {
        loadRadars();
        int indexR = random.nextInt(radarList.size());
        Radar radar = radarList.get(indexR);

        System.out.println(radar.getName());
        int indexV = random.nextInt(vehicleList.size());
        Vehicle vehicle = vehicleList.get(indexV);
        System.out.println(vehicle.getRegestrationNumber());

        NewData newData = new NewData();
        newData.setRadarId(radar.getId());
        newData.setRn(vehicle.getRegestrationNumber());
        newData.setVehicleSpeed(radar.getMaxSpeed() + new Random().nextInt(100));

        System.out.println(newData.getVehicleSpeed());

        this.restTemplate.exchange(
                "http://localhost:8890/RADAR-SERVICE/api/radar/newInfraction",
                HttpMethod.POST,
                new HttpEntity<>(newData),
                String.class
        );

    }

}