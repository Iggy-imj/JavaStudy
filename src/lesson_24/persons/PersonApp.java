package lesson_24.persons;

/*
Массив обьектов -  массив , элементы которого являются ссылками на обьекты
 */

public class PersonApp {
    public static void main(String[] args) {

        Person person = new Person("Alice", 25, "Reading");

        // Выводим информацию через toString()
        System.out.println(person);

        // Используем геттеры
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Hobby: " + person.getHobby());

        // Изменяем значения через сеттеры
        person.setName("Bob");
        person.setAge(30);
        person.setHobby("Cycling");

        // Выводим обновленные данные
        System.out.println("\nAfter updates:");
        System.out.println(person);

        //-------------------------------------------

        System.out.println("\n================");
        Person john = new Person("John", 75, "Reading and music");
        System.out.println(john);

        //-------------------------------------------

        System.out.println("\n================");

        Person[] people = new Person[5]; // создаю массив 5

        people[0] = person;
        people[3] = john;
        people[1] = new Person( "Tom", 5, "crying");


        System.out.println("people[0]" + people[0].toString());
        System.out.println(people[0].getName());
        System.out.println("-->");

        people[0].setName("Petro");
        System.out.println(people[0].getName());
        System.out.println(person.toString());

        System.out.println("\n================FOR================");

        for (int i = 0; i < people.length; i++) {
            if (people[i] != null ) {
                System.out.println(people[i].toString());
                System.out.println(people[i].getName());
            }else {
                System.out.println("Null");
            }
        }

        System.out.println("\n================");
        Person test = new Person("Test", 50, "coding");
        people[2] = test;

        people[2].setName("Test1");
        test.setAge(52);

        System.out.println(test.toString());

//      people[1] = people[2];
//      System.out.println(people[1].toString());

        test = null; // не будет ссылаться ни на какой обьект
        System.out.println(people[2].getHobby());
//      System.out.println(test.getHobby()); // низя

        test =people[1];
        System.out.println(test.toString());













    }
}
