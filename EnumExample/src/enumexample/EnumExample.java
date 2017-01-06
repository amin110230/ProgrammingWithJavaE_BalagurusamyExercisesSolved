package enumexample;

public class EnumExample {

    enum Day {
        SAT, SUN, MON, WED, TUE, THU, FRI
    }; // semicolon optional

    public static void main(String[] args) {
        for (Day s : Day.values()) {
            System.out.println(s);
        }
    }
}
