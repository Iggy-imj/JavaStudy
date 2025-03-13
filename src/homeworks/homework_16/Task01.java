package homeworks.homework_16;
/*
Task 1
Найдите произведение всех чисел от 1 до 15 включительно.

Результат выведите на экран
 */

public class Task01 {
    public static void main(String[] args) {

        int i = 1;
        long multi = 1;

        while (i <=15) {
            multi *= i;
            i++;
        }
        System.out.println("Произведение чисел: " + multi);
    }
}
