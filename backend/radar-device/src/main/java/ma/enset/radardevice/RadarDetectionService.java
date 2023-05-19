package ma.enset.radardevice;

import lombok.extern.slf4j.Slf4j;
import ma.enset.radardevice.models.NewData;
import ma.enset.radardevice.models.Radar;
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
    private RestTemplate restTemplate;
    private List<Radar> radarList=new ArrayList<>();
    private List<Character> registrationCharacters;
    private Random random=new Random();

    public RadarDetectionService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    public void loadRadars(){
        ResponseEntity<Radar[]> exchange = restTemplate.exchange("http://localhost:8083/api/radar/radars", HttpMethod.GET, null, Radar[].class);
        this.radarList= Arrays.asList(exchange.getBody());
        this.registrationCharacters=Arrays.asList('A','A','A','A','A','A');
        log.info("=>{}",radarList.size());
    }

    @Scheduled(fixedRate = 100000)
    public void submitOverSpeedDetection(){
        loadRadars();
        int index = random.nextInt(radarList.size()>=4?4:radarList.size());
        Radar radar=radarList.get(index);
        System.out.println(radar.toString());
        System.out.println(radar.getId());


            int registrationNumber=(int)(Math.random()*10);
            Character m =registrationCharacters.get(random.nextInt(registrationCharacters.size()));

            String vrn =String.valueOf(registrationNumber)+m;

            NewData newData = new NewData();
            newData.setRadarId(radar.getId());
            newData.setRn("A12");
            newData.setVehicleSpeed(radar.getMaxSpeed()+new Random().nextInt(100));

            this.restTemplate.exchange(
                    "http://localhost:8890/RADAR-SERVICE/api/radar/newInfraction",
                    HttpMethod.POST,
                    new HttpEntity<>(newData),
                    String.class
            );

    }

}