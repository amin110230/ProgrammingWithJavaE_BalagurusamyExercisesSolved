package threadexample;

public class ThreadPriority extends Thread {
    
    @Override
    public void run(){
        System.out.println("running thread name:" + Thread.currentThread().getName());
        System.out.println("running thread priority:" + Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {
        ThreadPriority m1 = new ThreadPriority();
        m1.setName("A1");
        ThreadPriority m2 = new ThreadPriority();
        m2.setName("A2");
        m1.setPriority(Thread.MIN_PRIORITY);
        m2.setPriority(Thread.MAX_PRIORITY);
        m1.start();
        m2.start();
        
    }

}
