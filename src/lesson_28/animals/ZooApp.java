package lesson_28.animals;

public class ZooApp {
    public static void main(String[] args) {

        Cat cat = new Cat();

        cat.voice(); // унаследован от Animal
        System.out.println(cat.toString());

        cat.eat();

        Dog dog = new Dog();
        dog.voice();

        System.out.println("\n------------");

        Hamster hamster = new Hamster();
        hamster.voice();
        System.out.println(hamster);

    }
}
