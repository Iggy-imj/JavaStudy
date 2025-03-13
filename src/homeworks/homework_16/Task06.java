package homeworks.homework_16;
/*
Task 6
Дан массив целых чисел. Поменять местами элементы с максимальным и минимальным значениями.

Пример:

{ 5, 6, -25, 0, 31, -15 } -> { 5, 6, 31, 0, -25, -15 }
 */

import java.util.Random;

public class Task06 {
    public static void main(String[] args) {
        Random random = new Random();

        int n = random.nextInt(11) + 5;
        System.out.println("Массив длины - " + n);

        int[] array = new int[n];
        int i = 0;
        System.out.print("[");
        while (i < array.length) {
            array[i] = random.nextInt(101) - 50;
            System.out.print(array[i] + ", ");
            i++;
        }
        System.out.println("]");
//  min
        int min = array[0];
        int minIndex = 0;
        i = 1;
        while (i < array.length) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
            i++;
        }
        System.out.println("Минимальное значение в массиве: " + min);

//  max
        int max = array[0];
        int maxIndex = 0;
        i = 1;
        while (i < array.length) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
            i++;
        }
        System.out.println("Максимальное значение в массиве: " + max);

//  swap
        int temp = array[minIndex];
        array[minIndex] = array[maxIndex];
        array[maxIndex] = temp;

        System.out.print("Массив после замены местами: [");
        i = 0;
        while (i < array.length) {
            System.out.print(array[i] + ", ");
            i++;
        }
        System.out.println("]");
    }
}
