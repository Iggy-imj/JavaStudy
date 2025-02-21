package homework_18;
/*
Task 2
Написать метод, принимающий на вход массив строк.
Метод должен вернуть массив, состоящий из самой короткой и самой длинной строки изначального массива.
 */

import java.util.Arrays;

public class Task02 {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "kiwi", "strawberry", "pear"};

        System.out.println(Arrays.toString(returnMinMaxString(words)));


    }//-------------------

    public static String[] returnMinMaxString(String[] words) {

        String minString = words[0];
        String maxString = words[0];

        for (int i = 0; i < words.length; i++){
            if (words[i].length() < minString.length()){
                minString = words[i];
            }
        }

        for (int i = 0; i < words.length; i++){
            if (words[i].length() > maxString.length()){
                maxString = words[i];
            }
        }
        return new String[]{minString, maxString};
    }

}
