package staticconstructor;

class StaticCons {

    public StaticCons() { // static not possible
        System.out.println("super");
    }
}

public class StaticConsMain extends StaticCons {

    void someMethod() {
        System.out.println("method in sub");
    }

    public static void main(String[] args) {
        StaticConsMain staticConsMain = new StaticConsMain();
        staticConsMain.someMethod();
    }

}
