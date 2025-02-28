package lesson_24;

public class CarApp {
    public static void main(String[] args) {

        System.out.println("Static total cars: " + Car.totalCars); // пока не создано обьектов по дефолту 0

        Car bmw = new Car("BMW", 200);
        System.out.println(bmw.toString());
//      System.out.println("static total cars: " + Car.totalCars);

        Car vw = new Car("VW", 300);
        System.out.println(bmw.toString());
//      System.out.println("static total cars: " + Car.totalCars);

        System.out.println("Static total cars: " + Car.totalCars);
        // я могу обратиться к статике от имени конкретного обьекта,
        // но это плохая практика и так делать не рекомендуется
        // System.out.println(vw.totalCars);
        // следует обращаться к статике от имени класса

        // static int x; - модификатор статик применим только к полям или методам класса





    }
}
