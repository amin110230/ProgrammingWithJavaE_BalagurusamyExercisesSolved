package collectionexample;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListLoopingExample {
    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList();
        list.add("Test 1");
        list.add("Test 2");
        list.add("Test 3");
        
        System.out.println("#1 normal for loop");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        
        System.out.println("\n#2 enhance/advance for loop");
        for (String temp : list) {
            System.out.println(temp);
        }        
        
        System.out.println("\n#3 while loop");
        int j = 0;
        while(list.size() > j){
            System.out.println(list.get(j));
            j++;
        }        
        
        System.out.println("\n#4 iterator");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
//            String next = iterator.next();
            System.out.println(iterator.next());            
        }
        
    }
    
}
