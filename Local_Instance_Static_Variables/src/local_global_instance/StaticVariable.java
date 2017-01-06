package local_global_instance;

public class StaticVariable {

    private static double salary;
    int x; // Instance/object/non-static variable
    
    public static final String DEPARTMENT = "Development ";
    
    void test(){
        x = 0;
        salary = 345; // non-static memeber can access static member
    }
//    public static void main(String[] args) {
//        //x=o; // static memeber can not access non-static member
//        StaticVariable sv = new StaticVariable();
//        sv.x = 100;
//        salary = 100;
//        int r = 0; // by default static variables
//        System.out.println(DEPARTMENT + "average salary:" + salary);
//    }
    
}
