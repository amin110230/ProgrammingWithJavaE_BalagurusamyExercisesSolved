package chap11PackagesPuttingClassesTogether;

import circle.NewCircle; // have to use specific class or all(*)

public class ImportClass {

    public static void main(String[] args) {

        circle.NewCircle nc = new circle.NewCircle();
        System.out.println("Hello World!");
    }

}
