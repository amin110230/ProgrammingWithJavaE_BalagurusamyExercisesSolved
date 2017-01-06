package streamexample;

import java.io.File;

public class RenameFileExample {

    public static void main(String[] args) {

        File oldfile = new File("E:\\AND\\java\\NetBeans\\StreamExample\\a.doc");
        File newfile = new File("E:\\AND\\java\\NetBeans\\StreamExample\\ab.doc");

        if (oldfile.renameTo(newfile)) {
            System.out.println("Rename successfully");
        } else {
            System.out.println("Rename failed");
        }

    }

}
