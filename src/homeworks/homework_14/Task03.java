package homeworks.homework_14;
/*Task 3
Попросите пользователя ввести целое число с клавиатуры.
Ваша программа должна вывести строку в формате:
- Число: 6 четное: true; кратно 3: true; четное и кратное 3: true
- Число: 3 четное: false; кратно 3: true; четное и кратное 3: false
Проверьте работу вашей программы, вводя разные числа. Убедитесь в правильности выдаваемой строки.
*/

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введи целое число: ");
        int var = scanner.nextInt();

        // 1
        System.out.println("- Число: " + var + " четное: " + (var % 2 == 0) + "; " + "кратно 3: " + (var % 3 == 0) + "; "
                +"четное и кратное 3: " + (var % 2 == 0 && var % 3 == 0) + "\n");

        // 2
        boolean isEven = var % 2 == 0;
        boolean isMultiple3 = var % 3 == 0;
        boolean isEvenAndMultiple3 = isEven && isMultiple3;

        System.out.printf("Число: %d%n - четное: %b;%n - кратно 3: %b;%n - четное и кратное 3: %b.",
                var, isEven, isMultiple3, isEvenAndMultiple3);
    }
}
