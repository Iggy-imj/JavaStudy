package lesson_16;

import java.util.Random;

public class ArrayExample {
    public static void main(String[] args) {

        int x;
        x = 10;

        int[] array; // обьявление массива целых чисел
        // int array[] - альтернативная форма записи. не рекомендуется к использованию
        String[] strings; // обьявляю массив строк

        array = new int[4]; // инициализация массива - 4 ячейки для хранения
        strings = new String[10]; // на 10 ячеек

        int[] array2 = new int[8]; // обьявление и инициализация
        boolean[] bools = new boolean[3];

        // получить из масива значение , находящееся в ячейке с индексом 0
        int value = array2[0]; // значение по индексу
        System.out.println("array2[0] - " + value);
        System.out.println("array2[7] - " + array2[7]);

        System.out.println("bools[1] - " + bools[1]);

        System.out.println("strings[7] - " + strings[9]);

        /*
        Значения по умолчанию для типа данных
        1. Для всех числовых типов ( в том числе тип char) это будет 0 (0.0)
        2. Для boolean - false
        3. Для всех ссылочных типов данных - null (ничего)
         */

        System.out.println(array2); // распечатать все значения в массиве так не получится
        // получим ссылку на адрес где хранятся значения

        // явная инициализация массива значениями
        int[] numbers = new int[]{45, 56, -16, 0, 159}; // будет создан массив размером равным количеству элементов в {}
        int[] ints = {-10, 54, 32, 333, 444}; // короткая форма

        int val = numbers[0];
        System.out.println("numbers[0] - " + val);
        System.out.println("numbers[4] - " + numbers[4]);

        numbers[2] = 100; // присвоение нового значения во 2-ю ячейку

        int len = numbers.length; // длинна массива или количсество ячеек в масиве
        System.out.println("numbers.length - " + len);

        // п
        System.out.println("Значения массива");
        int i = 0;

        while (i < numbers.length) {
            System.out.print(numbers[i] + ", ");
            i++;
        }
        System.out.println();

        // создать масив на 10 эл случ чисел от 0 до 100 вкл

        Random random = new Random();

        int[] num = new int[10];
        i = 0;
        System.out.print("[");
        while (i < num.length) {
            num[i] = random.nextInt(101);
            System.out.print(num[i] + ", ");
            i++;
        }
        System.out.println("]");
        System.out.println("С новой строки");

        // найти минимальное значение в массиве

        int min = num[0];
        i = 0;
        while (i < num.length) {
            if (num[i] < min) min = num[i];
            i++;
        }
        System.out.println("Минимальное значение в массиве: " + min);
















    }
}
