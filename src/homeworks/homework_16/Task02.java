package homeworks.homework_16;
/*
Task 2
Используйте цикл while для решения задачи:
Распечатайте 10 строк: "Task1", "Task2", ..., "Task10".
 */

public class Task02 {
    public static void main(String[] args) {
        String text = "Task";
        int n = 1;

        while (n <= 10){
            System.out.print(text + n + ", ");
            n++;
        }
        System.out.println();
    }
}
