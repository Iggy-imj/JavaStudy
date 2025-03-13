package lessons.lesson_22;

public class Les22Main {
    public static void main(String[] args) {

        int[] numbers = new int[5];
        // [1, 3, 56, 5, 4] не могу удалить значение. могу перезаписать или записать 0
        // хочу создать гибкий/умный массив.
        // например написать add(100) добавить ячейку со значением 100
        // удалить remove(199) и тд и тп

        MagicArray magic = new MagicArray();

        System.out.println(magic.toString());


        magic.add(5);
        magic.add(20);
        magic.add(0);
        magic.add(100);
        magic.add(1, 3, 4);
        magic.add(12, 20, 12);

        System.out.println("Количество элементов в массиве - " + magic.size());

        String arrayToString = magic.toString();
        System.out.println("arrayToString " + arrayToString);

        System.out.print("Внутренний массив  ");
        magic.test();

        System.out.println("\n===============");

        int value = magic.get(0);
        System.out.println("magic.get(0)  " + value);


        //System.out.println("magic.get(0)  " + magic.get(38));

        int oldValue = magic.remove(9);
        System.out.println("magic.remove(3) "+ oldValue);
        System.out.println(magic.toString());
        System.out.println("size - "+ magic.size());
        magic.add(1000);

        System.out.print("Внутренний массив: ");
        magic.test();

        System.out.println("\n===============");
        System.out.println("magic.indexOf(21): " + magic.indexOf(21));

        int index = magic.indexOf(21);
        System.out.println("index: " + index);
        if (index >= 0) {
            System.out.println("Значение было найдено");
        } else {
            System.out.println("Вернулся отрицательный индекс -  такого значения в массиве нет");
        }

        // удалить элемент по значению
        System.out.println("magic.removeByValue(21): " + magic.removeByValue(21));



        // индекс последнего вхождения
        System.out.println("\n===============");
        System.out.println("индекс последнего вхождения");
        System.out.println("magic.lastIndexOf(20): " + magic.lastIndexOf(20));
        index = magic.indexOf(20);
        if (index >= 0) {
            System.out.println("Значение было найдено");
        } else {
            System.out.println("Вернулся отрицательный индекс -  такого значения в массиве нет");
        }



        System.out.println("\n===============");
        System.out.println("Конструктор, принимающий обычный массив");

        int[] initialArray = {1, 2, 3, 4, 5};
        MagicArray magicArray = new MagicArray(initialArray);
        System.out.println(magicArray.toString());

        magicArray.add(4);
        System.out.println("magicArray" + magicArray);

        System.out.println("size(): " + magicArray.size());

        System.out.println("get(3): " + magicArray.get(3));

        System.out.println("remove(4): " + magicArray.remove(4));
        System.out.println(magicArray.toString());

        System.out.println("lastIndexOf(4): " + magicArray.lastIndexOf(4));

        System.out.println("removeByValue(6): " + magicArray.removeByValue(6));
        System.out.println(magicArray.toString());

        System.out.println("===============");
    }
}
