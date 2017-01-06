package object_methods;

public class ToStringFirstDemo {
    String s1, s2;

    public ToStringFirstDemo(String s1, String s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    @Override
    public String toString() {
        return "[" + s1 + " " + s2 + "]";
    }
    
    public static void main(String[] args) {
        ToStringFirstDemo tdf = new ToStringFirstDemo("Hello", "World!!");
//        System.out.println(tdf.toString()); compiler internally call this to tdf.toFtring();
        System.out.println(tdf);
    }
    
}
