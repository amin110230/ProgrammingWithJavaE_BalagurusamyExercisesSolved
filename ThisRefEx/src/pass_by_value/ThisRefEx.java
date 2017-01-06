package pass_by_value;

public class ThisRefEx {
    
    int x;
    String y;

    public ThisRefEx(int x, String y) {
        // resolve ambiguity between instance variable and parameter
        this.x = x;
        this.y = y;
    }
    void sum(int x, int y){
        System.out.println(x+y);
    }

    void doYYY(String[] args) {
        RecRef recref = new RecRef();
        // passing current object as a parameter to another method
        recref.doXX(this);
        recref.doMM(x);
        
    }
    
}
class RecRef{
    
    void doXX(ThisRefEx rr){
        rr.sum(5, 6);
    }
    
    void doMM(int s){
        //System.out.println(s);
    }
}
