package generic_ex;

public class GenericMethodTest {
    // generic method printArray
    public static < E > void printArray( E[] inputArray){
        
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        // create arrays of Int, Double and Char
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
        
        System.out.println("Array integerArray contains:");
        printArray(intArray); //pass a Integer array
        System.out.println("\nArray doubleArray contains:");
        printArray(doubleArray); //pass a double array
        System.out.println("\nArray CharacterArray contains:");
        printArray(charArray); //pass a Character array
    }

}
