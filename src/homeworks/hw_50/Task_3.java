package homeworks.hw_50;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Task_3 {
    public static long countDaysBetweenExtremes(List<LocalDate> dates) {
        if (dates == null || dates.isEmpty()) return 0;

        LocalDate minDate = dates.get(0);
        LocalDate maxDate = dates.get(0);

        for (LocalDate date : dates) {
            if (date.isBefore(minDate)) minDate = date;
            if (date.isAfter(maxDate)) maxDate = date;
        }
        return ChronoUnit.DAYS.between(minDate, maxDate);
    }


}
