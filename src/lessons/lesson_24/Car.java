package lessons.lesson_24;

public class Car {

    static int totalCars;//статіческое поле класса. Существует в едінственном єкземпляре. доступно всем обьектам класса

    private  String model;
    private  int power;

    public Car(String model, int power) {
        this.power = power;
        this.model = model;

        totalCars++; // при создании нового обьекта уваличиываем количество созданных автомобилей
    }

    public String toString() {
        return String.format("Auto: %s, Power: %d HP. Total cars: %d", model, power, totalCars);
    }

    public String getModel() {
        return model;
    }

    public int getPower() {
        return power;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
