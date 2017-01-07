package chap12MultithreadedProgramming;

import java.util.logging.Level;
import java.util.logging.Logger;

class Aa extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("\t From threadA. i = " + i);
            try {
                Thread.sleep(100); // sleep method have to place in try catch block
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}

public class ThreadClass {

    public static void main(String[] args) {
        Aa a = new Aa();
        a.start();
    }

}
