package lessons.lesson_31.generics;

public class Wrappers {
    public static void main(String[] args) {


    Integer maxValue = Integer.MAX_VALUE;

    System.out.println("max: " + maxValue);
    System.out.println("min: " + Integer.MIN_VALUE);

     maxValue = null;

     //  Приведение типов. Автоупаковка и автораспаковка

        Integer wrapperInt = 5; // автоупаковка примитива int в ссылочный тип Integer
        System.out.println(wrapperInt);

        int primitiveInt = wrapperInt; // атораспаковка из Integer в тип int
        System.out.println(primitiveInt);

        System.out.println("\n============\n");

        Integer a = 127;
        Integer b = 127;
        System.out.println("127 == 127 - " + (a == b)); // true
        System.out.println("127.equals(127) - " + a.equals(b)); // true


        Integer c = 128;
        Integer d = 128;
        System.out.println("128 == 128 - " + (c == d)); // false
        System.out.println("127.equals(127) - " + c.equals(d)); // true


}

}
