package lessons.lesson_13;

public class StringExample {
    public static void main(String[] args) {

        String greeting = "Hello World!";

        String string1 = new String("Hello!"); // не рекомендуемый метод создания

        System.out.println(greeting);
        System.out.println(string1);

        // Метод length() - получить количество символов в строке
        int length = greeting.length(); // вызов метода length() - подсчет количества символов
        System.out.println("length: " + length); // 12 символов

        System.out.println("Hello: ".length());

        // Метод который позволяет перевести все символы в строке в верхний регистр
        System.out.println(greeting.toUpperCase());
        System.out.println("greeting: " + greeting);

        // String иммутабельная (неизменна)
        // Если я хочу сохранить результат работы метода  - я должен сохранить его в какуе-то переменную
        //(в новую переменную или переписать значение хранящееся в старой переменной)


        // переводить все символы строки в нижний регистр
        String stringCase = greeting.toLowerCase();
        System.out.println("stringCase: " + stringCase);
        System.out.println("greeting: " + greeting);


        System.out.println("\n=================\n");

        // различные варианты конкатенации строк(склеивание/ обьеденения)

        String str1 = "One";
        String str2 = " ";
        String str3 = "hello";

        // + конкатенация
        String concatStr = str1 + str2 + str3;
        System.out.println("concatStr: " + concatStr);

        System.out.println(1 + 3);

        // + (Конкатенация vs Операция сложения)
        System.out.println(1 + 3 + " : " + 2 + 3);
        // какойто тип данных X + String -> X приводится к строке и выполняется конкатенация

        // 1 + 3 -> сложение -> 4
        // 4 + str" : " -> "4" + " : " -> "4 : "
        // "4 : " + 2 -> "4 : " + "2" -> "4 : 2"
        // "4 : 2" + 3 -> "4 : 2" + "3" -> "4 : 23"

        System.out.println(1 + 3 + " : " + (2 + 3));

        // Конкатенация 2
        String concatStr2 = str1.concat(str2); // str1 + str2
        concatStr2 = concatStr2.concat(str3); // concatStr2 + str3
        System.out.println("concatStr2: " + concatStr2);

        // цепочка вызова методов
        String concatStr3 = str1.concat(str2).concat(str3).concat("!!!");
        System.out.println("concatStr3: " + concatStr3);

        // Конкатенация 3
        // Склеять несколько строк, вставляя между ними одинаковый разделитель

        // # print("str1", "str2") -> "str1 str2"
         String concatStr5 = String.join(" - ", "Hello", "World", "Test");
         // "Hello World Test"
        System.out.println("concatStr5: "+ concatStr5);

        // приведение типов, когда есть строка и знак + - это знак конкатенации
        // второй тип данных будет приведен к String не явно

        int a = 1;
        int b = 2;
        String str = "Сумма a + b = " + a + b;
        System.out.println(str);

        // меняем порядок операций
        str = "Сумма a + b = " + (a + b);
        System.out.println(str);

        System.out.println("\n=================\n");


        String digits = "0123456789";
        System.out.println("digits.length: " + digits.length());

        // charAt(index) Взять символ из строки по его индексу (номер)
        char symbol = digits.charAt(4); // взять символ под номером 4
        System.out.println("symbol: " + symbol);

        // первый символ всегда имеет индекс 0. Последний (самый правый) - индекс ВСЕГДА равен (длинна - 1)

        char first = digits.charAt(0);
        char last = digits.charAt(digits.length() - 1);

        System.out.println("first: " + first);
        System.out.println("last: " + last);

        System.out.println("\n=================\n");

        // Выделение подстроки
        String substring = digits.substring(2); // выделить подстроку начиная с индекса 2(включительно)и до конца строки
        System.out.println("substring: " + substring);

        System.out.println("digits: " + digits);

        //
        String substring2 = digits.substring(2,7); // выделить подстроку с индекса 2 включительно до индекса 7 не включительно
        System.out.println("substring2: " + substring2);

        System.out.println("\n=================\n");

        // Замена частей строки
        // raplace(), replecaFirst(), replaceAll()

        // raplace() - заменяет все совпадения заданной строки на другую строку
        // (работает только со строками, не поддерживает регулярные выражения)

        String string = "One World One";
        String replStr = string.replace("One", "WWW");
        System.out.println("replStr: " + replStr);

        // replecaFirst()  - заменяет только первое найденое совпадение (поддерживает регулярные выражеия)
        replStr = string.replaceFirst("One", "WWW");
        System.out.println("replStr(2): " + replStr);

        // replaceAll() - заменяет все найденные совпадения на другую строку
        // поддерживает регулярные выражения
        replStr = string.replaceAll("One", "WWW");
        System.out.println("replStr(3): " + replStr);

        String stringReg = "One World One Onix O";
        replStr = stringReg.replaceAll("\\bO\\w+", "Replaced");
        System.out.println("replStr(4): " + replStr);

















    }
}
