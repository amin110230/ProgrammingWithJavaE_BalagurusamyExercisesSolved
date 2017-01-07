package chap9ArraysStringsAndVectors;

public class Palindrome {
    public static void main(String[] args) {
        
        String palindrome = new String("Rod saw I was Dor");
        int len = palindrome.length();
        String dest = new String();
        for (int i = (len - 1); i >= 0; i--) {
//            dest.concat(palindrome.charAt(i)); // have problem           
        }
        System.out.format("%s%n", dest.toString());
    }

}
