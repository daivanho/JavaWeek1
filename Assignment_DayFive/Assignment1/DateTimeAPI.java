package Assignment1;

import java.time.*;
import java.time.temporal.TemporalAdjusters;

public class DateTimeAPI {
    /**
     * 1.LocalDateTime
     * 2.LocalDate date=LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.THURSDAY));
     * 3.ZoneId will give the time zone of the area but will reference two ZoneOffset if they have different times during winter and summer
     * 4.instant.atZone(ZoneId.of("America/Chicago")); zonedDateTime.toInstance();
     */
    public static void main(String[] args) {
    }

    /**
     * 5.
     *
     * @param year
     */
    public static void monthLengthofYear(int year) {
        for (int i = 1; i <= 12; i++) {
            System.out.println(YearMonth.of(year, i).lengthOfMonth());
        }
    }

    /**
     * 6.
     *
     * @param month
     * @param year
     */
    public static void mondaysIn(int month, int year) {
        LocalDate last = LocalDate.of(year, month, 1);
        while (last.getMonthValue() == month) {
            if (last.getDayOfWeek() == DayOfWeek.MONDAY) {
                System.out.println(last);
            }
            last = last.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        }

    }

    /**
     * 7.
     *
     * @param day
     * @param month
     * @param year
     * @return
     */
    public static boolean isFriday13(int day, int month, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        return date.getDayOfWeek() == DayOfWeek.FRIDAY && date.getDayOfMonth() == 13;
    }
}

