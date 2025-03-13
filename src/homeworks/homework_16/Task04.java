package homeworks.homework_16;
/*
Task 4 * (Опционально)
Программа запрашивает у пользователя ввод произвольного числа. Вывести сумму цифр этого числа.
Пример:
567432 -> 5+6+7+4+3+2 -> 27
 */

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введи любое число: ");
        long num = scanner.nextLong();
        long sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Сумма цифр: " + sum);
    }
}
