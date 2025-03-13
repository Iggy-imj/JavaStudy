package homeworks.homework_16;
/*
Task 5
Создать массив целых чисел произвольной длины от 5 до 15.
Заполнить массив случайными значениями от -50 до 50.
Вывести на экран:
- Минимальное значение в массиве
- Максимальное значение в массиве
- Среднее арифметическое всех значений в массиве
*/

import java.util.Random;

public class Task05 {
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
        i = 0;
        while (i < array.length) {
            if (array[i] < min) min = array[i];
            i++;
        }
        System.out.println("Минимальное значение в массиве: " + min);
//  max
        int max = array[0];
        i = 0;
        while (i < array.length) {
            if (array[i] > max) max = array[i];
            i++;
        }
        System.out.println("Максимальное значение в массиве: " + max);
//  avg
        i = 0;
        int sum = 0;
        while (i < array.length){
            sum += array[i];
            i++;
        }
        double avg = (double) sum / array.length;
        System.out.println("Среднее арифметическое: " + avg);
    }
}
