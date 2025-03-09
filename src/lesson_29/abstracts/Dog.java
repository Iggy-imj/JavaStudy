package lesson_29.abstracts;

public abstract class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    void move() {
        System.out.println("Dog is moving!");
    }
}
