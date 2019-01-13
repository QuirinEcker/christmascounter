import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Ecker_ChristmasCounter {

    public static void main(String[] args) {
        LocalDateTime christmas = LocalDateTime.of(2019, 12, 24, 19, 00, 00);
        LocalDateTime today = LocalDateTime.now();
        LocalDateTime between = getDiffDate(today, christmas);

        System.out.println("Months: " + between.getMonthValue());
        System.out.println("Days: " + between.getDayOfMonth());
        System.out.println("Hours: " + between.getHour());
        System.out.println("Minutes: " + between.getMinute());
        System.out.println("Seconds: " + between.getSecond());

    }

    public static LocalDateTime getDiffDate(LocalDateTime from, LocalDateTime to) {
        LocalDateTime tempDateTime = LocalDateTime.from(from);

        long years = tempDateTime.until(to, ChronoUnit.YEARS);
        tempDateTime = tempDateTime.plusYears( years );

        long months = tempDateTime.until(to, ChronoUnit.MONTHS);
        tempDateTime = tempDateTime.plusMonths( months );

        long days = tempDateTime.until(to, ChronoUnit.DAYS);
        tempDateTime = tempDateTime.plusDays( days );

        long hours = tempDateTime.until(to, ChronoUnit.HOURS);
        tempDateTime = tempDateTime.plusHours( hours );

        long minutes = tempDateTime.until(to, ChronoUnit.MINUTES);
        tempDateTime = tempDateTime.plusMinutes( minutes );

        long seconds = tempDateTime.until(to, ChronoUnit.SECONDS);

        return LocalDateTime.of((int)years, (int)months, (int)days, (int)hours, (int)minutes, (int)seconds);

    }
}
