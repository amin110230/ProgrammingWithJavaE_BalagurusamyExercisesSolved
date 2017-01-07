package chap13ManagingErrorsAndExceptions;
// run with command line

public class CLineInput {

    public static void main(String[] args) {
        int invalid = 0; //Number of Invalid arguments
        int number, count = 0;
        for (int i = 0; i < args.length; i++) {
            try {
                number = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                invalid = invalid + 1;  //Caught an invalid number
                System.out.println("Invalid Number: " + args[i]);
                continue; // Skip the remaining part of the loop
            }
            count = count + 1;
        }
        System.out.println("Valid Numbers = " + count);
        System.out.println("Invalid Numbers = " + invalid);
    }

}
