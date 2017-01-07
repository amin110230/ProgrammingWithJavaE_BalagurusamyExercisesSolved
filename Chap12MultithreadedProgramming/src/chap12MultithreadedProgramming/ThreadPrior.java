package chap12MultithreadedProgramming;

class th1 extends Thread {

    @Override
    public void run() {
        System.out.println("This is Thread1 class");
    }
}

class th2 extends Thread {

    @Override
    public void run() {
        System.out.println("This is Thread2 class");
    }
}

public class ThreadPrior {

    public static void main(String[] args) {
        th1 t1 = new th1();
        th2 t2 = new th2();
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.run();
        t2.run();
    }

}
