package ma.enset.infractionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class InfractionServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InfractionServiceApplication.class, args);
    }

    /*
    Random random = new Random();

    @Bean
    CommandLineRunner start(InfractionRepository infractionRepository) {
        return args -> {
            Stream.of("inf1", "inf2", "inf3", "inf4").forEach(i -> {
                Infraction infraction = Infraction.builder()
                        .paid(false)
                        .date(new Date())
                        .radarId(2L)
                        .radarMaxSpeed(150)
                        .vehicleMatricule("A2000")
                        .infractionAmount(3000)
                        .vehicleSpeed(200)
                        .build();
                infractionRepository.save(infraction);
            });
        };
    }*/
}
