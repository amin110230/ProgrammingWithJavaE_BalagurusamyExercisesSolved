package nested_class;

public class TestNestedInterface implements NestedInterface.Message {
       @Override
       public void msg(){
           System.out.println("Hello nested interface");
       }
       
       public static void main(String[] args) {
           NestedInterface.Message message = new TestNestedInterface();// upcasting
           message.msg();
           
        
    }
    
    
}
