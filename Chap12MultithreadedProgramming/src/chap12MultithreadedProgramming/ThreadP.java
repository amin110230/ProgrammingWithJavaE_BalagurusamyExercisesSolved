package chap12MultithreadedProgramming;

class t1 extends Thread {

    @Override
    public void run() {
        System.out.println("This is Thread1 class");
    }
}

class t2 extends Thread {

    @Override
    public void run() {
        System.out.println("This is Thread2 class");
    }
}

public class ThreadP {

    public static void main(String[] args) {
        t1 t = new t1();
        t2 tt = new t2();
        t.setPriority(Thread.MIN_PRIORITY);
        tt.setPriority(Thread.MIN_PRIORITY);
        t.run();
        tt.run();
    }

}
