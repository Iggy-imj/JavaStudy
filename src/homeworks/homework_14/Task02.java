package homeworks.homework_14;
/*Task 2
Создайте две переменные типа int.
- В первую переменную запишите случайное значение от 0 до 50.
- Во вторую переменную случайное значение от 0 до 100.
- (опционально) Во вторую переменную случайное значение от -20 до 30.
Проверьте:
- равны ли переменные,
- не равны ли они,
- больше ли a, чем b,
- и меньше ли b, чем a.
Выведите результат на экран.
*/

import java.util.Random;

public class Task02 {
    public static void main(String[] args) {
        /*
        int a = 12;
        int b1 = 64;
        int b2 = -16;
        */

        // попробовал генерацию чисел
        Random random = new Random();

        int a = random.nextInt(51);
        int b1 = random.nextInt(101);
        int b2 = random.nextInt(51) -20;

        System.out.println("a = " + a);
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);

        // ==
        boolean eql = a == b1;
        System.out.println("a == b1 - " + eql);
        System.out.println("a == b2 - " + (a == b2));

        // >
        System.out.println("a > b1 - " + (a > b1));
        System.out.println("a > b2 - " + (a > b2));

        // <
        System.out.println("b1 < a - " + (b1 < a));
        System.out.println("b2 < a - " + (b2 < a));
    }
}
