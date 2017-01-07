package chap13ManagingErrorsAndExceptions;
// have to solve
class myexception extends Exception {

    myexception(String s) {
        super(s);
    }
}

public class excep4 {

    public static void main(String[] args) {
        if (args[0] == "Hello") {
            System.out.println("String is right");
        } else {
            try {
                throw new myexception("Invalid String");
            } catch (myexception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

}
