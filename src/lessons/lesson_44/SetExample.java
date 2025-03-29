package lessons.lesson_44;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {

        String str = "abc";

        System.out.println(str.hashCode());

        String str2 = "abc";
        System.out.println(str.equals(str2));
        System.out.println(str2.hashCode());

        System.out.println("\n>------\n");

        // Конструкторы
        Set<Integer> set = new HashSet<>(); //
        set = new HashSet<>(20);
        set = new HashSet<>(List.of(1, 2, 3, 5, 6, 5, 6, 3, 6, 0));

        System.out.println(set);

        List<Integer> startValues = List.of(15, 1, 2, 3, 4, 3, 8, 6, 15, 7, 0, 16, 32);
        // HashSet - не поддерживает порядок добавления элементов
        Set<Integer> integers = new HashSet<>(startValues);
        System.out.println("hashSet: " + integers);

        // LinkedHashSet - сохраняет порядок добавления элементов
        Set<Integer> linkedSet = new LinkedHashSet<>(startValues);
        System.out.println("linkedSet: " + linkedSet);

        // Методы интерфейсов Set

        // boolean add(E e)
        System.out.println("integers.add(100): " + integers.add(100)); // true
        System.out.println(integers);
        System.out.println("integers.add(100)#2: " + integers.add(100)); // false - элемент не добавлен тк такое значение уже есть

        System.out.println("\n>------\n");

        // boolean remove(Object o) - удаляет элемент по значению
        System.out.println(integers.remove(100)); // true
        System.out.println(integers);

        System.out.println("\n>------\n");

        // boolean contains(Object o)
        System.out.println("100: " + integers.contains(100));

        System.out.println("32: " + integers.contains(32));

        // int size()
        // boolean isEmpty()
        // clear()

        System.out.println("\n>------\n");

        // iterator() - возвращает итератор для элементов сет-а
        // наличие итератора позволяет последовательно перебирать все элементы циклом for-each

        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.print(value + ", ");
        }
        System.out.println();

        for (Integer val : integers) {
            System.out.print(val + ", ");
        }
        System.out.println();

        System.out.println("\n>------\n");

        // Убрать дубликат
        System.out.println("startValues: " + startValues);
        List<Integer> result = getUniqueList(startValues);
        System.out.println("getUniqueList: " + result);
        result.add(15);
        result.add(15);
        System.out.println(result);

        System.out.println("\n>------\n");
        // SortedSet - расширяет интерфейс Set

        // SortedSet Конструкторы
        // Пустой - естественный порядок сортировки
        SortedSet<Integer> sortedSet = new TreeSet<>(); // пустое упорядоченное множество
        sortedSet.add(100);
        sortedSet.add(32);
        sortedSet.add(150);
        sortedSet.add(125);

        System.out.println("sortedSet: " + sortedSet);

        // Принимает коллекцию. Создает set из элементов коллекции. Сортировка в естественном порядке
        sortedSet = new TreeSet<>(startValues);
        System.out.println("sortedSet: " + sortedSet);

        // Конструктор с компаратором, определеяющим порядок хранения элементов
        SortedSet<Integer> treeSet = new TreeSet<>(Comparator.reverseOrder()); // обратный порядок
        treeSet.addAll(startValues);
        treeSet.add(10);
        System.out.println("treeSet: " + treeSet);


        treeSet = new TreeSet<>((i1, i2) -> Integer.compare(i2, i1));
        treeSet.addAll(startValues);

        treeSet = new TreeSet<>(startValues);
        System.out.println("treeSet: " + treeSet);

        // first() - возвращает самый первый
        System.out.println("treeSet.first(): " + treeSet.first());

        // last()
        System.out.println("treeSet.last(): " + treeSet.last());

        // SortedSet<E> headSet(E element) - возвращает часть множества, элементы которого строго меньше чем element
        SortedSet<Integer> headSet = treeSet.headSet(6);
        System.out.println("treeSet.headSet(6): " + headSet);

        // SortedSet<E> tailSet(E element) - елементы которые больше или равны element
        SortedSet<Integer> tailSet = treeSet.tailSet(6);
        System.out.println("treeSet.tailSet(6): " + tailSet);

        // SortedSet<E> subSet(E from, E to) - в диапазоне от from(включительно) element до to(не включительно) element
        SortedSet<Integer> subSet = treeSet.subSet(6,16);
        System.out.println("treeSet.subSet(6,16): " + subSet);

        // comparator() - возвращает компаратор, используемый для упорядочивания элементов в этом множестве
        // если используется естественный порядок - вернется null

        homework("Test  _  string  _  , with  _   words!@!##@%$$#^%^^*&^(*&(*");


    }

    private static void homework(String testStr) {
        //  Заменить все не буквы на пустоту
        // заменить символ которые не явзяется буквой, цифрой или пробелом на пустоту
        String newString = testStr.replaceAll("[^a-zA-Zа-яА-я0-9 ]", "");
        System.out.println("newString: " + newString);

//        // преобразование строки в массив слов
//        String str = String.join(" ", "Hello", "Java", "Test");
//        System.out.println("str: " + str);

        // Преобразование строки в массив слов
        // s+ - в регулярках обозначает пробельный символ в количестве 1шт или больше
        String[] words = newString.split("\\s+");
        System.out.println(Arrays.toString(words));

        // Array.asList(T[] array) - преобразует массив в список  (List)
        List<String> list = Arrays.asList(words);
        System.out.println("list: " + list);

    }

    private static <T> List<T> getUniqueList(List<T> list) {
        // Получить коллекцию, состоящую из уникальных элементов (убрать дубликаты)
        // ПС Позаботиться о сохранении порядка элементов изначального списка

        Set<T> set = new LinkedHashSet<>(list);

        // Преобразовать кол-цию уникальных элементов в список

        return new ArrayList<>(set);

    }
}
