package local_global_instance;

public class LocalTest {
    
    int y;
    
    public void callAge(){
        int age = 0; // cause compilation error if not initialized
        age = age + 7;
        y = y + 3;
        System.out.println("Age is : " + age);
        System.out.println("Y is : " + y);
    }
    
    public static void main(String[] args) {
        //x=o; // static memeber can not access non-static member
        LocalTest test = new LocalTest();
        test.callAge();
    }
}
