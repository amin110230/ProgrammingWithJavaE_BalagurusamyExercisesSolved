package covarient_return;
// java 5 (covariant return)
class SuperA{
    int x = 1;
}
class SubB extends SuperA{
    int y = 2;
}
class Base{
    SuperA getObject(){
        System.out.println("Base");
        return new SuperA();
    }
}
public class CovarientReturn extends Base {
    @Override
    SuperA getObject(){
        System.out.println("CovariantReturn");
        return new SubB();
    }
    
    
    public static void main(String[] args) {
        Base test = new CovarientReturn();
        System.out.println(test.getObject() instanceof SubB);
        System.out.println(test.getObject().x);
    }
    
}
