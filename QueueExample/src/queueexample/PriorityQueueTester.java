package queueexample;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueTester {
    public static void main(String[] args) {
        String[] alphabets = {"banana", "e", "d", "h", "j", "apple", "c", "f", "g", "pear", "i", "B", "E", "D", "H", "J", "A", "C", "F", "G", "I"};
        PriorityQueue<String> pq = new PriorityQueue(20, new Comparator<String>(){
            // overriding the compare method
            public int compare(String i, String j){
                return i.compareToIgnoreCase(j);
            }
        });
        //Fill pu with data, in an odd order
        for (int i = 0; i < 21; i++) {
            pq.offer(alphabets[i]);
        }
        // Print out and check ordering
        for (int i = 0; i < 21; i++) {
            System.out.println(pq.poll());
        }
    }

}
