package lessons.lesson_32;

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



        // .valueOf() - преобразует явным образом примитив или строку в обьект типа оберки

        Integer e = Integer.valueOf(127);
        Integer e1 = Integer.valueOf("127");
        System.out.println(e + " | " + e1);

        Double dbl = Double.valueOf(154.5);
        System.out.println("dbl " + dbl);

        Boolean b1 = Boolean.valueOf("true");
        System.out.println("b1 - " + b1);

        // parseXXX() - преобразует строку в соответствующий примитив

        double dblP = Double.parseDouble("456"); // возвращает примитив
        Double dblD = Double.valueOf("456"); //  возвращает ссылочный тип

        System.out.println(dblP + " | " + dblD);

        System.out.println(Integer.parseInt("123"));

        // toString - переопределен метод, который возвращает строковое представление числа
        // equals - сравнивает два обьекта по значению

        Integer i1 = 127;
        Integer i2 = 256;

        System.out.println(i1 > i2);

        // compareTo - сравнивает текущий обьект с другим обьектом. Кто больше?
        // Возвращаемое значение int

        System.out.println("127.compareTo.(256)" + i1.compareTo(i2));
        // 3 варианта:
        // i1 > i2 -> положительное значение
        // i1 < i2 -> отрицательное
        // i1 = i2 -> 0

        System.out.println("\n=================\n");

        // xxxValue - возвращает значение обьекта как примитивный тип

        Double d2 = 125.67; // Автоупаковка
        d2 = Double.valueOf(125.67); // Явная/принудительная упаковка в ссылочный тип данных
        double dPrimitive = d2; // Автораспаковка
        dPrimitive = d2.doubleValue(); //  Явная принудительная распаковка - из ссылочного типа явным образом примитив

        System.out.println("\n=================\n");

        /*
        Абстрактный класс Number и все числовые обертки (примитивы) наследуются от абстрактного класса Number
        Byte, Short, Integer, Long, Float, Double
         */

        /*
        byteValue()
        shortValue()
        intValue()
        longValue()
        floatValue()
        doubleValue()
         */

        //

        Integer integer = 31844;

        double dVal = integer.doubleValue();
        System.out.println(dVal);

        System.out.println(integer.longValue());

        Double dWrapper = 245.78;
        int iVal = dWrapper.intValue();
        System.out.println(iVal);

        System.out.println(dWrapper.byteValue());



}

}
