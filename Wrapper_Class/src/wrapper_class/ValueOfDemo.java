package wrapper_class;

public class ValueOfDemo {
    
    public static void main(String[] args) {
        Integer intWrapper = Integer.valueOf("12345");
        Integer intWrapper2 = Integer.valueOf("11011", 2); // binary to decimal
        Integer intWrapper3 = Integer.valueOf("D", 16); // hexa to decimal
        
        System.out.println("Value of intWrapper Object: " + intWrapper);
        System.out.println("Value of intWrapper2 Object: " + intWrapper2);
        System.out.println("Value of intWrapper3 Object: " + intWrapper3);
        
        System.out.println("Hex Value of intWrapper: " + Integer.toHexString(intWrapper));
        System.out.println("Binary Value of intWrapper2: " + Integer.toBinaryString(intWrapper2));
    }

}
