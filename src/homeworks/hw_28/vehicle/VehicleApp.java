package homeworks.hw_28.vehicle;

public class VehicleApp {
    public static void main(String[] args) {

        Vehicle[] vehicles = {new Car(), new Motorcycle(), new Bicycle()};

        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].startEngine();
        }
    }
}
