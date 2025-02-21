package lesson_15;

import java.util.Random;
import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {

        // Switch - оператор используется, когда нужно выполнять разные
        // действия в зависимости от значения одной переменной или выражения
        // Это альтернатива множественным оператор if-else if, когда проверяется
        // равенство одной переменной с разными значениями

        // Особенно хорош, когда выбираем из известного и конечного количества вариантов

        int x = 5;

        if (x == 5) {
            System.out.println("if: x равен 5 ");
        } else if (x == 7) {
            System.out.println("if-else: x равен 7");
        } else {
            System.out.println("else: что-то другое");
        }

        /*
        switch (выражение) {
            сase значение1:
                // Блок кода для значение1
            case значение2:
                //Блок кода для значение2
            // ......
            default:
                // Блок кода по умолчанию (если ни одно значение не совпало)
        }
         */

        switch (x) {
            case 5:
                System.out.println("switch: x = 5");
                break; // - без брейк будет проскальзывание далее без проверки условия
            case 7:
                System.out.println("switch: x = 7");
                break;
            default:
                System.out.println("switch: что-то другое");
        }

        System.out.println("Строка за пределами Свича");

        // просим пользователя ввести число от 1 до 4. В зависимости от числа - выдать разное сообщение

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 4");
        int input = scanner.nextInt();
        scanner.nextLine();

        switch (input) {
            case  1:
                System.out.println("Вы ввели один");
                break;
            case 2:
                System.out.println("Вы ввели два");
                break;
            case 3:
            case 4:
                System.out.println("Вы ввели три или четыре");
                break;
            default:
                System.out.println("Таких чисел не знаю");
        }


        System.out.println("-----------------\n");

        /*
        Ребенок получает деньги за хорошие оценки за плохие отбирают.
        5 -> + 20
        4 -> +10
        3 -> +0
        2 -> -20
        1 -> All
         */


        Random random = new Random();
        int note = random.nextInt(5) + 1; // генерация случайного числа от 1 до 5 включительно
        int balance = 100;

        System.out.println("Ребенок получил оценку: " + note);

        switch (note) {
            case 5:
                balance += 20;
                break;
            case 4:
                balance += 10;
                break;
        //  case 3:
        //      balance += 0;
        //      break;
            case 2:
                balance -= 20;
                break;
            case 1:
                balance = 0;
        }
        System.out.println("У ребенка сейчас денег: " + balance );



    }
}
