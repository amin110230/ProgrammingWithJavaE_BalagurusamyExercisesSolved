package chap9ArraysStringsAndVectors;

public class NumberSorting {
    
    public static void main(String[] args) {
        
        int number[] = { 55, 40, 80, 65, 71};
        int n = number.length;
        System.out.print("Given list : ");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + number[i]);            
        }
        System.out.println("\n");
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (number[i] < number[j]) {
                    
                    int temp = number[i];
                    number[i] = number[j];
                    number[j] = temp;
                }
            }
        }
        System.out.print("Sorted list : ");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + number[i]);
        }
        System.out.println(" ");
    }

}
