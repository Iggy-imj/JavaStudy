package homeworks.hw_24;
/*
Task 1 - Класс "Калькулятор"
Создайте класс Calculator, который будет предоставлять базовые
арифметические операции: сложение, вычитание, умножение и деление
Класс должен содержать:
Статические методы для каждой математической операции,
принимающие два аргумента и возвращающие результат операции.
 */

public class Calculator1 {
    static double plus;
    static double minus;
    static double multiply;
    static double divide;

    private double a;
    private double b;

    public Calculator1(double a, double b) {
        this.a = a;
        this.b = b;

        plus = a + b;
        minus = a - b;
        multiply = a * b;

        if (b != 0) {
            divide = a / b;
        } else {
            System.out.println("Деление на ноль! НИЗЯ");
            divide = Double.NaN;
        }
    }


    // --------
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }


    // --------
    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
            this.b = b;
    }
}
