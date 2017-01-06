package streamexample.bytee;

import java.io.BufferedOutputStream;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class BufferedOutputStreamTest {
    
    public static void main(String[] args) throws Exception {
        FileOutputStream fout = new FileOutputStream("E:\\AND\\java\\NetBeans\\StreamExample\\fl.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);
        
        String s = "Almighty Allah";
        byte b[] = s.getBytes();
        bout.write(b);
        
        bout.flush();
        bout.close();
        System.out.println("success");
    }

}
