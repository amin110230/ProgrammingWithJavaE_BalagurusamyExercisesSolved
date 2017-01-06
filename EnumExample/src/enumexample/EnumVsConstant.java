package enumexample;

public class EnumVsConstant {

    static void enumExample(DayEnum denum) {
        if (denum == DayEnum.SAT) {
            System.out.println("e-Saturday");
        } else if (denum == DayEnum.SUN) {
            System.out.println("e-Sunday");
        } else if (denum == DayEnum.MON) {
            System.out.println("e-Monday");
        } else {
            System.out.println("e-Invalid Day");
        }
    }

    static void constantExample(int i) {
        if (i == DayConstant.SAT) {
            System.out.println("c-Saturday");
        } else if (i == DayConstant.SUN) {
            System.out.println("c-Sunday");
        } else if (i == DayConstant.MON) {
            System.out.println("c-Monday");
        } else {
            System.out.println("c-Invalid Day");
        }
    }

    public static void main(String[] args) {
        enumExample(DayEnum.SAT);
        enumExample(DayEnum.SUN);
        enumExample(DayEnum.MON);
        enumExample(null);

        constantExample(1);
        constantExample(2);
        constantExample(3);
        constantExample(4);
    }

}
