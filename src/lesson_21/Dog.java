package lesson_21;

public class Dog {

    String name;
    int weight;

    public Dog(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    void info() {
        System.out.println("I am dog " + name + ", my weight: " + weight);
    }

    void eat() {
        System.out.println("I am eating, niam niam!");
        this.weight++;
    }

    void run() {
        /*
        1. Проверить достаточен ли вес собаки для пробежки
        2. Если вес мал, собака должна поесть перед тренировкой
         */

        while (weight < 3) {
            System.out.println("Sorry. I am hungry and tired");
            System.out.println("My weight now is: " + weight);

            eat();
        }

        System.out.println("I am running");
        weight -= 2;
        System.out.println("Weight after running: " + weight);
        System.out.println("\n==================");
    }
}
