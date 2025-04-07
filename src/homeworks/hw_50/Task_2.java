package homeworks.hw_50;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class Task_2 {
    public static void main(String[] args) {

        System.out.println("\n==== Task 2 ====");

        LocalDate today = LocalDate.now();
        System.out.println("Today: " + today);

        System.out.println("Year: " + today.getYear());
        System.out.println("Month: " + today.getMonth());
        System.out.println("Day: " + today.getDayOfMonth());

        LocalDate birthday = LocalDate.of(1987, Month.MAY, 22);
        System.out.println("Birthday: " + birthday);

        LocalDate dateA = LocalDate.of(2024, 5, 10);
        LocalDate dateB = LocalDate.of(2024, 5, 10);
        System.out.println("dateA.equals(dateB): " + dateA.equals(dateB));

        LocalTime nowTime = LocalTime.now();
        System.out.println("Current time: " + nowTime);

        System.out.println("Time + 3h.: " + nowTime.plusHours(3));

        LocalDate weekLater = today.plusWeeks(1);
        System.out.println("In one week: " + weekLater);

        LocalDate lastYear = today.minusYears(1);
        System.out.println("One year ago: " + lastYear);

        LocalDate nextYear = today.plusYears(1);
        System.out.println("In one year: " + nextYear);

        LocalDate tomorrow = today.plusDays(1);
        LocalDate yesterday = today.minusDays(1);
        System.out.println("Tomorrow: " + tomorrow + " | After today: " + tomorrow.isAfter(today));
        System.out.println("Yesterday: " + yesterday + " | Till today: " + yesterday.isBefore(today));
    }
}
