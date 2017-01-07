package chap13ManagingErrorsAndExceptions;

public class excep1 {

    public static void main(String[] args) {
        try {
            int n = Integer.parseInt(args[0]);
            int n1 = Integer.parseInt(args[1]);
            int n2 = n + n1;
        } catch (ArithmeticException ex) {
            System.out.println("Arithmetic Exception block 1");
        } 
//        catch (ArithmeticException ex) { // one type exception cannot set more than one time
//            System.out.println("Arithmetic Exception block 2");
//        }
    }

}
