package memorymgt;

public class Memorymgt {

    public static void main(String[] args) {
        int i = 1;
        Object obj = new Object();
        Memorymgt mmgt = new Memorymgt();
        mmgt.print(obj);
    }
    
    private void print(Object param){
        String str = param.toString();
        System.out.println(str);
    }
}
