package homework_17;
/*
Task 3
Написать метод, принимающий на вход целое число. Метод должен вывести на экран 2 в степени это Число
Например: Если в метод пришло число 3 - метод должен вывести число 8 (так как 2 в степени 3 = 8)
класс Math для нахождения степени числа использовать нельзя ;)
P.S. А почему вы решили, что число может прийти только положительное? ;)
 */

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

        powerOfTwo();

    }
    public static void powerOfTwo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи целое число: ");
        int exponent = scanner.nextInt();
        double result = 1;
        int base = 2;
        int absExponent = exponent < 0 ? -exponent : exponent;

        for (int i = 0; i < absExponent; i++) {
            result *= base;
        }

        if (exponent < 0) {
            result = 1 / result;
        }

        System.out.println("2 в степени " + exponent + " = " + result);
    }
}
