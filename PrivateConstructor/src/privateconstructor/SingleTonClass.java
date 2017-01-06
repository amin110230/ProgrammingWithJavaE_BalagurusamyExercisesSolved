package privateconstructor;

public class SingleTonClass {

    private static SingleTonClass obj = null;

    private SingleTonClass() {
    }

    public static SingleTonClass getInstance() {
        if (obj == null) {
            obj = new SingleTonClass();
        }
        return obj;
    }

    public void display() {
        System.out.println("SingleTon class Example");
    }

    public static void main(String[] args) {
        SingleTonClass obj = SingleTonClass.getInstance();
        obj.display();
    }

}
