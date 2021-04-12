package Assignment1;

import java.time.*;
import java.time.temporal.TemporalAdjusters;

public class DateTimeAPI {
    /**
     * 1.LocalDateTime
     * 2.LocalDate date=LocalDate.of(x).with(TemporalAdjusters.previous(DayOfWeek.THURSDAY));
     * 3.ZoneId will give the time zone of the area but will reference two ZoneOffset if they have different times during winter and summer
     * 4.instant.atZone(ZoneId.of("America/Chicago")); zonedDateTime.toInstance();
     */
    public static void main(String[] args) {

    }

    /**
     * 5.Report the length of each month within that year
     *
     * @param year Any given year
     */
    public static void monthLengthofYear(int year) {
        for (int i = 1; i <= 12; i++) {
            System.out.println(YearMonth.of(year, i).lengthOfMonth());
        }
    }

    /**
     * 6. Lists all mondays of a given month
     *
     * @param month month
     * @param year year
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
     * 7.  Checks to see if a given date is friday the 13
     *
     * @param day  doy of month
     * @param month month of year
     * @param year  year
     * @return true if it is friday the 13 or false if it isn't
     */
    public static boolean isFriday13(int day, int month, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        return date.getDayOfWeek() == DayOfWeek.FRIDAY && date.getDayOfMonth() == 13;
    }
}

