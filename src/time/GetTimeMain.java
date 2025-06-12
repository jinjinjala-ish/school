package time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class GetTimeMain {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2030,1,1,13,30,59);
        System.out.println("Year: " + dt.get(ChronoField.YEAR));
        System.out.println("MONTHOFYEAR: " + dt.get(ChronoField.MONTH_OF_YEAR));
    }
}
