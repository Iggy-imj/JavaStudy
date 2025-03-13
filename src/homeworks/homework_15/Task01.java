package homeworks.homework_15;
/* Task 1
Запишите в 4 переменные случайные числа от 0 до 100.
Выведите все 4 числа на экран.
Программа должна определить максимальное из этих четырех чисел и вывести результат на экран.
    Output:
Максимальное число: 33
 */

import java.util.Random;

public class Task01 {
    public static void main(String[] args) {
        Random random = new Random();

        int a = random.nextInt(101);
        int b = random.nextInt(101);
        int c = random.nextInt(101);
        int d = random.nextInt(101);

        System.out.println("Случайные числа: " + a + ", " + b + ", "  + c + ", "  + d);

        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        if (d > max) max = d;

        System.out.println("Максимальное число: " + max);
    }
}
