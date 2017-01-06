package abstractexample;

abstract class Figure{
    double dim1;
    double dim2;
    int x = 4;

    Figure(double a, double b) {
        this.dim1 = a;
        this.dim2 = b;
    }
    
    abstract double area();
    void sum(){}    
}

class Rectangle extends Figure{
    Rectangle(double  a, double b){
        super(a, b);
    }

    @Override
    double area() {
        System.out.println("Inside Area for rectangle.");
        return dim1 * dim2;
    }
    
}

class Triangle extends Figure{
    Triangle(double  a, double b){
        super(a, b);
    }

    @Override
    double area() {
        System.out.println("Inside Area for Triangle.");
        return dim1 * dim2 / 2;
    }
    
}

public class AbstractAreas {
    public static void main(String[] args) {
//        Figure f = new Figure(10, 10); // abstract can not instantiated
          Rectangle r = new Rectangle(9, 5);
          Triangle t = new Triangle(10, 8);
          Figure figure; // this is ok, no object is created
          figure = r;
          System.out.println("Area is " + figure.area());
          figure = t; 
          System.out.println("Area is " + figure.area());

          
    }
}
