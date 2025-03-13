package lessons.lesson_33;

// есть два интерфейса Iterable и Iterator
//1.// Iterable - означает что обьекты этого класса можно перебирать последовательно
    // содержит один абстрактный метод
    // Iterator<T> iterator() - возвращает итератор для этого набора элементов (коллекции)
//2.// Iterator - собственно итератор, который позволяет обходить коллекцию
    // - boolean hasNext() - есть ли следующий элемент
    // - Т next() - возвращает следующий элемент
    // - void remove() - удаляет последний возвращенный элемент (не обязателен для переопределения)

import lists.MyArrayList;
import lists.MyList;

import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        MyList<String> list = new MyArrayList<>();

        list.addAll("Ykfmkg", "dwdwd", "efwerfe", "hycbwehjcb");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String strCurrent = iterator.next();
            System.out.println(strCurrent);
        }

        //for-each

        for (String strCurrent : list) {
            System.out.println(strCurrent);
        }

        MyList<Integer> integers = new MyArrayList<>();
        integers.addAll(1,2,3,4,5,6);

        // Вывести все числа, которые есть в списке умноженные на 2

        //1
        for (Integer integer : integers) {
            System.out.println(integer * 2);
        }

        //2
        for (Integer value : integers) {
            System.out.println(value * 2);
        }

        int[] array = {10,20,30,40,50};
        for (int element : array) {
            System.out.println(element);
        }


    }
}
