package hw_21;

public class Avto {
    String brand;
    String model;
    String colour;
    String fuel;
    double engine;
    int power;

    public Avto(String brand, String model, String colour, String fuel, double engine, int power){
        this.brand = brand;
        this.model = model;
        this.colour = colour;
        this.fuel = fuel;
        this.engine = engine;
        this.power = power;
    }
    void about() {
        System.out.println("CAR DESCRIPTION\n" +
                "  Brand: " + brand + "\n" +
                "  Model: " + model + "\n" +
                "  Colour: " + colour + "\n" +
                "  Fuel: " + fuel + "\n" +
                "  Engine: " + engine + "\n" +
                "  Power: " + power);
    }

}
