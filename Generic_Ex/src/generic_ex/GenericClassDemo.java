package generic_ex;

public class GenericClassDemo<T> {
    private T t;
    
    public void add(T t){
        this.t = t;
    }
    
    public T get(){
        return t;
    }
    
    public static void main(String[] args) {
        GenericClassDemo<Integer> integerBox = new GenericClassDemo();
        GenericClassDemo<String> stringBox = new GenericClassDemo();
        
        integerBox.add(new Integer(10));
        stringBox.add("Hello World");
        
        System.out.printf("Integer Value : %d\n", integerBox.get());
        System.out.printf("String Value : %s\n", stringBox.get());
    }

}
