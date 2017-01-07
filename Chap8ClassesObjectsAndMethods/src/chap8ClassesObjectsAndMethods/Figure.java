package chap8ClassesObjectsAndMethods;

abstract class Figure {
    int x, y;
    void changePosition(int newX, int newY){}
    abstract void draw();
}
class CircleObject extends Figure{
    @Override
    void draw(){
        System.out.println("Draw method called");
    }
}
class RectangleObject extends Figure{
    @Override
    void changePosition(int newX, int newY){
        System.out.println("Change Position method Called");
    }
    @Override
    void draw(){
        System.out.println("Draw method called");
    }
}