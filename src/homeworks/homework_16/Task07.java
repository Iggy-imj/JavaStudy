package homeworks.homework_16;
/*
Task 7 * (Опционально)
Написать метод, который принимает массив строк. Вывести на экран все символы самой длинной строки из массива.

Пример:

{ "One", "Two", "Twenty" } ->

T
w
e
n
t
y
 */

public class Task07 {
    public static void main(String[] args) {
        String[] words = {"One", "Two", "Twenty", "Thirteen", "Fifteen", "Seventeen"};

        String longestWord = words[0];
        int maxLength = words[0].length();

        int i = 1;
        while (i < words.length){
            if (words[i].length() > maxLength){
                longestWord = words[i];
                maxLength = words[i].length();
            }
            i++;
        }

        int j = 0;
        while (j < longestWord.length()){
            System.out.println(longestWord.charAt(j));
            j++;
        }



    }
}
