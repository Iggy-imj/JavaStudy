package lessons.lesson_30.Flyable;

public class Application {
    public static void main(String[] args) {


    Airplane airplane = new Airplane(50);
    Duck duck = new Duck();

    duck.fly();
    duck.swim();

    System.out.println("\n==============\n");

    Flyable[] flyables = new Flyable[2];
    flyables[0] = duck;
    flyables[1] = airplane;

    for (int i = 0; i < flyables.length; i++) {
        Flyable flyable = flyables[i];

        flyable.fly();
        // прловеряем возмонжость приведения ссылки к типу интерфейса
        if (flyable instanceof Swimmable) {
            System.out.println("Могу привести этот обьект к Swimmable");
            Swimmable swimmable = (Swimmable) flyable;
            swimmable.swim();
            System.out.println("\n==============\n");
        }

        if (flyable instanceof Airplane) {
            System.out.println("Могу привести к классу Airplane");
            Airplane airplaneLink = (Airplane) flyable;
            System.out.println("capacity: " + airplaneLink.capacity);
            airplaneLink.takePassenger();
            System.out.println("amountPassengers: " + airplaneLink.amountPassengers);

        }

    }
}
}
