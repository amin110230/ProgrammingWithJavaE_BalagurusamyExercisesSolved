package object_methods;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Bank{
    String n;
    String add;
    int an;
    int bal;
    int dep;

    public Bank(String n, String add, int an, int bal) {
        this.n = n;
        this.add = add;
        this.an = an;
        this.bal = bal;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name of the cusomer.:");
        sb.append(this.n);
        sb.append(", ");
        sb.append("Address of the cusomer.:");
        sb.append(this.add);
        sb.append(", ");
        sb.append("A/c no..:");
        sb.append(this.an);
        sb.append(", ");
        sb.append("Balancs in A/c..:");
        sb.append(this.bal);
        
        return sb.toString();
    }
    
    
}

public class Demo2 {
    public static void main(String[] args) {
        List<Bank> l = new LinkedList<Bank>();
        
        Bank b1 = new Bank("Nasir", "Nawabpur, Dhaka", 123, 1000);
        Bank b2 = new Bank("Ashraf", "Kakraile, Dhaka", 124, 1500);
        Bank b3 = new Bank("Enamul", "Banani, Dhaka", 125, 1600);
        Bank b4 = new Bank("Masuk", "Smastipurr, B.Baria", 126, 1700);
        Bank b5 = new Bank("Zia", "Lalkahnbazar, Chittagong", 127, 1800);
        l.add(b1);
        l.add(b2);
        l.add(b3);
        l.add(b4);
        l.add(b5);
        Iterator<Bank> i = l.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());            
        }
    }

}
