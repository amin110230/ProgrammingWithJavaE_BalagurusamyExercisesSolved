package collectionexample.comparetox;

import java.util.*;

public class Simple {
    public static void main(String[] args) {
        
        ArrayList al = new ArrayList();
        al.add(new Student(101, "Uzzal", 23));
        al.add(new Student(106, "Amlan", 27));
        al.add(new Student(105, "Jia", 21));
        
        System.out.println("Sorting by Name...");
        
        Collections.sort(al, new NameComparator());
        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            Student s = (Student) itr.next();
            System.out.println(s.rollno+ " " + s.name + " " + s.age);            
        }
        
        System.out.println("sorting by age...");
        
        Collections.sort(al, new AgeComparator());
        Iterator itr2 = al.iterator();
        while (itr2.hasNext()) {
            Student s = (Student) itr2.next();
            System.out.println(s.rollno+ " " + s.name + " " + s.age);            
        }
    }

}
