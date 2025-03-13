package lessons.lesson_26;

import java.util.Arrays;

public class StringBuilderExample {
    public static void main(String[] args) {

        String str = "Java" + " " + "is" + " " + "the" + " " + "best";

        // StringBuilder - это класс, который используется
        // для создания и манипуляции с изменяемыми строками

        // Перегруженный конструктор. Может быть пустым, может принимать String
        StringBuilder sb = new StringBuilder(); // пустой конструктор
        sb = new StringBuilder("Hello");

        // Метод для добавления символов в конец строки(приклеивание справа). Аналог конкатенации.
        sb.append(" "); // "Hello" + " ";

        // Получить строковое представление
        String string = sb.toString();
        System.out.println(string);

        // Вставить символы в указанную позицию
        sb = new StringBuilder("Hello World"); // Hello beautiful World
        sb.insert(6, "beautiful ");
        System.out.println(sb.toString());
//        String start = "Hello World";
//        String result = start.substring(0,6);
//        result += "beautiful ";
//        result += start.substring(6);
//        System.out.println(result);

        // Заменить подстроку (определяется индексами) на указанное значение
        sb = new StringBuilder("Hello World!"); // "Hello Java"
        sb.replace(6, 11, "Java"); // замени все что было с 6 по 11 на "значение". Верхняя граница не включительная
        System.out.println(sb.toString());

        // Удалить строку в диапазоне от start (вкл.) до end (не вкл.)
        sb = new StringBuilder("Hello World");
        sb.delete(5, 11);
        System.out.println(sb.toString());

        // Нам нада знать есть ли подстрока в cтроке. Положительный индекс, если нашел. И минус если нет
        sb = new StringBuilder("Hello World!");
        int index = sb.indexOf("W");
        System.out.println(index);
        index = sb.lastIndexOf("Java");
        System.out.println(index);

        // Реверс -  разворачивает последовательность символов
        sb = new StringBuilder("Hello World!");
        sb.reverse();
        System.out.println(sb.toString());

        // Получить символ по индексу
        sb = new StringBuilder("Hello World!");
        char ch = sb.charAt(3);
        System.out.println(ch);

        // Количество символов в sb (длина)
        System.out.println("Длина строки: " + sb.length());

        // я могу установить новую длину (обрезать или расширить)
        sb = new StringBuilder("Hello");
        sb.setLength(10);
        // Если увеличить строку, она будет заполнена чарами с кодом 0
        System.out.println(sb.toString());

        char ch1 = sb.charAt(8);
        System.out.println("sb.charAt(8) code: " + (int) ch1);

        sb.setLength(3);
        System.out.println(sb.toString());

        // todo Написать медот который запрашивает у пользователя строку состоящую из нескольких слов
        //  и возвращающий аббревиатуру этой фразы (первые буквы каждого слова, записанные в верхнем регистре)

        String example = String.join(" ", "Java", "is","the", "best");
        System.out.println(example);
        String[] words = example.split(" "); // метод класса String. Результат масив строк
        System.out.println(Arrays.toString(words));

        String str1 = "bijwd kdjcjk";
        //  получить массив символов из которых состоит строка
        char[] chars = str1.toCharArray();
        System.out.println(Arrays.toString(chars));


    }

}
