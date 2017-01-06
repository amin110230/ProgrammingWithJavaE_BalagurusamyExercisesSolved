package fielddecini;

import java.util.Date;

public class FieldInitializeExample {
    // Field/Global Variable
    double d; // 1. Initialization using default value
    Date date = new Date(); // 2. Initialization using explicit value
    String s; // 3. Initialization using Constructor

    public FieldInitializeExample(String s) {
        this.s = s;
    }
  
    public static void main(String[] args) {
        FieldInitializeExample obj = new FieldInitializeExample("Hello");
        System.out.println(obj.d);
        System.out.println(obj.date);
        System.out.println(obj.s);
    }
    
}
