package homework_13;
/*Task 3* (Опционально)
1. Попросите пользователя ввести строку чётной длины с клавиатуры.
2. Распечатайте два средних символа строки.
Например:
- Для строки "string" результат будет "ri".
- Для строки "code" результат будет "od".
- Для строки "Practice" результат будет "ct".
*/

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строчку четной длины: ");
        String input = scanner.nextLine();

        if (input.length() % 2 == 0) {
            int mid = input.length() / 2;
            System.out.println("Два средних символа: " + input.charAt(mid - 1) + input.charAt(mid));
        } else {
            System.out.println("Ошибка! Строка должна быть четной длины!");
        }
    }
}
