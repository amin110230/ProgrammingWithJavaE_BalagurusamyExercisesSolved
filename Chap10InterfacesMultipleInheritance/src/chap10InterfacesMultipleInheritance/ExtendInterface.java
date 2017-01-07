package chap10InterfacesMultipleInheritance;

interface NewShape{
    void draw();
}
interface CirCle extends NewShape{
    void getRadius();
    int radius = 10;
}
class NewCircle implements CirCle{
    @Override
    public void getRadius(){
        System.out.println(radius);
    }

    @Override
    public void draw() {
        // have to implement all abstract methods
    }
}
public class ExtendInterface extends NewCircle{
    
    public static void main(String[] args) {
        CirCle nc = new NewCircle();
        nc.getRadius();
    }

}
