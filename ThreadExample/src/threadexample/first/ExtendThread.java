package threadexample.first;

class NewThread2 extends Thread {

    public NewThread2() {
        // Create a new, second thread
        super("Demo Thread");
        System.out.println("Child thread: " + this);
        this.start(); //Start the thread
    }

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

public class ExtendThread {

    public static void main(String[] args) {
        new NewThread2(); // create a new thread
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
