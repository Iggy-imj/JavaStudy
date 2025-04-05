package lessons.lesson_49.validator;

public class PersonApp {
    public static void main(String[] args) {
        Person person = new Person("john@gmail.com", "qwerty");
        System.out.println(person);

        Person person1 = new Person("johngmail.com","qwerty");
    }
}
