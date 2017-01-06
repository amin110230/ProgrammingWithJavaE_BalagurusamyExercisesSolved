package date_related;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FirstLastDateFromDate {
    static String start, end;
    public static void main(String[] args) {
        //Start Date of the month
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date begining, ending;
        Calendar calendar_start = BusinessUnitUtility.getCalendarForNow();
        calendar_start.set(Calendar.DAY_OF_MONTH, calendar_start.getActualMinimum(Calendar.DAY_OF_MONTH));
        begining = calendar_start.getTime();
        start = sdf.format(begining);
        System.out.println(start);
        
        //End Date of the month
        Calendar calendar_end = BusinessUnitUtility.getCalendarForNow();
        calendar_end.set(Calendar.DAY_OF_MONTH, calendar_end.getActualMaximum(Calendar.DAY_OF_MONTH));
        ending = calendar_end.getTime();
        end = sdf.format(ending);
        System.out.println(end);
    }

}
