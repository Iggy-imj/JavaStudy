package lessons.lesson_48;

// Stream API
// Pipeline

import lessons.lesson_47.Cat;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExamplePart2 {
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

     limit(long maxSize) - ограничивает кол-во элементов потока. В потоке может быть не больше maxSize элементов

     skip(long n)

     Stream<T> mapToObj(Function() mapper) - преобразование примитивного типа данных в ссылочный при помощи заданной функции

     boxed() -  преобразует потока примитивов (IntStream и тп) в поток соответствующих оберток (Stream<Integer> )

     mapToInt() - преобразует поток Stream<Integer> в поток примитивов IntStream


    ----
    Терминальные методы:

    R collect(Collector<T, A, R> collector) - преобразует элементы потока в разные виды коллекций
    или другие структуры данных

    void foreach(Consumer<T> action) - выполняет заданное действие для каждого элемента

    Optional<T> max/min(Comparator<T> action)

    long count()

    Optional<T> findFirst() - получить первый эл. потока
    Optional<T> findAny()  -  получить случайный

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
//        task10();
//        task11();
//        task12();
//        task13();
//        task14();
//        task15();
        task16();


    }

    private static void task16() {
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // преобразовать массив примитивов в список, используя Stream API

        // Stream<int> - не бывает

        List<Integer> integers = Arrays.stream(ints)
                //.mapToObj(i -> Integer.valueOf(i))
                // работает автоупаковка int
                //.mapToObj(i -> i)
                .boxed()

                .collect(Collectors.toList());

        System.out.println(integers);

        // Получить из коллекции Integer - массив примитивов
        int[] intArray = integers.stream()
                // автораспаковка
                // хочет поток примитивов который запакует в массив
                .mapToInt(i -> i)
                .toArray();

        System.out.println("Массив: " + Arrays.toString(intArray));

    }

    private static void task15() {
        List<Integer> integers = List.of(5, 4, 13, 56, 24, -10, -5, 0, 45, -25);
        // получить 1-й самый левый элемент потока
        // альтернативный способ нахождения минимума
        Optional<Integer> first = integers.stream()
                .sorted()
                //.findFirst();
                .findAny();

        int min = first.get();
        System.out.println("min: " + min);

    }

    private static void task14() {
        List<Integer> integers = List.of(5, 4, 13, 56, 24, -10, -5, 0, 45, -25);
        // Получить список состоящий из 3х самых маленьких чисел списка
        List<Integer> smallest = integers.stream()
                .sorted()
                .limit(3)
                .collect(Collectors.toList());

        System.out.println("smallest: " + smallest);

        // Получить список чисел, отбросив 2 самых маленьких
        List<Integer> list = integers.stream()
                .sorted()
                .skip(2)
                .collect(Collectors.toList());
        System.out.println("list: " + list);


    }

    private static void task13() {
        List<Integer> integers = List.of(5, 4, 13, 56, 24, -10, -5, 0, 45, -25);
        // посчитать количество четных чисел в списке
        long count = integers.stream()
                .filter(n -> n % 2 == 0)
                .count();
        System.out.println("count: " + count);


    }

    private static void task12() {
        List<Cat> cats = getListCats();
        // найти самое длинное имя кота

        Optional<String> longestNameOptional = cats.stream()
                .filter(Objects::nonNull)
                .map(cat -> cat.getName())
                .filter(Objects::nonNull)
                .max(Comparator.comparing(String::length));
        if (longestNameOptional.isPresent()) {
            System.out.println("longestNameOptional.get(): " + longestNameOptional.get());
        } else {
            System.out.println("Not found");
        }
        String longestName = cats.stream()
                .map(Cat::getName)
                .max(Comparator.comparing(String::length))
                .orElse(null);
        System.out.println("longestName: " + longestName);
    }

    private static void task11() {
        List<Integer> integers = List.of(5, 4, 13, 56, 24, -10, -5, 0, 45, -25);
        // найти максимальное число из списка
        Optional<Integer> max = integers.stream()
                .max(Comparator.naturalOrder());
        System.out.println("max: " + max);
        System.out.println("max.orElse(null): " + max.orElse(null));

        // найти самое маленькое число в потоке, которое больше 100
        Optional<Integer> minVal = integers.stream()
                .filter(n -> n > 100)
                .min(Integer::compareTo);
        System.out.println("minVal: " + minVal);
        System.out.println("minVal.orElse(null): " + minVal.orElse(null));
    }

    private static void task10() {

        // удалить дубликаты значений из списка
        List<Integer> integers = Arrays.asList(10, 20, 30, 20, 30, 50, 0);

        List<Integer> unique = integers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(unique);

        System.out.println("\n========");

        lessons.lesson_47.Cat cat = new lessons.lesson_47.Cat("Bear", 5, "braun");
        lessons.lesson_47.Cat cat1 = new lessons.lesson_47.Cat("Python", 7, "green");
        lessons.lesson_47.Cat cat2 = new lessons.lesson_47.Cat("Tiger", 3, "yellow");
        lessons.lesson_47.Cat cat3 = new lessons.lesson_47.Cat("Panda", 4, "black");
        lessons.lesson_47.Cat cat4 = new lessons.lesson_47.Cat("Panda", 4, "black");

        List<lessons.lesson_47.Cat> cats = Arrays.asList(cat, cat1, cat2, cat3, cat4, cat);

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
        lessons.lesson_47.Cat cat = new lessons.lesson_47.Cat("Bear", 5, "braun");
        lessons.lesson_47.Cat cat1 = new lessons.lesson_47.Cat("Python", 7, "green");
        lessons.lesson_47.Cat cat2 = new lessons.lesson_47.Cat("Tiger", 3, "yellow");
        lessons.lesson_47.Cat cat3 = new lessons.lesson_47.Cat("Panda", 4, "black");

        lessons.lesson_47.Cat[] cats = {cat, cat1, null, cat2, new lessons.lesson_47.Cat(null, 10, "red"), cat3};

        // получить список кошек им длинее 4

        // Arrays.stream(cats) // создает поток из элементов массива

        List<lessons.lesson_47.Cat> longCats = Arrays.stream(cats)
//                .filter(c -> c != null) //  оставить только не null
//                .filter(c -> Objects.nonNull(c))
                .filter(Objects::nonNull) // оставить в потоке только не налл
                .filter(c -> Objects.nonNull(c.getName())) // проверка поля на налл
                .filter(c -> c.getName().length() > 4)
                .collect(Collectors.toList());

        System.out.println(longCats);

    }


    private static void task7() {
        List<lessons.lesson_47.Cat> cats = getListCats();

        // вес меньше 5 / остаток котов после фильтрации

        Stream<String> catStream = cats.stream()
                .peek(System.out::println)
                .filter(cat -> cat.getWeight() < 5)
                .peek(cat -> System.out.println("After filter: " + cat))
                .map(cat -> cat.getName());

        catStream.forEach(name -> System.out.println("Terminal: " + name));

    }

    private static void task6() {
        List<lessons.lesson_47.Cat> cats = getListCats();

        // имена короче 5 символов

        List<String> names1 = cats.stream()
                .filter(cat -> cat.getName().length() < 5)
                .map(lessons.lesson_47.Cat::getName)
                .collect(Collectors.toList());

        System.out.println(names1);

        System.out.println("\n=======");
        List<String> names2 = cats.stream()
                .map(lessons.lesson_47.Cat::getName)
                .filter(name -> name.length() < 5)
                .collect(Collectors.toList());
        System.out.println(names2);
    }


    private static void task5() {
        List<lessons.lesson_47.Cat> cats = getListCats();
        // получить список с кошками чей вес больше 4х

        List<String> names = cats.stream()
                .filter(cat -> cat.getWeight() > 4)
                .map(cat -> cat.getName())
                .collect(Collectors.toList());
//                .map(Cat :: getName)

        System.out.println(names);


    }

    private static void task4() {
        List<lessons.lesson_47.Cat> cats = getListCats();
        // получить список имен
        Stream<String> namesStream = cats.stream()
                .map(cat -> cat.getName());

        List<String> catNames = cats.stream()
                .map(lessons.lesson_47.Cat::getName)
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
        List<lessons.lesson_47.Cat> cats = getListCats();

        // коты с именем больше 4х симв
        Stream<lessons.lesson_47.Cat> stream = cats.stream()
                .filter(c -> c.getName().length() > 4);

        // пока не запущен терминальный метод, промежуточные операции не выполняются
        List<lessons.lesson_47.Cat> longNames = stream.collect(Collectors.toList());
        System.out.println("longNames: " + longNames);

    }


    private static void task2() {
        List<lessons.lesson_47.Cat> cats = getListCats();
        // список кошек с весом больше 4х
        Stream<lessons.lesson_47.Cat> catStream = cats.stream()
                .filter(cat -> cat.getWeight() > 4);

        // терминальный метод
        List<lessons.lesson_47.Cat> fatCats = catStream.collect(Collectors.toList());

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


    private static List<lessons.lesson_47.Cat> getListCats() {
        return List.of(
                new lessons.lesson_47.Cat("Bear", 5, "braun"),
                new lessons.lesson_47.Cat("Python", 7, "green"),
                new lessons.lesson_47.Cat("Tiger", 3, "yellow"),
                new Cat("Panda", 4, "black")
        );
    }
}
