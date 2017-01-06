package streamexample;

import java.io.File;

public class DeleteFileExample {

    public static void main(String[] args) {
        try {
            File file = new File("E:\\AND\\java\\NetBeans\\StreamExample\\ab.doc");
//            File file2 = new File("E:\\AND\\java\\NetBeans\\StreamExample\\fl.txt");
//            System.out.println(file2.getAbsolutePath());

            if (file.delete()) {
                System.out.println(file.getName() + " is deleted!");
            } else {
                System.out.println("Delete operation is failed.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
