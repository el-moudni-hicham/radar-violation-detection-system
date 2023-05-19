package ma.enset.radarservice.web.grpc.radarGrpcClient;


import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import ma.enset.radarservice.web.RadarRestController;
import ma.enset.radarservice.web.grpc.stubs.RadarServiceGrpc;
import ma.enset.radarservice.web.grpc.stubs.RadarServiceOuterClass;
import org.springframework.beans.factory.annotation.Autowired;

public class RadarClient {

    private final RadarServiceGrpc.RadarServiceBlockingStub radarServiceStub;
    private final ManagedChannel channel;

    public RadarClient(String serverHost, int serverPort) {
        channel = ManagedChannelBuilder.forAddress(serverHost, serverPort)
                .usePlaintext()
                .build();

        radarServiceStub = RadarServiceGrpc.newBlockingStub(channel);
    }

    public void shutdown() {
        // Shutdown the gRPC channel
        channel.shutdown();
    }

    public void generateSpeedViolation(int numberOfViolations) {
        RadarServiceOuterClass.GenerateSpeedViolationRequest request = RadarServiceOuterClass.GenerateSpeedViolationRequest.newBuilder()
                .setNumberOfViolations(numberOfViolations)
                .build();

        radarServiceStub.generateSpeedViolations(request)
                .forEachRemaining(speedViolation -> {
                    // Process each speed violation received from the server
                    System.out.println("Received Speed Violation from Radar: " + speedViolation.getRadarId());
                    System.out.println("Vehicle Registration Number: " + speedViolation.getVehicleRegistrationNumber());
                    System.out.println("Vehicle Speed: " + speedViolation.getVehicleSpeed());

                    // ***************************************************************


                    // ***************************************************************

                });
    }

    public static void main(String[] args) {
        // Create a client and connect to the server
        RadarClient client = new RadarClient("localhost", 50051);

        // Generate 5 speed violations
        client.generateSpeedViolation(1);

        // Shutdown the client
        client.shutdown();
    }
}
