package homeworks.hw_21;

public class Avto {
    String brand;
    String model;
    String colour;
    String fuel;
    double engine;
    int power;
    boolean isBroken;

    public Avto(String brand, String model, String colour, String fuel, double engine, int power){
        this.brand = brand;
        this.model = model;
        this.colour = colour;
        this.fuel = fuel;
        this.engine = engine;
        this.power = power;
        this.isBroken = false;
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

    void drive() {
        if (isBroken) {
            System.out.println("The car is broken and can't move!");
        } else {
            System.out.println(brand + " " + model + " is driving forward!");
        }
    }

    void breakDown() {
        isBroken = true;
        System.out.println(brand + " " + model + " is broken!");
    }

    void repair() {
        isBroken = false;
        System.out.println(brand + " " + model + " has been repaired!");
    }

}
