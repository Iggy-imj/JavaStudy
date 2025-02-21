package lesson_14;

import java.util.Locale;
import java.util.Scanner;

public class ScannerLocale {
    public static void main(String[] args) {

        String data = "3,14 42,7";

        Scanner sc = new Scanner(data);

        // sc.useLocale(Locale.US);
        sc.useLocale(Locale.GERMANY);


        // Locale - используется в вашей системе для определния формата чисел
        // в том числе каким знаком отделяется дробная часть числа

        System.out.println(sc.nextDouble());
        System.out.println(sc.nextDouble());

        System.out.println(Locale.getDefault());

        System.out.println("\n-------------\n");

        String text = "42,Java,3.14,Hello";
        Scanner scanner = new Scanner(text);

        scanner.useLocale(Locale.US); // устанавливаем локаль
        scanner.useDelimiter(",");
//      регулярные выражения -  можно разделители указывать -  например: "[;|]" или "\\s*,\\s*"

        System.out.println(scanner.next());
        String java = scanner.next();
        System.out.println(java);
        System.out.println(scanner.next());
        System.out.println(scanner.next());

        scanner.reset(); // вернуться к стандартному разделителю
    }
}
