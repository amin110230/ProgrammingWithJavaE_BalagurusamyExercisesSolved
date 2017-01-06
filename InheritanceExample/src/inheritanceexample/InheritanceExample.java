package inheritanceexample;

    class Parent{
        int pi, pj;
        
        void showpipj(){
            System.out.println("pi and pj:" + pi + " " + pj);
        }
    }
    class Child extends Parent{
        int pk;
        
        void showpk(){
            System.out.println("pk:" + pk);
        }
        
        void sum(){
            System.out.println("pi+pj+pk: " + (pi+pj+pk));
        }
    } 
public class InheritanceExample {

    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();
        p.pi = 2;
        p.pj = 7;
        System.out.println("contents of parent class");
        p.showpipj();
        System.out.println();
        c.pi = 18;
        c.pj = 27;
        c.pk = 9;
        System.out.println("contents of child class");
        c.showpipj();
        c.showpk();
        System.out.println();
        System.out.println("sum of pi,pj,pk in child");
        c.sum();
    }
    
}
