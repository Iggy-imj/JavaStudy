package homeworks.hw_26.Animal;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println(name + " лает: Гав - гав!");
    }
}
