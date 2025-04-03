package homeworks.hw_48;

import java.util.*;
import java.util.stream.Collectors;

public class Tasks {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }


    private static void task1() {
        System.out.println("\n===== Task 1 =====\n");
        List<Integer> list = List.of(1, 25, 34, 17, 9, 45, 18, 100, 27);

        List<Integer> result = list.stream()
                .filter(n -> n > 10)
                .sorted(Comparator.comparingInt(n -> n % 10))
                .collect(Collectors.toList());

        System.out.println("Отсортированные числа > 10 по последней цифре: " + result + "\n");
    }

    private static void task2() {
        System.out.println("\n===== Task 2 =====\n");
        List<String> strings = List.of("cat", "elephant", "dog", "fox", "hippo");

        String minLengthStr = strings.stream()
                .min(Comparator.comparingInt(String::length))
                .orElse(null);

        System.out.println("Самая короткая строка: " + minLengthStr + "\n");
    }

    private static void task3() {
        System.out.println("\n===== Task 3 =====\n");
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6);

        List<Integer> processed = nums.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .collect(Collectors.toList());

        System.out.println("Чётные числа * 2: " + processed + "\n");

    }

    private static <K, V> void printMap(Map<K, V> map) {
        map.forEach((k, v) -> System.out.println(k + ": " + v));
        System.out.println("\n=========");
    }

    private static void task4() {
        System.out.println("===== Task 4 =====");
        List<Student> students = List.of(
                new Student("Anna", 20, "Computer Science", 1, 3.5),
                new Student("Bob", 22, "Math", 2, 4.1),
                new Student("Clara", 21, "Computer Science", 2, 3.9),
                new Student("Dan", 23, "Physics", 3, 4.7),
                new Student("Eve", 19, "Math", 1, 3.3),
                new Student("Frank", 20, "Computer Science", 1, 4.0),
                new Student("Grace", 24, "Physics", 4, 4.2),
                new Student("Hugo", 22, "Math", 3, 3.1),
                new Student("Ivy", 20, "Computer Science", 2, 3.8),
                new Student("Jack", 25, "Physics", 4, 4.5)
        );

        // 1 Группировка по специальности
        // Сгруппируй студентов по специальности (поле major) в Map<String, List>.
        Map<String, List<Student>> byMajor = students.stream()
                .collect(Collectors.groupingBy(Student::getMajor));

        System.out.println("\nГруппировка по специальности:");
        printMap(byMajor);

        // 2 Группировка по курсу с использованием Set
        // Сгруппируй студентов по курсу (year), при этом сохрани их в виде Set.
        Map<Integer, Set<Student>> byYear = students.stream()
                .collect(Collectors.groupingBy(Student::getYear, Collectors.toSet()));

        System.out.println("\nГруппировка по курсу (Set):");
        printMap(byYear);

        // 3 Подсчёт количества студентов по специальности
        // Построй Map<String, Long>, где ключ — специальность, а значение — количество студентов на этой специальности.
        Map<String, Long> countByMajor = students.stream()
                .collect(Collectors.groupingBy(Student::getMajor, Collectors.counting()));

        System.out.println("\nКоличество студентов по специальности:");
        printMap(countByMajor);

        // 4 Средний балл по специальности
        // Построй Map<String, Double>, где ключ — специальность, а значение — средняя оценка студентов на этой специальности.
        Map<String, Double> avgGradeByMajor = students.stream()
                .collect(Collectors.groupingBy(Student::getMajor, Collectors.averagingDouble(Student::getGrade)));

        System.out.println("\nСредний балл по специальности:");
        printMap(avgGradeByMajor);

        // 5 Список оценок по специальности
        // Построй Map<String, List>, где хранятся только оценки по каждой специальности.
        Map<String, List<Double>> gradesByMajor = students.stream()
                .collect(Collectors.groupingBy(Student::getMajor,
                        Collectors.mapping(Student::getGrade, Collectors.toList())));

        System.out.println("\nСписок оценок по специальности:");
        printMap(gradesByMajor);

        // 6 Суммарная статистика по возрасту
        // Используй IntSummaryStatistics, чтобы получить:
        // минимальный возраст,
        // максимальный возраст,
        // средний возраст,
        // общее количество студентов,
        // сумму всех возрастов.
        IntSummaryStatistics stats = students.stream()
                .collect(Collectors.summarizingInt(Student::getAge));
        System.out.println("\nСтатистика по возрасту:");
        System.out.println("Min: " + stats.getMin());
        System.out.println("Max: " + stats.getMax());
        System.out.println("Average: " + stats.getAverage());
        System.out.println("Count: " + stats.getCount());
        System.out.println("Sum: " + stats.getSum());
    }
}
