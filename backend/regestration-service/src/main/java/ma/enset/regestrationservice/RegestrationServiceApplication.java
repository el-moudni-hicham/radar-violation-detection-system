package ma.enset.regestrationservice;

import ma.enset.regestrationservice.entites.Owner;
import ma.enset.regestrationservice.entites.Vehicle;
import ma.enset.regestrationservice.repositories.OwnerRepository;
import ma.enset.regestrationservice.repositories.VehicleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.Random;
import java.util.stream.Stream;

@SpringBootApplication
public class  RegestrationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegestrationServiceApplication.class, args);
    }

    Random random = new Random();

    @Bean
    CommandLineRunner start(VehicleRepository vehicleRepository, OwnerRepository ownerRepository) {
        return args -> {
            Stream.of("Hicham", "Ahmed", "Abobaker", "Saleh").forEach(o -> {
                Owner owner = Owner.builder()
                        .name(o)
                        .email(o + "@gmail.com")
                        .birthDate(new Date())
                        .build();
                ownerRepository.save(owner);
            });

            ownerRepository.findAll().forEach(owner -> {
                for (int i = 0; i < 10; i++) {
                    Vehicle vehicle = Vehicle.builder()
                            .regestrationNumber("A" + random.nextInt(20))
                            .fiscalPower(random.nextDouble(10000))
                            .brand("Brand" + random.nextInt(20))
                            .model("Model" + random.nextInt(20))
                            .owner(owner)
                            .build();
                    vehicleRepository.save(vehicle);
                }
            });

        };
    }
}
