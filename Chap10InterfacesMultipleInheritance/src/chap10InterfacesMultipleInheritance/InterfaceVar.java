package chap10InterfacesMultipleInheritance;

interface NEwshape{
    void draw();
    int radius = 10;
}
class NEwCircle1 implements NEwshape{
    @Override
    public void draw(){
//        radius = 1; // cannot assign a value to final variable
        System.out.println("Radius is: " + radius);
    }    
}
public class InterfaceVar {
    public static void main(String[] args) {
        NEwshape nc1 = new NEwCircle1();
        nc1.draw();
    }

}
