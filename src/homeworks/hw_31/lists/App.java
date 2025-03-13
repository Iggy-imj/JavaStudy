package homeworks.hw_31.lists;

public class App {
    public static void main(String[] args) {
        MyArrayList<String> stringArray = new MyArrayList<>();
        stringArray.add("Hello");
        stringArray.add("World");
        System.out.println(stringArray);

        MyArrayList<Integer> intArray = new MyArrayList<>();
        intArray.add(100);
        intArray.add(200);
        System.out.println(intArray);


    }
}
