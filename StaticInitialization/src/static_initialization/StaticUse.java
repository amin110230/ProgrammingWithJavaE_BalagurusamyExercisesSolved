package static_initialization;

public class StaticUse {

    public static void main(String[] args) {
        StaticUse su = null;
        su.methodOne(); // object reference
//        StaticUse.methodOne(); // class reference
//        methodOne(); // main static so
        // Below will give a NullPointerException
        su.methodTwo();
    }
    
    private static void methodOne(){
        System.out.println("method one");
    }
    
    private void methodTwo(){
        System.out.println("method two");
    }

}
