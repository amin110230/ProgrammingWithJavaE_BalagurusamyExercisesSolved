package thread.syn;

public class Tick implements Runnable{

    @Override
    public void run() {
        try {
            for (int i = 0; i < 20; i++) {
                System.out.println("Tick");
                Thread.sleep(500);
                synchronized (Core.LOCK){
                    Core.LOCK.notify(); // notify tock, it's his turn [1]
                    Core.LOCK.wait(); // and wait until tock notify you for next
                }
            }
        } catch (InterruptedException e) {
        }
    }

}
