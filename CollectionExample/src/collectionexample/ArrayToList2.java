package collectionexample;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayToList2 {

    public static void main(String[] args) {

        String sArray[] = new String[]{"Array 1", "Array 2", "Array 3"};
        //convert array to list
        List<String> lList = Arrays.asList(sArray);

        //iteration loop
        System.out.println("#1 iterator");
        Iterator<String> iterator = lList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // for loop
        System.out.println("\n#2 for loop");
        for (int i = 0; i < lList.size(); i++) {
            System.out.println(lList.get(i));
        }
        //advance for
        System.out.println("\n#3 for enhance/advance");
        for (String temp : lList) {
            System.out.println(temp);
        }
        //while loop
        System.out.println("\n#4 while loop");
        int j = 0;
        while (lList.size() > j) {
            System.out.println(lList.get(j));
            j++;
        }

    }

}
