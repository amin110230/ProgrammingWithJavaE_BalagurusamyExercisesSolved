package nested_class;

interface Eatable{
    void eat();
}

public class TestAnnonymousInner1 {
    public static void main(String[] args) {
//        Eatable e = new Eatable() {
//            @Override
//            public void eat() {
//                System.out.println("nice fruits.");
//            }
//        };
//        e.eat();
        
        // annonymous inner class
        new Eatable() {
            @Override
            public void eat() {
                System.out.println("nice fruits.");
            }
        }.eat();
    }

}
//public class TestnnonymousInner1 implements Eatable {
//    public static void main(String[] args) {
//        TestnnonymousInner1 t = new TestnnonymousInner1();
//        t.eat();
//    }
//    
//    @Override
//    public void eat() {
//        System.out.println("nice fruits.");
//    }
//
//}