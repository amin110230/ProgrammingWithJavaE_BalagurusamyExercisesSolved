package local_global_instance;

public class InstanceVariable {
    public String name;
    private double salary;
    
    public InstanceVariable(String empName){
        name = empName;
    }
    /**
     * This method is to set salary parameter
     * @param empSal salary parameter
     */
    public void setSalary(double empSal){
        salary = empSal;
    }
    
    public void printEmp(){
        System.out.println("Name : " + name);
        System.out.println("salary : " + salary);
    }
    
    public static void main(String args[]){
        InstanceVariable empOne = new InstanceVariable("Bari");
        empOne.setSalary(1000);
        empOne.printEmp();
    }
    
    
}
