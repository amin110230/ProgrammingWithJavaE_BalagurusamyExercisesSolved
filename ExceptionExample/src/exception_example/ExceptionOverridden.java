package exception_example; //Exception Overridden Rules, not Program

import java.io.EOFException;
import java.io.IOException;

public class ExceptionOverridden {
    void msg(){
        System.out.println("parent");
    }
    
    public void someMethod() throws IOException{
        // method body
    }
}

class TestA extends ExceptionOverridden{
//    @Override
//    void msg(){ // no exception
//        System.out.println("Child");
//    }
    
    @Override
    void msg() throws ArithmeticException{ // uncheked exception valid
        System.out.println("Child");
    }
    
    
//    @Override
//    void msg() throws IOException{ // cheked exception invalid
//        System.out.println("Child");
//    }
    
//    @Override
//    public void someMethod() throws IOException{ // same or none
//        // method body
//    }
    
    @Override
    public void someMethod() throws EOFException{ // subClass_Exception
        // method body
    }
    
//     @Override
//    public void someMethod() throws EOFException{ // superClass_Exception invalid
//        // method body
//    }
}
