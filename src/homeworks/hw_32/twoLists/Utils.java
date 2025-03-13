package homeworks.hw_32.twoLists;

import lists.MyArrayList;

public class Utils {
    public static <T,U> void printTwoLists(MyArrayList<T> list1, MyArrayList<U> list2) {
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }
    }
}
