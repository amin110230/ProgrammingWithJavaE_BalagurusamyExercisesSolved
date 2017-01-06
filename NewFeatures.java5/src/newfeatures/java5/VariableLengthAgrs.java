package newfeatures.java5;


public class VariableLengthAgrs {

    public static void main(String args[]) {
//        VariableLengthAgrs va = new VariableLengthAgrs();
        test(215, "Dhaka", "Khulna");
        test(147, "USA", "New York", "California");

    }

    public static void test(int some, String... args) {
        System.out.println("\n" + some);
        for (String arg : args) {
            System.out.println(", " + arg);
        }
    }

}
