package threadnew;

public class TestJoin implements Runnable{

    public static void main(String[] args) {
        try {
            Thread t = new Thread(new TestJoin());
            t.start();
            System.out.println("Started");
            t.join();
            System.out.println("Completed");
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }

    }

    @Override
    public void run() {
        System.out.println("Running...");
    }

}
