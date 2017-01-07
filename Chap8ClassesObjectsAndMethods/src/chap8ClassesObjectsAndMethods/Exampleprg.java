package chap8ClassesObjectsAndMethods;
/*
class Exampleprg {

String str1, str2;
    Exampleprg(String[] person) {
        for (int i = 0; i<person.length; i++) {
            str1=person[i];
            System.out.println("Hello " + str1 +".");
        }
    }
    
    public static void main(String[] args) {
        
        Exampleprg ex = new Exampleprg(args);
    }

}
*/


// Variable length argument

class Exampleprg {


    public static void Exampleprg(String... person) {
        for (String name : person) {
            System.out.println("Hello " + name);
        }
    }
    
    public static void main(String[] args) {
        
       Exampleprg("Amin", "ADFKL", "CFBJD");
//       Exampleprg(); // does not generate any compile time error if empty argument passed
   }

}