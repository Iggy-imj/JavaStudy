package homeworks.hw_49.validator;

public class PersonApp {
    public static void main(String[] args) {
        Person person = new Person("john@gmail.com", "qwerty");
        System.out.println(person);

        Person person1 = new Person("john@gmail.com", "Qwerty123!");
        System.out.println(person1);

        Person person2 = new Person("johngmail.com","Qwerty123!");
        System.out.println(person2);

        Person person3 = new Person("john@gmail.com", "Qwerty123");
        System.out.println(person3);
    }
}
