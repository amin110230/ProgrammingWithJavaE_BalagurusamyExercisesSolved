package chap9ArraysStringsAndVectors;

class IntArray {

    public static void main(String[] args) {
        
        int[] anArray;
        anArray = new int[10]; // have to initialize
        
        for (int i = 0; i < anArray.length; i++) {
            anArray[i] = i;
            System.out.print(anArray[i] + " ");            
        }
        System.out.println();        
    }

}
