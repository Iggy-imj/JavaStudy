package lessons.lesson_13;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Прочитать строку
        System.out.println("Введите ваше имя: ");
        // читает всю строку введенную пользователем и возвращает ее в виде String
        String name = scanner.nextLine();
        System.out.println("Privet, " + name);

        // Прочитать число
        System.out.println("Введите возраст: ");
        int age = scanner.nextInt(); // считает одно число типа int
        // Всегда после вызовов методов nextInt, nextDouble, next() и т.п.
        // следует вызвать метод nextLine() чтобы скушать остаток строки
        scanner.nextLine();
        System.out.println("Age: " + age);

        System.out.println("Введите город: ");
        String city = scanner.nextLine();
        System.out.println("Город: " + city);

        // Разделитель -  пробельный символ
        /*
        \s - пробельный символ
        - пробел
        - \t - знак табуляции
        - \n - перевод каретки
        - \r - возврат каретки
         */

        System.out.println("Введите число Pi: ");
        double pi = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Pi: " + pi);




    }
}
