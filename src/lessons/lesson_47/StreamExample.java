package lessons.lesson_47;

// Stream API
// Pipeline

import homeworks.hw_46.Task_2.Library;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    /*
    Промежуточные методы (Все возвращают поток):
    Stream<T> filter(Predicate<T> predicate) -  оставляет в потоке только те элементы,
    для которых предикат вренет тру

    sorted() - сортирует потом в естественном порядке
    sorted(Comparator<T> comparator) - сортирует элементы потока с использованием компаратора

    Stream<R> map(Function<T, R> action) - преобразует элементы потока с использованием заданной функции,
    в том числе в другой тип данных

    Stream<T> peek(Consumer<T> action) - выполняет действие для каждого элемента потока
    и как правило не изменяющее элемент

    distinct() - удаляет дубликаты из потока


    ----
    Терминальные методы:

    R collect(Collector<T, A, R> collector) - преобразует элементы потока в разные виды коллекций
    или другие структуры данных

    void foreach(Consumer<T> action) - выполняет заданное действие для каждого элемента


     */
    public static void main(String[] args) {

//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
//        task6();
//        task7();
//        task8();
//        task9();
        task10();

    }

    private static void task10() {

        // удалить дубликаты значений из списка
        List<Integer> integers = Arrays.asList(10, 20, 30, 20, 30, 50, 0);

        List<Integer> unique = integers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(unique);

        System.out.println("\n========");

        Cat cat = new Cat("Bear", 5, "braun");
        Cat cat1 = new Cat("Python", 7, "green");
        Cat cat2 = new Cat("Tiger", 3, "yellow");
        Cat cat3 = new Cat("Panda", 4, "black");
        Cat cat4 = new Cat("Panda", 4, "black");

        List<Cat> cats = Arrays.asList(cat,cat1,cat2,cat3,cat4,cat);

        cats.forEach(System.out::println);

        System.out.println("\n==== Filter ====\n");

        cats.stream()
                .distinct()
                .forEach(System.out::println);

    }

    private static void task9() {
        // создание стрима из Мар
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", -10);
        map.put("Cherry", 5);

        // создание стрима из элементов entrySet
        map.entrySet().stream()
                .filter(entry -> entry.getValue() > 0)
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

        System.out.println("map: " + map);
    }

    private static void task8() {
        Cat cat = new Cat("Bear", 5, "braun");
        Cat cat1 = new Cat("Python", 7, "green");
        Cat cat2 = new Cat("Tiger", 3, "yellow");
        Cat cat3 = new Cat("Panda", 4, "black");

        Cat[] cats = {cat, cat1, null, cat2, new Cat(null, 10, "red"), cat3};

        // получить список кошек им длинее 4

        // Arrays.stream(cats) // создает поток из элементов массива

        List<Cat> longCats = Arrays.stream(cats)
//                .filter(c -> c != null) //  оставить только не null
//                .filter(c -> Objects.nonNull(c))
                .filter(Objects::nonNull) // оставить в потоке только не налл
                .filter(c -> Objects.nonNull(c.getName())) // проверка поля на налл
                .filter(c -> c.getName().length() > 4)
                .collect(Collectors.toList());

        System.out.println(longCats);

    }


    private static void task7() {
        List<Cat> cats = getListCats();

        // вес меньше 5 / остаток котов после фильтрации

        Stream<String> catStream = cats.stream()
                .peek(System.out::println)
                .filter(cat -> cat.getWeight() < 5)
                .peek(cat -> System.out.println("After filter: " + cat))
                .map(cat -> cat.getName());

        catStream.forEach(name -> System.out.println("Terminal: " + name));

    }

    private static void task6() {
        List<Cat> cats = getListCats();

        // имена короче 5 символов

        List<String> names1 = cats.stream()
                .filter(cat -> cat.getName().length() < 5)
                .map(Cat::getName)
                .collect(Collectors.toList());

        System.out.println(names1);

        System.out.println("\n=======");
        List<String> names2 = cats.stream()
                .map(Cat::getName)
                .filter(name -> name.length() < 5)
                .collect(Collectors.toList());
        System.out.println(names2);
    }


    private static void task5() {
        List<Cat> cats = getListCats();
        // получить список с кошками чей вес больше 4х

        List<String> names = cats.stream()
                .filter(cat -> cat.getWeight() > 4)
                .map(cat -> cat.getName())
                .collect(Collectors.toList());
//                .map(Cat :: getName)

        System.out.println(names);


    }

    private static void task4() {
        List<Cat> cats = getListCats();
        // получить список имен
        Stream<String> namesStream = cats.stream()
                .map(cat -> cat.getName());

        List<String> catNames = cats.stream()
                .map(Cat::getName)
                .collect(Collectors.toList());

        System.out.println("catNames: " + catNames);

        // Изначальная коллекция (источник данных для потока) не изменяется
        System.out.println(cats);

//        List<String> listNames = new ArrayList<>();
//        for (Cat cat : cats) {
//            listNames.add(cat.getName());
//        }

    }


    private static void task3() {
        List<Cat> cats = getListCats();

        // коты с именем больше 4х симв
        Stream<Cat> stream = cats.stream()
                .filter(c -> c.getName().length() > 4);

        // пока не запущен терминальный метод, промежуточные операции не выполняются
        List<Cat> longNames = stream.collect(Collectors.toList());
        System.out.println("longNames: " + longNames);

    }


    private static void task2() {
        List<Cat> cats = getListCats();
        // список кошек с весом больше 4х
        Stream<Cat> catStream = cats.stream()
                .filter(cat -> cat.getWeight() > 4);

        // терминальный метод
        List<Cat> fatCats = catStream.collect(Collectors.toList());

        System.out.println("fatCats: " + fatCats);

        // повторно использовать закрытый поток нельзя. Закрытый поток на котором уже был вызван терминальный метод
//        List<Cat> catList2 = catStream.sorted().collect(Collectors.toList()); // будет ошибка
    }


    private static void task1() {
        List<Integer> integers = List.of(-1, 12, 0, 5, 1, -15, 24, 99);
        // получить список содержащий все полодительные числа из исходного списка
        // Список должен быть отсортирован в порядке возростания

        List<Integer> result = new ArrayList<>();
        for (Integer num : integers) {
            if (num > 0) {
                result.add(num);
            }
        }

        result.sort(Comparator.naturalOrder());
        System.out.println("result: " + result);

        // у всех коллекций есть метод .stream() создающий поток элементов коллекции

        List<Integer> integerList = integers.stream() // создание потока из элементов коллекции List
                .filter(e -> e > 0) //  фильтрация элементов потока
                .sorted() // сортировка элементов в естественном порядке
                .collect(Collectors.toList()); // собирает элементы потока в коллекцию List

        System.out.println("List: " + integerList);
    }


    private static List<Cat> getListCats() {
        return List.of(
                new Cat("Bear", 5, "braun"),
                new Cat("Python", 7, "green"),
                new Cat("Tiger", 3, "yellow"),
                new Cat("Panda", 4, "black")
        );
    }
}
