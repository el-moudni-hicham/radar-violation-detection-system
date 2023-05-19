package ma.enset;

import javax.inject.Inject;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class RestClient {
    @Inject
    private Client client;

    public RestClient() {
        client = ClientBuilder.newClient();
    }

    public void saveInfraction(NewData newData) {
        // Send a POST request to the "/newInfraction" endpoint
        // with the provided new data
        Response response = client.target("http://localhost:8083/api/radar/newInfraction")
                .request(MediaType.APPLICATION_JSON)
                .post(Entity.entity(newData, MediaType.APPLICATION_JSON));

        // Process the response as needed
        // ...

        // Close the response after you are done
        response.close();
    }

    // More methods for other operations

    public void close() {
        // Close the client when you are finished
        client.close();
    }
}
