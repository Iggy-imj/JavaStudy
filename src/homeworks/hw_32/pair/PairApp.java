package homeworks.hw_32.pair;

public class PairApp {
    public static void main(String[] args) {
        Pair<String> pair = new Pair<>("Hello", "World");

        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());


        pair.swap();
        System.out.println("\nAfter swap: ");
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());


    }
}
