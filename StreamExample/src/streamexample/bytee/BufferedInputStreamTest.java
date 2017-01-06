package streamexample.bytee;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamTest {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("E:\\AND\\java\\NetBeans\\StreamExample\\fl.txt");
            BufferedInputStream bin = new BufferedInputStream(fin);
            int i;
            while((i = bin.read()) != -1){  // read until get -1
                System.out.print((char) i);
//                System.out.print(i); // byte
            }
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
