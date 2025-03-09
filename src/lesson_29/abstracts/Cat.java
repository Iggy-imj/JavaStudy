package lesson_29.abstracts;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    void move() {
        System.out.println("Cat is moving!");
    }

    @Override
    void eat() {
        System.out.println("Cat love eating!");

    }
}
