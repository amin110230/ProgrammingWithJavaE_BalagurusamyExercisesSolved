package chap10InterfacesMultipleInheritance;

interface FomousLine{
    void ShowLine();
}
class Novel1 implements FomousLine{

    @Override
    public void ShowLine() {
        System.out.println("To be, or not to be");
    }    
}
class Novel2 implements FomousLine{
    public void AuthorName(){
        System.out.println("Shakespeare");
    }

    @Override
    public void ShowLine() {
        // have to implement all abstract methods
    }
}

public class UseInterface {
    
    public static void main(String[] args) {
        Novel1 hamlet = new Novel1();
        Novel2 juliet = new Novel2();
        hamlet.ShowLine();
        juliet.AuthorName();
    }

}
