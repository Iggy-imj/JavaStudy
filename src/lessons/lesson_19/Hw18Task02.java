package lessons.lesson_19;

import java.util.Arrays;

public class Hw18Task02 {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "kiwi", "strawberry", "pear"};
        System.out.println(Arrays.toString(getArrayWithSmallestString(words)));

        words = null;
        System.out.println(Arrays.toString(getArrayWithSmallestString(words)));

        words = new String[]{"apple", "banana", null, "strawberry", "pear"};
        System.out.println(Arrays.toString(getArrayWithSmallestString(words)));

        words = new String[]{null, "banana", "kiwi", "strawberry", "pear"};
        System.out.println(Arrays.toString(getArrayWithSmallestString(words)));



    }//----

    public static String[] getArrayWithSmallestString(String[] strings) {

        if (strings == null || strings.length == 0) {
            return new String[0];
        }

        String notNullValue = findFirstNotNullValueInArray(strings);
        System.out.println("notNullValue" + notNullValue);

//        String smallest = strings[0];
//        String biggest = strings[0];

        String smallest = notNullValue;
        String biggest = notNullValue;

        for (int i = 0; i < strings.length; i ++){

            System.out.print("ТЕкущий " + strings[i] + ",");

            if (strings[i] != null && strings[i].length() < smallest.length()) {
                smallest = strings[i];
            }

            if (strings[i] != null && strings[i].length() > biggest.length()) {
                biggest = strings[i];
            }
        }
        return new String[]{smallest, biggest};

    }

    private static String findFirstNotNullValueInArray(String[] strings) {
        for (int i = 0; i < strings.length; i++){
            if (strings[i] != null) return strings[i];
        }
        // елси мы перебрали массив и не нашили не одно налл тогда прекращаем провернку дальше
        return null;
    }
}
