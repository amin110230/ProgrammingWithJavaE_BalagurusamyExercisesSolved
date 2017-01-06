package encapsulation_test;

import encapsulation_example.EncapsulationDemo;

public class EncapsTest {

    public static void main(String[] args) {

        EncapsulationDemo obj = new EncapsulationDemo();

        obj.setEmpName("Mark");
        obj.setEmpAge(32);
        obj.setEmpCode(100231);

        System.out.println("Employee Name: " + obj.getEmpName());
        System.out.println("Employee Code: " + obj.getEmpCode());
        System.out.println("Employee Age: " + obj.getEmpAge());

    }

}
