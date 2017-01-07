package chap12MultithreadedProgramming;

class A2 extends Thread {

    @Override
    public void run() {
        System.out.println("threadA2 started");
        for (int i = 1; i <= 4; i++) {
            System.out.println("\t From Thread A2 : i = " + i);
        }
        System.out.println("Exit from A2 ");
    }
}

class B2 extends Thread {

    @Override
    public void run() {
        System.out.println("threadB2 started");
        for (int j = 1; j <= 4; j++) {
            System.out.println("\t From Thread B2 : j = " + j);
        }
        System.out.println("Exit from B2 ");
    }
}

class C2 extends Thread {

    @Override
    public void run() {
        System.out.println("threadC2 started");
        for (int k = 1; k <= 4; k++) {
            System.out.println("\t From Thread C2 : k = " + k);
        }
        System.out.println("Exit from C2 ");
    }
}

class ThreadPriority {

    public static void main(String[] args) {

        A2 threadA2 = new A2();
        B2 threadB2 = new B2();
        C2 threadC2 = new C2();

        threadC2.setPriority(Thread.MAX_PRIORITY);
        threadB2.setPriority(threadA2.getPriority() + 1);
        threadA2.setPriority(Thread.MIN_PRIORITY);

        System.out.println("Start thread A2");
        threadA2.start();
        System.out.println("Start thread B2");
        threadB2.start();
        System.out.println("Start thread C2");
        threadC2.start();

        System.out.println("End of main thread");
    }

}
