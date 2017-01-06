package pass_by_value;

public class Example1 {
    int data = 50;
    
    // primitive types are pass by value
    void change(int data){
        data = data + 100; // change loacl variable
        System.out.println("Data in method: " + data);
    }
    
    // objects are pass by reference
    void  changeByObj(Example1 e){
        e.data = 200;
    }
    
    public static void main(String args[]){
        Example1 ex = new Example1();
        System.out.println("Before change: " + ex.data);
        ex.change(55);
        System.out.println("After change by pass by value: " + ex.data);
        ex.changeByObj(ex);
        System.out.println("After change by pass by reference: " + ex.data);
    }
}
