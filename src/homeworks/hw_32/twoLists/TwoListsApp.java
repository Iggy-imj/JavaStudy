package homeworks.hw_32.twoLists;

import lists.MyArrayList;

import static homeworks.hw_32.twoLists.Utils.printTwoLists;

public class TwoListsApp {
    public static void main(String[] args) {
        MyArrayList<Object> names = new MyArrayList<>();
        names.add("Alice");
        names.add("Bob");

        MyArrayList<Integer> scores = new MyArrayList<>();
        scores.add(85);
        scores.add(92);

        printTwoLists(names, scores);

    }
}
