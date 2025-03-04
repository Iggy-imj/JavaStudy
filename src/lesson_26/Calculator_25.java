package lesson_26;

/*
1. Поля класса, в том числе константы
2. Блок инициализации если они есть
3. Конструкторы если есть
4. Методы (статические и не статические не разделяются)

// инструмент Lombok - шаблонно создает методы
 */

public class Calculator_25 {

    public static final double PI = 3.141519;

    public static  double circleArea(double radius) {
        return PI * radius * radius;
    }

    public static double circlePerimeter(double radius) {
        return  2 * PI * radius;
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;

    }

    public static int divide(int a, int b) {
        if (b == 0) return  Integer.MAX_VALUE;
        return  a / b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }


}

