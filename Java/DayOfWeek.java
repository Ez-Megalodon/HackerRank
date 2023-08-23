package Java;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DayOfWeek {
    public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day); // Note: month is zero-based in Calendar, so subtract 1

        Date date = cal.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
        String dayOfWeek = sdf.format(date);
        return dayOfWeek.toUpperCase();
    }
}
