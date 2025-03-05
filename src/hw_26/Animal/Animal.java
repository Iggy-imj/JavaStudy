package hw_26.Animal;

public class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Животное: " + name + ", Возраст: " + age + " лет";
    }

}
