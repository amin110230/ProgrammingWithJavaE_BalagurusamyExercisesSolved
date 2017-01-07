package chap12MultithreadedProgramming;

class A1 extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            if (i == 1) {
                yield();
            }
            System.out.println("\t From Thread A1 : i = " + i);
        }
        System.out.println("Exit from A1 ");
    }
}

class B1 extends Thread {

    @Override
    public void run() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("\t From Thread B1 : j = " + j);
            if (j == 3) {
                stop();
            }
        }
        System.out.println("Exit from B1 ");
    }
}

class C1 extends Thread {

    @Override
    public void run() {
        for (int k = 1; k <= 5; k++) {
            System.out.println("\t From Thread C1 : k = " + k);
            if (k == 1) {
                try {
                    sleep(10000);
                } catch (Exception e) {
                }
            }
        }
        System.out.println("Exit from C1 ");
    }
}

public class ThreadMethods {

    public static void main(String[] args) {
        A1 threadA = new A1();
        B1 threadB = new B1();
        C1 threadC = new C1();

        System.out.println("Start thread A1");
        threadA.start();
        System.out.println("Start thread B1");
        threadB.start();
        System.out.println("Start thread C1");
        threadC.start();
        System.out.println("End of main thread");

    }

}
