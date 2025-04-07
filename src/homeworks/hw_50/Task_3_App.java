package homeworks.hw_50;

import java.time.LocalDate;
import java.util.List;

import static homeworks.hw_50.Task_3.countDaysBetweenExtremes;

public class Task_3_App {
    public static void main(String[] args) {
        List<LocalDate> dateList = List.of(
                LocalDate.of(2023, 1, 1),
                LocalDate.of(2025, 4, 7),
                LocalDate.of(2024, 12, 25)
        );

        System.out.println("Разница между самой ранней и поздней датами: " +
                countDaysBetweenExtremes(dateList) + " дней");
    }

}
