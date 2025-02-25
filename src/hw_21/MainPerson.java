package hw_21;

public class MainPerson {
    public static void main(String[] args) {

        Person person1 = new Person("Max", "Programmer", 32, 12);
        person1.info();

        Person person2 = new Person("Dima", "Designer", 28, 3);
        person2.info();

        Person person3 = new Person("Miha Ivanivich", "Doctor", 48, 26);
        person3.info();
    }
}
