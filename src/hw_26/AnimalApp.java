package hw_26;

public class AnimalApp {
    public static void main(String[] args) {
        Dog dog = new Dog("Собакен", 5);
        Cat cat = new Cat("Котовий", 8);

        System.out.println(dog);
        dog.makeSound();

        System.out.println(cat);
        cat.makeSound();
    }

}
