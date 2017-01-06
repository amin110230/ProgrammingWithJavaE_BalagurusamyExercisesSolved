package generic_ex;

import java.util.ArrayList;
import java.util.List;

public class GenericsNotCovarient {
    public static void main(String[] args) {
        Integer[] intArray = new Integer[10];
        Number[] numberArray = intArray;
        
        List<Integer> intList = new ArrayList();
//        List<Number> numberList = intList; // invalid! generic doesn't support subType, have to Wildcard!!!
        
        
    }

}
