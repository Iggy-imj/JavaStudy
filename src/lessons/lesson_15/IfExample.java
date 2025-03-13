package lessons.lesson_15;

import java.util.Random;
// Ctr + Opt + O - удаляются неиспользуемые импорты - оптимизация

public class IfExample {
    public static void main(String[] args) {

        // Условные операторы / Операторы ветвления / if

        // if (условие) оператор; - минимальная конструкция

        int age = 5;

        if (age > 11) System.out.println("age > 11");

        System.out.println("Продолжение программы");

        // if (условие) {
        // Код при условии - True
        //} else if (условие 2) {
        // } else {
        // Код при условии -  false
        // }

        if (age > 11) {
            System.out.println("Блок IF");
            System.out.println("Вы уже не ребенок");
        } else {
            // Блок else выполнится когда условие выдаст false
            System.out.println("Block ELSE");
            System.out.println("Сейчас age = " + age);
        }

        Random rand = new Random();
        int score = rand.nextInt(101);

        // int score = 80;

        if (score >= 90) {
            System.out.println("Super! - " + score);
        } else if (score >= 75) {
            System.out.println("Good! - " + score);
        } else if (score >= 50) {
            System.out.println("Удовлетворительно - " + score);
        } else {
            System.out.println("Плохо!...бее");
        }

        System.out.println("Продолжение программы\n");

        // Нахождение минимального значения из нескольких чисел

        int v1 = rand.nextInt(51);
        // int v2 = rand.nextInt(51) -25; // -25 до +25 -> (0...50) -- - 0 - 25 -> -25; 50 - 25 = max = 25;
        int v2 = rand.nextInt(51);
        int v3 = rand.nextInt(51);

        System.out.println(v1 + " | " + v2 + " | " + v3);


        // int v4 = rand.nextInt(101) - 20; // -20 до 80

        int min = v1;
        if (v2 < min) {
            min = v2;
        }
        if (v3 < min) min = v3;

        System.out.println("min - " + min);

    }
}
