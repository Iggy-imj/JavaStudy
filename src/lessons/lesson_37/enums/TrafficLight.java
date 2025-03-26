package lessons.lesson_37.enums;

public class TrafficLight {

    private String serialNumber;
    private String location;

    private Colors light;// Red, Yellow, Green

    public TrafficLight(String serialNumber, String location, Colors light) {
        this.serialNumber = serialNumber;
        this.location = location;
        this.light = light;
    }

    @Override
    public String toString() {
        return "TrafficLight{" +
                "serialNumber='" + serialNumber + '\'' +
                ", location='" + location + '\'' +
                ", light='" + light + '\'' +
                '}';
    }
}
