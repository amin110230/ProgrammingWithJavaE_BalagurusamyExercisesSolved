package exception_example;

public class Test {

    public static void main(String[] args) {
        try {
            int x = 3;
            int y = 34 / x; // ArithmeticException: / by zero
            int z[] = new int[2]; //ArrayIndexOutOfBoundsException
            System.out.println(z[3]);
        } catch (ArithmeticException e) {
            System.err.println("You have a problem at calculation");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(e);
//            e.printStackTrace();
        } 
//        } catch (Exception e) {
//            System.err.println(e);
//        }
        finally {
            System.out.println("Finish...");
        }
    }

}
