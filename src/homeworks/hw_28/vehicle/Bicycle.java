package homeworks.hw_28.vehicle;

public class Bicycle extends Vehicle {

    @Override
    void startEngine() {
        System.out.println("Велосипед: двигателя нет. Крути педали!");
    }
}
