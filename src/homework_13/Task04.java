package homework_13;
/*Task 4 * (Опционально)
Напишите программу на Java, которая преобразует ваше имя,
записанное маленькими буквами, в верхний регистр.

Для каждой буквы имени создайте отдельную переменную типа char,
инициализированную соответствующей буквой в нижнем регистре.

Затем преобразуйте каждую букву в верхний регистр, используя только
арифметические операции (без использования библиотечных функций), и выведите результат.
 */
public class Task04 {
    public static void main(String[] args) {
        char ch1 = 'i';
        char ch2 = 'g';
        char ch3 = 'o';
        char ch4 = 'r';

        // в Unicode разница между нижним и верхним регистром 32
        ch1 -= 32;
        ch2 -= 32;
        ch3 -= 32;
        ch4 -= 32;

        System.out.println("" + ch1 + ch2 + ch3 + ch4);
    }

}
