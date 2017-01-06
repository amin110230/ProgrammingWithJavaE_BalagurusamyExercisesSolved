package streamexample;

import java.io.File;

public class CreateFileExample {

    public static void main(String[] args) {
        try {
            File file = new File("E:\\AND\\java\\NetBeans\\StreamExample\\a.doc");

            if (file.createNewFile()) {
                System.out.println("File is created!");
            } else {
                System.out.println("File already exists.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
