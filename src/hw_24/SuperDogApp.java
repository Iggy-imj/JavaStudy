package hw_24;

public class SuperDogApp {
    public static void main(String[] args) {

        System.out.println("\n===   1   ===\n");

        SuperDog dog1 = new SuperDog("Пусик", 40, 98);

        System.out.println(dog1);

        dog1.jumpBarrier();




        System.out.println("\n===   2   ===\n");

        SuperDog dog2 = new SuperDog("Гав", 50, 98);

        System.out.println(dog2);

        dog2.jumpBarrier();




        System.out.println("\n===   2   ===\n");

        SuperDog dog3 = new SuperDog("Рекс", 5, 98);

        System.out.println(dog3);

        dog3.jumpBarrier();











    }
}
