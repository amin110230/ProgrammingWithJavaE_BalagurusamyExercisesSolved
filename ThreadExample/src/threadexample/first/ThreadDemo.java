package threadexample.first;

import static java.lang.Thread.sleep;

class NewThread implements Runnable {

    Thread t;

    public NewThread() {
        t = new Thread(this, "Demo Thread");
        System.out.println("Child thread: " + t);
        t.start(); //Start the thread
    }

    // second thread
    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child Thread: " + i);
                // Let the thread sleep for a while
                sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted.");
        }
        System.out.println("Existing child thread");
    }

}
public class ThreadDemo {
 
    public static void main(String[] args) {
        new NewThread(); // create a new thread
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main Thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interruped.");
        }
        System.out.println("Main thread existing.");

    }   
}
