package homeworks.homework_13;
/*Task 1
Напишите программу, которая будет просить у пользователя ввести его имя с клавиатуры.
1 - Используя Scanner, сохраните имя в переменную типа String.
2 - Выведите на экран количество символов в имени пользователя.
3 - Создайте две переменные типа char: одна должна хранить первый символ имени, другая — последний.
4 - Выведите на экран десятичный код (код символа в десятичной системе счисления) первого и последнего символа имени.
 */

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();

        // 2
        int length = name.length();
        System.out.println("Количество символов в имени: " + length);

        // 3
        char firstChar = name.charAt(0);
        char lastChar = name.charAt(length - 1);

        System.out.println("Первый символ: " + firstChar);
        System.out.println("Последний символ: " + lastChar);

        // 4
        System.out.println("Десятичный код первого символа: " + (int) firstChar);
        System.out.println("Десятичный код последнего символа: " + (int) lastChar);
    }

}
