package date_related;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {
    
    public static void main(String[] args) throws ParseException {
        
        String input_date = "19/09/13";
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
        Date dt1 = format1.parse(input_date);
        System.out.println(dt1);
    }

}
