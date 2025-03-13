package homeworks.homework_15;
/*Task 3 (Повышенной сложности, опционально)
Программа предлагает пользователю ввести четырехзначное число.
Ввод осуществляется только в формате строки (String).
Если введенное значение не является четырехзначным числом, должно выводиться сообщение об ошибке, и программа завершает работу.
Проверить, является ли число "счастливым билетом". Для этого нужно сравнить сумму первых двух цифр с суммой последних двух цифр.
        Примеры:

        - Число 1450 -> (1+4) = 5; (5+0) = 5; 5 равно 5 - число счастливое.
        - Число 1654 -> (1+6) = 7; (5+4) = 9; 7 не равно 9 - число НЕ является счастливым.
 */

import java.util.Scanner;

public class Task03_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите четырехзначное число:");
        String inputVar = scanner.nextLine();

        int length = inputVar.length();

        boolean onlyDigits = inputVar.matches("\\d+");

        if (!onlyDigits) {
            System.out.println("Опа! Ты ввел не число. Пока!");
            return;
        }

        if (length == 4) {
            int sumFirst = inputVar.charAt(0) + inputVar.charAt(1);
            int sumLast = inputVar.charAt(2) + inputVar.charAt(3);
            if (sumFirst == sumLast) {
                System.out.println(inputVar + " - число счастливое!");
            } else {
                System.out.println(inputVar + " - число обычное");
            }
        } else {
            System.out.println("Ошибка! Число не 4-х значное. Пока!");
        }






    }
}
