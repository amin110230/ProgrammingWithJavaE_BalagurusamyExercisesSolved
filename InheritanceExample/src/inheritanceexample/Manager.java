package inheritanceexample;
class Employee{
        
    public String name;
    public int employeeid;

    public Employee() {
        this.name = "Kalam";
        this.employeeid = 1;
    }

    public Employee(String name, int id) {
        this.name = name;
        this.employeeid = id;
    }
    String getDetails(){
        return "Id is " + employeeid + " and Name is " + name;
    }
}

public class Manager extends Employee {
    public String department;

    public Manager(String department, String name, int id) {
//        super(); // when no constructor in super class
        super(name, id);
        this.department = department;
    }

    @Override 
    String getDetails() {
        return "subDetails"; //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String[] args){
        Manager mgr = new Manager("IT", "Mr. A", 1);
        mgr.print();  
        System.out.println(mgr.getDetails());        
    }

    void print(){
        System.out.println("Name= " + name);
        System.out.println("department= " + department);
    }
}
