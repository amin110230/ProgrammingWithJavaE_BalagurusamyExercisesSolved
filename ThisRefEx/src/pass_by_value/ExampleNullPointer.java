package pass_by_value;

public class ExampleNullPointer {
//    static String s = "Amin";
    static String s;
    
    public static void main(String[] args){
        System.out.println(s.toString()); // NullPointerException
    }
}
