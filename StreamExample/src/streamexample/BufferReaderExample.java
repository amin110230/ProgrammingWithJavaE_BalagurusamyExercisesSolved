package streamexample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderExample {

    public static void main(String[] args) {
        
        try {
            BufferedReader br = new BufferedReader(new FileReader("E:\\AND\\java\\NetBeans\\StreamExample\\newfilename.txt"));
//            BufferedReader br = new BufferedReader(new FileReader("E:/AND/java/NetBeans/StreamExample/newfilename.txt"));
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) { // until Stream null(-1)                 
                System.out.println(sCurrentLine);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e);
            System.err.println(e);
        }

    }

}
