package exception_example;

public class ExceptionBasic {

    public static void main(String[] args) {
        int x = 0;
        int y = 34 / x; // ArithmeticException: / by zero
        System.out.println(y);
        System.out.println("Finished");
    }

}
