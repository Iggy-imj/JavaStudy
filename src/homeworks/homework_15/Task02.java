package homeworks.homework_15;
/*Task 2
Напишите программу с использованием оператора switch:
Программа просит пользователя ввести число от 1 до 7.
- Если число равно 1, выводим на консоль "Понедельник",
- 2 — "Вторник" и так далее.
- Если 6 или 7 — "Выходной".
 */

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число от 1 до 7:");
        int day = scanner.nextInt();
        scanner.nextLine();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday ");
                break;
            case 4:
                System.out.println("Thursday ");
                break;
            case 5:
                System.out.println("Friday ");
                break;
            case 6:
            case 7:
                System.out.println("Weekend ");
                break;
            default:
                System.out.println("Error!");
        }
    }
}
