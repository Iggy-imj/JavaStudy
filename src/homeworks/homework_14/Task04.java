package homeworks.homework_14;
/*Task 4
Дан следующий код. Вашей задачей является предсказать, какой вывод будет напечатан в консоли после выполнения программы.
↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓
Предскажите, что будет выведено на консоль для Result 1 до Result 5. Объясните кратко свой ответ.
 */

public class Task04 {
    public static void main(String[] args) {
        int a = 8;
        int b = 3;
        boolean result;

        result = (a + b) > 10;
        System.out.println("Result 1: " + result);
        // 8 + 3 = 11
        // 11 > 10 → true
        // Result 1: true

        result = (a - b) == 5;
        System.out.println("Result 2: " + result);
        // 8 - 3 = 5
        // 5 == 5 → true
        // Result 2: true

        result = (a * b) != 24;
        System.out.println("Result 3: " + result);
        // 8 * 3 = 24
        // 24 != 24 → false
        // Result 3: false

        result = (a / b) >= 2;
        System.out.println("Result 4: " + result);
        // 8 / 3 = 2 (остаток отбрасывается)
        // 2 >= 2 → true
        // Result 4: true

        result = !(a % b == 2);
        System.out.println("Result 5: " + result);
        // 8 % 3 = 2
        // a % b == 2 → true
        // !(true) → false
        // Result 5: false
    }
}
