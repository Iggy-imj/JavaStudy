package lesson_14;

public class StringEquals {
    public static void main(String[] args) {

        int x = 10;

        // Ссылочный тип данных.
        String str1 = "Java";
        String str2 = "Java";
        String str3 = "JAVA";
        String str4 = new String("Java");
        System.out.println(str1 + " | " + str2 + " | " + str3 + " | " + str4);

        boolean b1 = str1 == str2;
        System.out.println("str1 == str2: " + b1);
        System.out.println("str1 == str3: " + (str1 == str3));
        System.out.println("str1 == str4: " + (str1 == str4));
        System.out.println("str2 == str4: " + (str2 == str4));

        // Важно!
        // Для сравнения строк по их значению мы ДОЛЖНЫ использовать метод equals()

        boolean b2 = str1.equals(str2);
        System.out.println("str1.equals(str2) - " + b2);
        System.out.println("str1.equals(str3) - " + str1.equals(str3));
        System.out.println("str1.equals(str4)- " + str1.equals(str4));

        //мы можем сравнивать значения игнорируя регистр
        System.out.println("Java = JAVA - " + str1.equalsIgnoreCase(str3));



    }
}
