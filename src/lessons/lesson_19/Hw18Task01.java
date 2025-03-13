package lessons.lesson_19;

import java.util.Arrays;

public class Hw18Task01 {
    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4, 5, 6, 7};

        copyOfArray(test, 10);


    }//----------------

    public static void copyOfArray(int[] array, int newLength) {
        if (newLength < 0) {
            return;
        }

        int[] result = new int[newLength]; // [0, 0, 0]

        for (int i = 0; i < newLength && i < array.length; i++) {
                result[i] = array[i];
        }
        System.out.println(Arrays.toString(result));


    }
}
