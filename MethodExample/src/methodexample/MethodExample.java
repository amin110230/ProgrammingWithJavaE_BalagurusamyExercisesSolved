package methodexample;

public class MethodExample {
    // Field variables
    int x, y;
    double d;
    String s;

    // method name = dispSum
    // method signature = dispSum(int x, int y)
    // method interface = int dispSum(int x, int y)
    static int dispSum(int x, int y) {
        return x + y;
    }
    //Mutator method
    void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        MethodExample m = new MethodExample();
//        System.out.println(x);
        m.setXY(50, 60);
        int sum = m.dispSum(4, 5);
        System.out.println(sum);

    }

}
