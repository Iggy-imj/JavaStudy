package homeworks.hw_47;
/*
Task 1
Напишите метод, принимающий список чисел и возвращающий новый, отфильтрованный список.
В новом списке должны быть только те числа из старого списка,
которые соответствуют всем условиям: четные, больше 10 и меньше 100
Для фильтрации используйте Stream API

Task 2
Дан список строк.
Используя Stream API, отфильтруйте строки,
которые начинаются на определенную букву (например, "A") и отсортируйте их в алфавитном порядке.
Результат сохраните в новый список строк.

Task 3
Дан список Person с полями name, age, city.
Используйте Stream API для фильтрации людей,
которые старше определенного возраста и проживают в определенном городе, а затем соберите их в список.
Например, старше 25 лет и проживающих в городе "Berlin"
 */


import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Tasks {
    public static void main(String[] args) {
        task1();
        task2();
        task3();


    }

    private static void task3() {
        System.out.println("\n===== Task 3 =====");

        List<Person> people = Arrays.asList(
                new Person("Anna", 30, "Berlin"),
                new Person("Ben", 20, "Munich"),
                new Person("Clara", 28, "Berlin"),
                new Person("David", 35, "Hamburg"),
                new Person("Eva", 40, "Berlin"),
                new Person("Frank", 24, "Berlin")
        );
        System.out.println("people:");
        people.forEach(System.out::println);

        List<Person> filteredPeople = people.stream()
                .filter(Objects::nonNull)
                .filter(p -> p.getAge() > 25)
                .filter(p -> "Berlin".equals(p.getCity()))
                .collect(Collectors.toList());
        System.out.println("\nfilteredPeople: ");
        filteredPeople.forEach(System.out::println);

    }

    private static void task2() {
        System.out.println("\n===== Task 2 =====");

        List<String> strings = Arrays.asList(
                "Apple", "Banana", "Avocado", "Cherry", "Apricot", "Blueberry", "Ananas"
        );
        System.out.println("strings: " + strings);

        List<String> filteredSortString = strings.stream()
                .filter(s -> s.startsWith("A"))
                .sorted()
                .collect(Collectors.toList());
        System.out.println("filteredSortString: " + filteredSortString);
    }


    private static void task1() {
        System.out.println("\n===== Task 1 =====");

        List<Integer> numbers = Arrays.asList(5, 8, 20, 55, 102, 11, 78, 100, 44, 9, 2, 18);
        System.out.println("numbers: " + numbers);

        List<Integer> filteredNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .filter(n -> n > 10 && n < 100)
                .collect(Collectors.toList());
        System.out.println("filteredNumbers: " + filteredNumbers);


    }


}
