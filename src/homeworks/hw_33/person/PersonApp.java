package homeworks.hw_33.person;

public class PersonApp {
    public static void main(String[] args) {

        Person person = new Person("test@mail.net", "password");

        System.out.println(person);



        person.setPassword("jnfjdnjfn*U*U)()(8988");
        person.setPassword("444");

    }
}
