package lesson_25.hw_24;

public class hw24_1 {

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
