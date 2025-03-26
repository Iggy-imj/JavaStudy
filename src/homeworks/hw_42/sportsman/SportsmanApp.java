package homeworks.hw_42.sportsman;

import java.util.Arrays;
import java.util.Comparator;

public class SportsmanApp {
    public static void main(String[] args) {

        Sportsman[] sportsmen = {
                new Sportsman("John", 25, 9.8),
                new Sportsman("Max", 22, 9.5),
                new Sportsman("Varvara", 29, 7.7),
                new Sportsman("Anna", 20, 9.9)
        };

        System.out.println("\nСортировка по имени: ");
        Arrays.sort(sportsmen);
        printSportsmen(sportsmen);

        System.out.println("\nСортировка по рейтингу: ");
        Arrays.sort(sportsmen, new SportsmanScoreComparator());
        printSportsmen(sportsmen);

        System.out.println("\nСортировка по возрасту: ");
        Arrays.sort(sportsmen, new Comparator<Sportsman>() {
            @Override
            public int compare(Sportsman s1, Sportsman s2) {
                return Integer.compare(s1.getAge(), s2.getAge());
            }
        });
        printSportsmen(sportsmen);

        System.out.println("\nВ обратном порядке: ");
        Arrays.sort(sportsmen, Comparator.comparing(Sportsman::getAge, Comparator.reverseOrder()));
        printSportsmen(sportsmen);
    }

    public static void printSportsmen(Sportsman[] sportsmen) {
        for (Sportsman man : sportsmen) {
            System.out.println(man);
        }
    }


}
