package exception_example;

public class ExcepThrow {
    static  void validate(int age){
        if(age<18)
            throw new ArithmeticException("not allowed"); // throw for unchecked exception
        else
            System.out.println("welcome to vote");
    }
    
    public static void main(String[] args) {
        try{
            validate(13);
        } catch(ArithmeticException e){
            System.out.println(e);
        }
        
        System.out.println("rest of the code...");
    }

}





