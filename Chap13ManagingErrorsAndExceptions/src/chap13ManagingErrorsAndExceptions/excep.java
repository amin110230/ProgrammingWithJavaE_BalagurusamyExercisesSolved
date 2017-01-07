package chap13ManagingErrorsAndExceptions;
// have to run with command line
public class excep {

    public static void main(String[] args) {
        try {
            int n = Integer.parseInt(args[0]);
            int n1 = Integer.parseInt(args[1]);
            int n2 = n + n1;
            System.out.println("Sum is " + n2);
        } catch (NumberFormatException ex) {
            System.out.println(ex);
        }
    }

}
