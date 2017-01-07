package chap9ArraysStringsAndVectors;

import java.util.Stack;

//public class autounboxex {
//    
//    public static void main(String[] args) {
//        
//        Stack mystack = new Stack();
//        mystack.push(new Integer(10));
//        mystack.push(new Integer(20));
//        Integer stksum1 = (Integer) mystack.pop();
//        Integer stksum2 = (Integer) mystack.pop();
//        int stksum = stksum1.intValue() + stksum2.intValue();
//        System.out.println(stksum);
//    }
//
//}

public class autounboxex {
    
    public static void main(String[] args) {
        
        Stack<Integer> myStack = new Stack<Integer>();
        myStack.push(10); //autobox
        myStack.push(20); //autobox
        
        int stackSum = myStack.pop() + myStack.pop(); // unboxing
        
//        System.out.println("The topmost element from the stack is: " + myStack.pop()); // already pop() called in above
//        System.out.println("The next to topmost element from the stack is: " + myStack.pop()); // already pop() called in above
        System.out.println("The sum of two elements from the stack: " + stackSum);
    }

}
