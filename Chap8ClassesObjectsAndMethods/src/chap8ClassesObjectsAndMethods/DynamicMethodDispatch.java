package chap8ClassesObjectsAndMethods;

class Super{
    public void method(){
        System.out.println("Method Super");
    }
}
class Sub extends Super{
    @Override
    public void method(){
        System.out.println("Method Sub");
    }
}
public class DynamicMethodDispatch {
    
    public static void main(String[] args) {
        Super A = new Sub(); // reference variable is irrelevant, depends on referred object type
        A.method();
    }

}
