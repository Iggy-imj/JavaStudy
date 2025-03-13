package homeworks.homework_13;
/*Task 2
Создайте строки:
        "Java"
        "is"
        "a"
        "powerful"
        "language"
Склейте эти строки двумя разными способами, чтобы получить строку: "Java is a powerful language".
Выведите на экран получившуюся строку и её длину.
Task 2.2
Замените в результирующей строке слово "powerful" на "super".
Опционально Создайте переменную типа boolean с ответом на вопрос: содержит ли строка подстроку "age"?
Выведите на экран значение этой переменной.
 */

public class Task02 {
    public static void main(String[] args) {

        // Task 2.1
        String str1 = "Java";
        String str2 = "is";
        String str3 = "a";
        String str4 = "powerful";
        String str5 = "language";
        String str_ = " ";

        // 1
        String concatStr1 = str1 + str_ + str2 + str_ + str3 + str_ + str4 + str_ + str5;
        System.out.println(concatStr1);

        int length = concatStr1.length();
        System.out.println("Длина строки: " + length);

        // 2
        String concatStr2 = String.join(str_, str1, str2, str3, str4, str5);
        System.out.println(concatStr2);

        System.out.println("Длина строки: " + concatStr2.length());

        // Task 2.2
        String replStr = concatStr1.replace("powerful", "super");
        System.out.println("Измененная строка: " + replStr);

        //
        boolean containsAge = concatStr1.contains("age");
        System.out.println("Строка содержит подстроку 'age'? - " + containsAge);
    }
}
