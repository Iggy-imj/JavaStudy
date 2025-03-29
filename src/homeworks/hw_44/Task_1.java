package homeworks.hw_44;
/*
Напишите метод, принимающий строку и возвращающий Список ее слов без повторений,
отсортированный в порядке увеличения длин слов.
Если строки имеют одинаковую длину - сортировать в естественном порядке
public static void main(String[] args) {
        String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
        System.out.println(StringUtil.getUniqueSortedWords(testString));
    }
// Output:
[для, слов, строка, которые, Тестовая, удаления, повторяются]
 */

import java.util.*;

public class Task_1 {
    public static void main(String[] args) {
        String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
        System.out.println(getUniqueSortedWords(testString));
    }

    private static <T> List<T> getUniqueList(List<T> list) {
        // Получить коллекцию, состоящую из уникальных элементов (убрать дубликаты)
        // ПС Позаботиться о сохранении порядка элементов изначального списка
        Set<T> set = new LinkedHashSet<>(list);
        // Преобразовать кол-цию уникальных элементов в список
        return new ArrayList<>(set);
    }

    public static List<String> getUniqueSortedWords(String input) {
        String cleanedInput = input.replaceAll("[^a-zA-Zа-яА-Я0-9 ]", "");
        String[] words = cleanedInput.split("\\s+");

        List<String> sortedWords = getUniqueList(Arrays.asList(words));

        sortedWords.sort(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()));
        return sortedWords;
    }
}
