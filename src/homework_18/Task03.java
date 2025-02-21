package homework_18;
/*
Task 3 * (Опционально)
Написать метод, принимающий на вход массив целых чисел. Метод должен вернуть массив, состоящий только из простых чисел, присутствующих в изначальном массиве
вход -> {0, 13, -25, 11, 31, 55, 98, 11, 5} -> выход {13, 11, 31, 11, 5}
 */

import java.util.Arrays;

public class Task03 {
    public static void main(String[] args) {
        int[] array = {0, 13, -25, 11, 31, 55, 98, 11, 5};

        System.out.println(Arrays.toString(getPrimeNumbers(array)));
    }

    public static int[] getPrimeNumbers(int[] inputArray) {
        int[] result = new int[0];

        for (int i = 0; i < inputArray.length; i++) {
            int num = inputArray[i];
            boolean isPrime = true;

            if (num < 2) {
                continue;
            }

            //
            for (int j = 2; j < num; j++) {
                if (num % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            //
            if (isPrime) {

                int[] tempArray = new int[result.length + 1];
                for (int k = 0; k < result.length; k++) {
                    tempArray[k] = result[k];
                }
                tempArray[result.length] = num;
                result = tempArray;
            }
        }
        return result;
    }
}