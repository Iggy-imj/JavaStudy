package homeworks.homework_15;
/*Task 4 * (Опционально)
Используйте оператор switch для решения задачи:

Ваш ребенок принес оценку за контрольную работу по математике. В школе 12-балльная система. Запишите в переменную случайное число от 0 до 12.

Вы разрешаете ребенку смотреть телевизор не более 60 минут в день. На сегодня у него осталось 45 минут.

Если оценка от 10 до 12 баллов: скажите ребенку, как вы рады, и добавьте к оставшемуся времени 1 час.
Оценка от 7 до 9 баллов: похвалите ребенка и добавьте 45 минут.
Оценка от 4 до 6 баллов: нейтрально отнеситесь и добавьте 15 минут.
Оценка 3 балла: огорчитесь и вычтите 30 минут.
Оценка меньше 3 баллов: запретите телевизор на сегодня.
Выведите на экран оставшееся время для просмотра ТВ.

P.S. Проконтролируйте, чтобы ребенок не смотрел ТВ больше 60 минут в день.
 */

import java.util.Random;

public class Task04 {
    public static void main(String[] args) {
        Random random = new Random();

        int grade = random.nextInt(13);
        System.out.println("Оценка по контрольной - " + grade);

        int timeBalance = 45;

        switch (grade) {
            case 10:
            case 11:
            case 12:
                System.out.println("Молодец!");
                timeBalance += 60;
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Норм!");
                timeBalance += 45;
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Ну такое");
                timeBalance += 15;
                break;
            case 3:
                System.out.println("Да уж. ты заплатишь за это временем...");
                timeBalance -= 30;
                break;
            default:
                System.out.println("Ну все. пора спать!");
                timeBalance = 0;
                break;
        }
        if (timeBalance > 60) {
            timeBalance = 60;
        }

        if (timeBalance == 0) {
            System.out.println("Сегодня без телика.");
        } else {
            System.out.println("Ты можешь смотреть телик сегодня " + timeBalance + " минут.");
        }
    }
}
