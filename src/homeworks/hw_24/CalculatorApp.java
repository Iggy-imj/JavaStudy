package homeworks.hw_24;

public class CalculatorApp {
    public static void main(String[] args) {

        Calculator1 calculator = new Calculator1(10, 5);

        System.out.println("plus: " + Calculator1.plus);
        System.out.println("minus: " + Calculator1.minus);
        System.out.println("multiply: " + Calculator1.multiply);
        System.out.println("divide: " + Calculator1.divide);


        System.out.println("\n================");

        Calculator1 calculator2 = new Calculator1(10, 0);
        System.out.println("divide: " + Calculator1.divide);


        System.out.println("\n======= Second Option =========");

        double a = 10;
        double b = 5;

        System.out.println("Plus: " + Calculator2.plus(a,b));
        System.out.println("Minus: " + Calculator2.minus(a,b));
        System.out.println("Multiply: " + Calculator2.multiply(a,b));
        System.out.println("Divider: " + Calculator2.divide(a,b));

        b = 0;
        System.out.println("Divider: " + Calculator2.divide(a,b));





    }

}
