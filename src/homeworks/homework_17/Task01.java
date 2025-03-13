package homeworks.homework_17;
/*
Task 1
Написать метод, принимающий на вход строку.
Метод должен вывести на экран число, соответсвующее количеству символов в строке.
Например: Если в метод пришла строка "hello" - метод должен вывести число 5 (так как в строке hello 5 символов)
 */

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        String text = getInput();
        printCharacterCount(text);
    }

    //
    public static String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи слово: ");
        String text = scanner.nextLine();
        return text;
    }

    //
    public static void printCharacterCount(String text) {
        System.out.println("Символов в строке: " + text.length());
    }
}