package chap12MultithreadedProgramming;

class multi1 extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("\tFrom Thread 1 i = " + i);
        }
    }
};

class multi2 implements Runnable {

    @Override
    public void run() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("\tFrom Thread 1 j = " + j);
        }
    }
};

public class threadcheck {

    public static void main(String[] args) {
        multi1 m1 = new multi1();
        m1.start();
        // for interface Runnable you have to pass its object as Threads parameter
        multi2 m2 = new multi2();
        Thread threadInterface = new Thread(m2);
        threadInterface.start();
//        new Thread(new multi2()).start();
    }

}
