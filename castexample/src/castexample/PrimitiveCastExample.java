package castexample;

public class PrimitiveCastExample {

    public static void main(String[] args) {
        //String to int
        String s = "13";
        int stoi = Integer.parseInt(s);
        // or you can write
        stoi = Integer.valueOf(s).intValue();
        System.out.println("String to int " + stoi);
        
        // int to String
        int i = 14;
        String itos = Integer.toString(i);
        System.out.println("int to String " + itos);
        
        // String to Double
        String ss = "13";
        double stod = Double.valueOf(ss).doubleValue();
        System.out.println("String to Double " + stod);
        
        // Double to String
        double d = 13.5d;
        String dtos = Double.toString(d);
//        String dtos = Double.toString(d);
        System.out.println("Double to String " + d);
        
         // char to int
         char c = 'a';
         int ctoi = c; // no need to explicit cast
         System.out.println("char to int " + ctoi);
         
         // int to char
         int ii = 97;
         char itoc = (char) ii; // explicit cast
         System.out.println("int to char " + itoc);
         // int to char another way
         System.out.println(Character.toChars(97));
         
         // String to Character
         String sss = "Welcome";
         char stoc = 'A';
         for (int j = 0; j < sss.length(); j++) {
            stoc = sss.charAt(j);
         System.out.println("String to Character " + stoc);
        }
         
         // Character to String
         char cc = 'X';
         System.out.println("Character to String " + String.valueOf(cc));
         
         // int to double, widening
         int iii = 5;
         double itod = iii; // no need to implicit cast
         System.out.println("int to double " + itod);
         
         // int to double, narrowing
         double dd = 5.4d;
         int dtoi = (int) dd; // implicit cast
         System.out.println("double to int " + dtoi);
    }
}
