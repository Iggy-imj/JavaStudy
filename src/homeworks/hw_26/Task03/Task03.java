package homeworks.hw_26.Task03;
/*
Task 3 * Опционально
Написать метод, который запрашивает у пользователя строку,
состоящую из несколько слов и возвращающий аббревиатуру этой фразы
(первые буквы каждого слова, записанные в верхнем регистре)
Например:
научно исследовательский институт -> НИИ
 */

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напиши несколько слов: ");
        String input = scanner.nextLine();

        String[] words = input.split(" ");
        StringBuilder abbreviation = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (!words[i].isEmpty()) {
                abbreviation.append(words[i].charAt(0));
            }
        }
        System.out.println("Аббревиатура: " + abbreviation.toString().toUpperCase());


    }

}
