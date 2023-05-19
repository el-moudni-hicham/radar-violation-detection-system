package ma.enset.radarservice.feign;

import ma.enset.radarservice.models.Infraction;
import ma.enset.radarservice.models.NewData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@FeignClient(name = "infraction-service")
public interface InfractionRestClient {

    @PostMapping("api/infraction/saveInfraction")
    Infraction saveInfraction(@RequestBody NewData newData);
}
