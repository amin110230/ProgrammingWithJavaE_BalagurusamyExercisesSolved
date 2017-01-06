package castexample;
class Animal{
    int health = 100;
}
class Cat extends Animal{
    int wealth = 200;
}
public class TestObjectCasting {
    
    public static void main(String[] args){
        Animal aml = new Animal();
        Cat c = new Cat();
        // upcasting
        aml = c;
//        System.out.println(aml.wealth); // why not?
        //downcasting
        c = (Cat) aml; // explicitly
        System.out.println(aml.health);
    }
}
