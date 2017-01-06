package collectionexample.comparablex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Sample {

    public static void main(String[] args) {
        
        ArrayList<Student> al = new ArrayList();
        al.add(new Student(101, "Bari", 23));
        al.add(new Student(106, "Lalon", 27));
        al.add(new Student(105, "Akash", 21));
        
        Collections.sort(al);
        Iterator<Student> itr = al.iterator();
        while (itr.hasNext()) {
            Student s = itr.next();
            System.out.println(s.rollno + " " + s.name + " " + s.age);            
        }

    }
}
