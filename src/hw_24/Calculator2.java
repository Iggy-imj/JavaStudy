package hw_24;
/*
Task 1 - Класс "Калькулятор"
Создайте класс Calculator, который будет предоставлять базовые
арифметические операции: сложение, вычитание, умножение и деление
Класс должен содержать:
Статические методы для каждой математической операции,
принимающие два аргумента и возвращающие результат операции.
 */

public class Calculator2 {

    public static double plus(double a, double b) {
        return a + b;
    }

    public static double minus(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Беда! На 0 нельзя!");
            return Double.NaN;
        }
        return a / b;
    }
}
