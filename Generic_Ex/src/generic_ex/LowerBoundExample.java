package generic_ex;

import java.util.ArrayList;
import java.util.List;

class SuperClass {

}

class ChildClass extends SuperClass {

}

class GrandChildClass extends ChildClass {

}

public class LowerBoundExample {

    public static void main(String[] args) {
        // list of grand children
        List<GrandChildClass> grandChildren = new ArrayList();
        grandChildren.add(new GrandChildClass());
        addGrandChildren(grandChildren);
        
        // list of grand childs
        List<ChildClass> childs = new ArrayList();
        childs.add(new GrandChildClass());
        addGrandChildren(childs);
        
        // list of grand super
        List<SuperClass> supers = new ArrayList();
        supers.add(new GrandChildClass());
        addGrandChildren(supers);
        

    }
    public static void addGrandChildren(List<? super GrandChildClass> grandChildren){
        grandChildren.add(new GrandChildClass());
        System.out.println(grandChildren);
    }
}
