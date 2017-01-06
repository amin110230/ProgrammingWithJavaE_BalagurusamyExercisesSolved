package date_related;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AddDayToDate {
    
    public static void main(String[] args) {
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy--MM--dd");
        Calendar c1 = Calendar.getInstance();
//        c1.set(2013, 9, 19); //set date if you need
        System.out.println("Date is : " + sdf.format(c1.getTime()));
        System.out.println("Nest 7 dates from the date are : ");
        for (int i = 1; i < 8; i++) {
            c1.add(Calendar.DATE, i);
            System.out.println(sdf.format(c1.getTime()));
            c1 = Calendar.getInstance();
        }
    }

}
