package chap8ClassesObjectsAndMethods;

class NoDefConst {

    NoDefConst(String s) {
        System.out.println("fsdf");
    }
}
class SubClass extends NoDefConst{
    
    public SubClass(String s) {
        super(s);
    }
    
}
