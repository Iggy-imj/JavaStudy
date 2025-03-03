package lesson_25.hw_24;

public class hw_24_1_app {
    public static void main(String[] args) {

        int x1 = 10;
        int x2 = 20;
        int result;

        result = x1 / x2;
        System.out.println("result" + result);

//      System.out.println("10 / 0" + 10 / 0);

        result = hw24_1.divide(10,0);
        System.out.println(result);

        //Infinity - бесконечность

        double inf1 = 1.0 / 0;
        double inf2 = 1000.0 / 0;

        System.out.println(inf1);

        System.out.println(inf1 == inf2);
        System.out.println(inf1 > inf2);

        double res2 = inf1 / inf2;
        System.out.println("res2: " + res2); // NaN - значение не определено не является числом

        System.out.println("inf1 - inf2: " + (inf1 - inf2));

        System.out.println("inf1 - inf2: " + inf1 * -1);


        // Сравнение на равенство значения с бесконечность/
        System.out.println(inf1 == Double.POSITIVE_INFINITY);





    }
}
