package circle;

import circle.NewCircle;

public class SamePackage {

    public static void main(String[] args) {

        NewCircle nc = new NewCircle();
        nc.draw(); // draw method accessed for public method
    }

}
