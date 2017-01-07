package chap11PackagesPuttingClassesTogether;

import static java.lang.Math.*;

public class Mathop {

    public void circle(double r) {
        double area = PI * r * r;
        System.out.println("The Area of Circle is :" + area);
    }

    public static void main(String[] args) {
        Mathop obj = new Mathop();
        obj.circle(2.3);
    }

}
