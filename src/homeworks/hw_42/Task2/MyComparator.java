package homeworks.hw_42.Task2;

import java.util.Arrays;
import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer a, Integer b) {
        if (a % 2 == 0 && b % 2 != 0) return -1;
        if (a % 2 != 0 && b % 2 == 0) return 1;
        return 0;
    }

    public static void main(String[] args) {
        Integer[] integers = {1, 6, 5, 4, 7, 8, 9, 2, 7, 3};
        Arrays.sort(integers, new MyComparator());
        System.out.println(Arrays.toString(integers));
    }
}
