package testr14.array;

class Account{
    int a;
    String b;

//    public Account(int a, String b) {
//        this.a = a;
//        this.b = b;
//    }
    
    public Account(int aa, String bb){
        this.a = aa;
        this.b = bb;
    }
    
    public void showData(){
        System.out.println("Value of a =" + a);
        System.out.println("Value of b =" + b);
    }

}
public class ObjectArray {
    public static void main(String args[]){
        Account obj[] = new Account[2];
        obj[0] = new Account(1, "Dhaka");
        obj[1] = new Account(3, "Khulna");
        
        System.out.println("For Array Element 0:");
        obj[0].showData();
        System.out.println("For Array Element 1:");
        obj[1].showData();
    }
}
