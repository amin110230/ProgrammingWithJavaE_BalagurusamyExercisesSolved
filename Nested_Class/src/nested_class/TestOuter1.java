package nested_class;

public class TestOuter1 {
    static int data = 30; // instance variable
    
    static class Inner{
            
        void msg(){
            System.out.println("data is " + data);
        }

        static void msg2(){
            System.out.println("data is " + data);
        }
    }

    
    public static void main(String[] args) {
        Inner obj = new Inner();
        obj.msg();
        Inner.msg2(); // no need to create the instance of static nested class
    }

}


