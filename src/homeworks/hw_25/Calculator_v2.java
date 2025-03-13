package homeworks.hw_25;
/*
Task 1
Дополните Класс "Калькулятор" из предыдущего домашнего задания
Класс Calculator, который будет предоставлять

- базовые арифметические операции: сложение, вычитание, умножение и деление (сделано в прошлом ДЗ)
- Вычисление длины окружности и площади круга по ее радиусу
Copy
Класс должен содержать:

- Статические методы для каждой математической операции, принимающие два аргумента и возвращающие результат операции ((сделано в прошлом ДЗ))
- Методы для вычисления длины окружности и площади круга, принимающий радиус и возвращающий результат.
- Константу (число Пи)
 */

public class Calculator_v2 {

    public static final double PI = 3.141592653589793;

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

    //
    public static double circleLength(double radius) {
        if (radius < 0) {
            System.out.println("Радиус не может быть отрицательным");
            return Double.NaN;
        }
        return 2 * PI * radius;
    }

    //
    public static double circleArea(double radius) {
        if (radius < 0) {
            System.out.println("Радиус не может быть отрицательным");
            return Double.NaN;
        }
        return PI * radius * radius;
    }

}
