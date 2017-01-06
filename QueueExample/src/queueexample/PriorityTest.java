package queueexample;

import java.util.PriorityQueue;

public class PriorityTest {

    public static void main(String[] args) {
        //array of alphabets stored in an unordered way
        String[] alphabets = {"banana", "e", "d", "h", "j", "apple", "c", "f", "g", "pear", "i", "B", "E", "D", "H", "J", "A", "C", "F", "G", "I"};
        PriorityQueue<String> pq = new PriorityQueue();
        // Fill up with data, in an odd order
        for (int i = 0; i < 20; i++) {
            pq.add(alphabets[i]);
        }
        System.out.println(pq);
        // Print out and check ordering
        for (int i = 0; i < 20; i++) {
            System.out.println(pq.poll());
        }
        
    }

}
