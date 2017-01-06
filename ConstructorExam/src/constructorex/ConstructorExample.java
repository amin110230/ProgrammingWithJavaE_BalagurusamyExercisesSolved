
package constructorex;

import java.util.Date;

public class ConstructorExample {
    
    // Field/Global Variable
    double d; // 1. Initialization using default value
    Date date = new Date(); // 2. Initialization using explicit value
    String s; // 3. Initialization using Constructor

    public ConstructorExample() {
    }
    public ConstructorExample(double d) {
        this.d = d;
    }
    
    

    public static void main(String[] args) {
        ConstructorExample obj = new ConstructorExample();
    }
    
}
