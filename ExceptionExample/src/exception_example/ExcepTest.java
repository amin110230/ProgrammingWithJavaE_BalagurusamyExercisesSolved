package exception_example;

public class ExcepTest {

    public static void main(String[] args) {
        int d = 0;
        int x = 42;
        try {
            int y = x / 0;
            int a[] = new int[2];
            System.out.println("Accessing element three :" + a[3]);
        } catch (ArithmeticException e) {
//            System.out.println("Exception throw :" + e);
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception throw :" + e);
        } finally {
            System.out.println("Out of the block");
        }
    }

}
