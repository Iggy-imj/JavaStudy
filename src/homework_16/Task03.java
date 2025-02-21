package homework_16;
/*
Task 3 *(Опционально)
Напишите программу, которая просит пользователя ввести слово "hello".
Если пользователь вводит правильное слово, программа благодарит его и завершает работу.
Если вводится неправильное слово, программа продолжает запрашивать ввод, пока не будет введено правильное слово.
Дополнительно: Подсчитайте количество попыток, потребовавшихся для ввода правильного слова, и выведите это количество на экран.
 */

import java.util.Locale;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 1;

        while (true){
            System.out.println("Напиши 'hello':");
            String input = scanner.nextLine();
            String inputClean = input.trim().toLowerCase();

            if (inputClean.equals("hello")){
                System.out.println("Супер! Ты справился! Количество попыток: " + n);
                break;
            }

            System.out.println("Это же не сложно. Просто введи 'hello'");
            System.out.println("Это твоя попытка № " + n);
            n++;
        }
    }
}
