package chap10InterfacesMultipleInheritance;

interface Area {

    final static float pi = 3.14F;

    float compute(float x, float y);
}

class Rectangle implements Area {

    @Override
    public float compute(float x, float y) {
        return (x * y);
    }
}

class Circle implements Area {

    @Override
    public float compute(float x, float y) {
        return (pi * x * x);
    }
}

public class InterfaceTest {

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        Circle cir = new Circle();
        
        Area area; // Interface object
        area = rect; // area refers to rect object
        System.out.println("Area of Rectangle = " + area.compute(10, 20));
        area = cir; // // area refers to cir object
        System.out.println("Area of Circle = " + area.compute(10, 0));

    }

}
