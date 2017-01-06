package exception_example;

public class FinallyDemo {

    // Return from within a try block.
    static void procB() {
        try {
            System.out.println("inside procB");
            return;
        } finally {
            System.out.println("procB's finally");
        }
    }

    static int processA(int x, int y) {
        try {
            return x / y;
        } catch (ArithmeticException e) {
            System.out.println("Exception throw :" + e);
            return 0;
        } finally {
            System.out.println("Finally block is always executed");
        }
    }

    public static void main(String[] args) {
        processA(25, 0);
    }
}
