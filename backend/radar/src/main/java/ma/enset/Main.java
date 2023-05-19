package ma.enset;

import ma.enset.server.RadarServer;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        RestClient client = new RestClient();

        // Create a new instance of NewData with the required data
        NewData newData = new NewData(2L,"A1008");

        // Call the method to save the infraction
        client.saveInfraction(newData);

        // Close the client after you are done
        client.close();
    }
}
