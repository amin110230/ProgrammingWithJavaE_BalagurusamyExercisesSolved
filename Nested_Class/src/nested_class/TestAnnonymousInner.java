package nested_class;
abstract class Person{
    abstract void eat();
}
public class TestAnnonymousInner {
    public static void main(String[] args) {
//        Person p = new Person() {
//            @Override
//            public void eat() {
//                System.out.println("nice fruits.");
//            }
//        };
//        p.eat();

        // annonymous inner class
        new Person() {
            @Override
            public void eat() {
                System.out.println("nice fruits.");
            }
        }.eat();
    }
}
