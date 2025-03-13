package lessons.lesson_14;

public class BooleanExample {
    public static void main(String[] args) {

        boolean bol1 = true;
        bol1 = false;

        System.out.println(bol1);

        int x = 10;
        int y = 5;

        // Сравнение на равенство ==
        boolean b1 = x == y; // X равен Y -> 10 ранво 5 ? -> false
        System.out.printf("%s == %s -> %s\n", x, y, b1);

        // != - не равенство
        b1 = x != y;
        System.out.printf("%s != %s -> %s\n", x, y, b1);

        // >
        y = 10;
        b1 = x > y;
        System.out.printf("%s > %s -> %s\n", x, y, b1);

        // >=
        y = 10;
        b1 = x >= y;
        System.out.printf("%s >= %s -> %s\n", x, y, b1);

        // <
        x = 7;
        b1 = x < y;
        System.out.printf("%s < %s -> %s\n", x, y, b1);

        // меньше или равно
        b1 = x <= y;
        System.out.printf("%s <= %s -> %s\n", x, y, b1);


        String str = "Java is tge best";
        // поиск вхождения подстроки
        // contauns - возврашает true если строка содердит указанную последовательность исмволов

        boolean contains = str.contains("Java");
        System.out.println("str.contains(\"Java\") - " + contains);
        System.out.println("str.contains(\"java\") - " + str.contains("java"));

        // начинается/оканчивается подстрока на указанную подстроку
        boolean startsWith = str.startsWith("Ja");
        System.out.println("str.startsWith(\"Ja\") - " + startsWith);
        System.out.println("str.startsWith(\"ava\") - " + str.startsWith("ava"));

        // Rename - Shift + F6

        boolean endsWith = str.endsWith("best");
        System.out.println("str.endsWith(\"best\") - " + endsWith);
        System.out.println("str.endsWith(\"Java\") - " + str.endsWith("Java"));



        System.out.println("\n    --- Логические операции ---    \n");

        // Логическое НЕ "!"
        boolean b2 = !false;
        System.out.println("!false: " + b2);

        b2 = !(4 == 5); //false -> true
        System.out.println("!(4 == 5) - " + b2);

        // Составные сравнения - два условия

        // И - "&"

        b2 = true & true;
        System.out.println("true & true - " + b2);

        int input = 50;
        b2 = input >= 0 & input <= 100;
        System.out.println("input >=0 & input <= 100 - " + b2);

        input = 150;
        b2 = input >= 0 & input <= 100;
        System.out.println("input >=0 & input <= 150 - " + b2);

        // ИЛИ - "|"
        b2 = true | false;
        System.out.println("true | false - " + b2);
        System.out.println("false | true - " + (false | true));
        System.out.println("true | true - " + (true | true));
        System.out.println("false | false - " + (false | false));

        // Исключающее ИЛИ (XOR) - "^"
        // возвращает Тру - если две части выражения разные
        b2 = true ^ false;
        System.out.println("true ^ false - "+ b2);
        System.out.println("false ^ true - "+ (false ^ true));
        System.out.println("true ^ true - "+ (true ^ true));
        System.out.println("false ^ false - "+ (false ^ false));

        System.out.println("\n------------\n");

        // сокращенное И - "&&"
        // - выдает тру если обе части выражения возвращают тру
        b2 = true && true;
        System.out.println("true && true - " + b2);
        System.out.println("false && true - " + (false && true));

        int a = 10;
        int b = 0;

        boolean bol = (b != 0) && a / b > 2;
        System.out.println("bol - " + bol);

        b = 1;
        bol = (b != 0) && a / b > 2;
        System.out.println("bol - " + bol);

        System.out.println("\n------------\n");

        // сокращенное ИЛИ - "||"
        // выдает тру если хотя бы одна часть выражения равна тру

        // true || ? -> true (независимо от значения правой части)

        bol = true || (a / b > 2);
        System.out.println("bol - " + bol);


        System.out.println("\n------ Приоритет логических операций ------\n");
        /*   ! -> & -> ^ -> | -> && -> ||  -  приоритет логических операций
        */

        System.out.println(true ^ true & false);
        System.out.println(true ^ false);
        System.out.println(true);









    }

}
