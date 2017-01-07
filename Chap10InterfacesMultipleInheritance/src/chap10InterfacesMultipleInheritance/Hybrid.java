package chap10InterfacesMultipleInheritance;

class Student {

    int rollNumber;

    void getNumber(int n) {
        rollNumber = n;
    }

    void putNumber() {
        System.out.println("Roll No : " + rollNumber);
    }
}

class Test extends Student {

    float part1, part2;

    void getMarks(float m1, float m2) {
        part1 = m1;
        part2 = m2;
    }

    void putMarks() {
        System.out.println("Marks obtained ");
        System.out.println("Part 1 = " + part1);
        System.out.println("Part 2 = " + part2);
    }
}

interface Sports {

    float sportWt = 6.0F;

    void putWt();
}

class Results extends Test implements Sports {

    float total;

    @Override
    public void putWt() {
        System.out.println("Sports Wt = " + sportWt);
    }

    void display() {
        total = part1 + part2 + sportWt;
        putNumber();
        putMarks();
        putWt();
        System.out.println("Total score = " + total);
    }
}

public class Hybrid {

    public static void main(String[] args) {
        Results students1 = new Results();
        students1.getNumber(1234);
        students1.getMarks(27.5F, 33.0F);
        students1.display();
    }

}
