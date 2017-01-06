// Example of Exception Propagation
package exception_example;


public class ExcepPropagation {
    
    void m(){
//        try{
        int data = 50 / 0;
//        }catch (Exception e){            
//        }
    }
    
    void n(){
        m();
    }
    
    void p(){
        try{
            n();
        }catch (Exception e){
            System.out.println("Exception Handled.");
        }        
    }
    
    public static void main(String[] args) {
        ExcepPropagation ep = new ExcepPropagation();
        ep.p();
        System.out.println("Normal flow..");
    }
}
