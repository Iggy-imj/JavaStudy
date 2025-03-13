package lessons.lesson_29.abstracts;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract void move();
    abstract void eat();

    public void sayHello() {
        System.out.println("Hello from animal!");
    }


}
