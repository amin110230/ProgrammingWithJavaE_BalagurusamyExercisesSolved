package wrapper_class;

public class AutoBoxingExample {

    public static void main(String[] args) {
        int pInt = 420;
        Integer wInt = new Integer(pInt); // boxing
        int p2 = wInt; // unboxng
        System.out.println(p2);
    }

}
