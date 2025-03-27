package lessons.lesson_43;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        //Конструкторы

        // Конструкторы ArrayList
        List<Integer> list = new ArrayList<>();
        list = new ArrayList<>(50);
        list = new ArrayList<>(List.of(1, -10, 5, 0, 25, -100));

        // Конструктор LinkedList
        list = new LinkedList<>();
        list = new ArrayList<>(List.of(1, -10, 5, 0, 25, -100));

        //  Методы интерфейса лист

        // boolean add (E e) - добаление элементов в конец списка
        list.add(1000);
        list.add(-100);
        System.out.println("list: " + list);

        // void add(int index, E element) - добавляет элемент на указаную позицию
        list.add(3, 500);
        System.out.println("Лист: " + list);

        // E get(int index)
        int value = list.get(5);
        System.out.println("value: " + value);

        // E remove(int index) -  удаляет эелемент по индексу и возвращает старое значение
        System.out.println("list.remove(5): " + list.remove(5));
        System.out.println(list);

        // boolean remove(Object obj) - метода удаления по значению  - принимает ссылочный тип данных
        System.out.println("list.remove(Integer.valueOf(0)): " + list.remove(Integer.valueOf(0)));
        System.out.println("list: " + list);

        // int indexOf(Object obj)
        System.out.println("list.indexOf(значение которого нет): " + list.indexOf(4000)); // -1
        System.out.println("list.indexOf(-100): " + list.indexOf(-100));
        System.out.println("list.lastIndexOf(-100): " + list.lastIndexOf(-100));

        System.out.println("\n===");

        // void sort(Comparator<? super E> comparator) - сортирует список с использованием указанного компаратора

        list.sort((i1, i2) -> Integer.compare(i2, i1));
        list.sort(Comparator.reverseOrder());
        System.out.println(list);


        list.sort(Integer::compareTo);
        list.sort(Comparator.naturalOrder());

        System.out.println(list);

        // List<E> sublist(int indexFrom, int indexTo) - метод возвращает список из элементов,
        // находящихся на позициях от индекс такой-то - до индекс такой-то

        List<Integer> subList = list.subList(1, 5);
        System.out.println("subList(1,5): " + subList);


    }
}
