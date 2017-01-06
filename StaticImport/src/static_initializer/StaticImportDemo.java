
package static_initializer;

//import static java.lang.Math.PI;
import static java.lang.Math.*;
import java.util.Date;

public class StaticImportDemo {

    public static void main(String[] args) {
        System.out.println(PI);
        System.out.println(E);
        System.out.println(sqrt(9));
//        System.out.println(Math.E );
//        System.out.println(Math.sqrt(9));
        System.out.println(Integer.parseInt("30"));
        Date dt = new Date();

    }
    
}
