package time;

import java.time.temporal.ChronoField;

public class ChronoFieldMain {
    public static void main(String[] args) {

        ChronoField[] values = ChronoField.values();
        for (ChronoField cf : values) {
            System.out.println(cf + ", range = " + cf.range());
        }

        System.out.println( "ChronoField.MONTH_OF_YEAR.range() = " + ChronoField.MONTH_OF_YEAR.range());

    }
}
