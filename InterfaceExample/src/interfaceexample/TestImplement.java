package interfaceexample;

public class TestImplement implements TestA, TestB {
    
    public static void main(String[] args) {
        TestImplement ti = new TestImplement();
        ti.print();
    }
    
    @Override
    public void print(){
        System.out.println("Printing......");
        System.out.println(x);
    }
    @Override
    public void printx(){
//        System.out.println("Printing......");
//        System.out.println(x);
    }

}
