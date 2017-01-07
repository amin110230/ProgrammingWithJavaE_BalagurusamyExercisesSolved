package chap10InterfacesMultipleInheritance;

interface Newshape {

    void draw();
}

class NewCircle1 implements Newshape {

    @Override
    public void draw() {
        System.out.println("New Circle 1 Drawn");
    }
}

class NewCircle2 implements Newshape {

    public void draw() {
        System.out.println("New Circle 2 Drawn");
    }
}

public class CastInterface {

    public static void main(String[] args) {

        Newshape nc1 = new NewCircle1();
        Newshape nc2 = new NewCircle2(); // this class have to implements interface
        nc1.draw();
        nc2.draw();
    }

}
