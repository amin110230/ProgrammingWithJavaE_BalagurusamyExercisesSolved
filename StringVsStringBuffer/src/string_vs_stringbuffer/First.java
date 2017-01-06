
package string_vs_stringbuffer;

public class First {
    public static void main(String args[]){
        String s = "Dhaka";
        s=s.concat(" Bangladesh");
        System.out.println(s);
        
        StringBuffer sb = new StringBuffer("Dhaka");
        sb.append(" Bangladesh");
        System.out.println(sb);
    }
}
