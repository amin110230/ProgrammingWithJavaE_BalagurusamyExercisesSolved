package operator_java;

public class OperatorTest {

    public static void main(String[] args) {
        int a = 60; // 60 = 111100
        int b = 13; // 13 =   1101
        int c = 0;
        
        c = a & b; // 12 = 1100
        System.out.println("a & b = " + c +" binary = "+Integer.toBinaryString(c));
        
        c = a | b; // 61 = 111101
        System.out.println("a | b = " + c +" binary = "+Integer.toBinaryString(c));
        
        c = a ^ b; // 49 = 110001 XoR
        System.out.println("a ^ b = " + c +" binary = "+Integer.toBinaryString(c));
        
        c = ~a; // -61 = 11111111111111111111111111(000011)
        System.out.println("~a = " + c +" binary = "+Integer.toBinaryString(c));
        
        c = a << 2; // 240 = 11110000
        System.out.println("a << 2 = " + c +" binary = "+Integer.toBinaryString(c));
        
        c = a >> 2; // 15 = 1111
        System.out.println("a >> 2 = " + c +" binary = "+Integer.toBinaryString(c));
        
        c = a >>> 2; // 15 = 1111
        System.out.println("a >>> 2 = " + c +" binary = "+Integer.toBinaryString(c));
    }
    
}
