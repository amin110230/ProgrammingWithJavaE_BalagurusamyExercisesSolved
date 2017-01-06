package shortcircuitoperator;

public class ShortCircuit {

    public static void main(String[] args) {
        boolean b = false;
        int x = 5;
        int y = 6;
        int m = 7;
        if ((x > y) && (b = true)) { // AND: 1st condi is FALSE then 2nd condi is no check
            System.out.println(b + " ok");
        } else {
            System.out.println(b);
        }

        if ((x > y) || (b = true)) { // OR: 1st condi is TRUE then 2nd condi is no check
            System.out.println(b + " ok");
        } else {
            System.out.println(b);
        }
    }

}
