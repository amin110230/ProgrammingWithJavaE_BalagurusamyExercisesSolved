package collectionexample.comparablex;

public class Student implements Comparable {
    
    int rollno;
    String name;
    int age;

    public Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Object obj) {
        Student st = (Student) obj;
//        if(age == st.age){
//            return 0;
//        } else if(age > st.age){
//            return 1;
//        } else {
//            return -1;
//        }
        System.out.println("======"+this.age + " Compare with "+st.age);
//        return this.age-st.age; //asc
        return st.age-this.age; //des
        
    }
    
    

}
