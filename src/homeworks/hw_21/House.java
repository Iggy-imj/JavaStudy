package homeworks.hw_21;

public class House {
    String address;
    int floor;
    double area;
    boolean hasGarage;

    public House(String address, int floor, double area, boolean hasGarage) {
        this.address = address;
        this.floor = floor;
        this.area = area;
        this.hasGarage = hasGarage;
    }

    void info() {
        System.out.printf("House at %s, %d floor, area %.2f m², garage: %b\n",
                address, floor, area, hasGarage);
    }
}

