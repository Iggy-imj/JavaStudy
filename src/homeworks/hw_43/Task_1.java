package homeworks.hw_43;

import java.util.ArrayList;
import java.util.List;

public class Task_1 {
    public static void main(String[] args) {

        List<Integer> listA = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        List<Integer> listB = new ArrayList<>(List.of(4, 5, 6, 7, 8, 9));

        List<Integer> commonElements = getCommonElements(listA, listB);

        System.out.println("listA: " + listA);
        System.out.println("listB: " + listB);
        System.out.println("commonElements: " + commonElements);

    }

    public static <T> List<T> getCommonElements(List<T> list1, List<T> list2) {

        List<T> result = new ArrayList<>(list1);
        result.retainAll(list2);
        return result;

    }
}
