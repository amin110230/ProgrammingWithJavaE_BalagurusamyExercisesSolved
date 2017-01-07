package chap8ClassesObjectsAndMethods;

class ReturnValue {

    public String name = "Tom";

    public String getName() {
        System.out.println("Name is: " + name);
        return name;
    }

    public static void main(String[] args) {
        ReturnValue rv = new ReturnValue();
        rv.getName();
    }

}
