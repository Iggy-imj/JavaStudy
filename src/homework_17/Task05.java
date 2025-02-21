package homework_17;
/*
Task 5 * (Опционально)
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
public class Task05 {
    public static void main(String[] args) {
        String[] words = {"One", "Two", "Twenty", "Thirteen", "Fifteen", "Seventeen"};
        printLongestCharacters(words);


    }

    public static void printLongestCharacters(String[] words) {

        String longestWord = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }

        System.out.println("Символы самой длинной строки:");
        for (int j = 0; j < longestWord.length(); j++) {
            System.out.println(longestWord.charAt(j));
        }
    }

}
