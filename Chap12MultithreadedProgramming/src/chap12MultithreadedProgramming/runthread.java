package chap12MultithreadedProgramming;
class multi3 extends Thread {

    @Override
    public void start() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("\tFrom Thread 1 i = " + i);
        }
    }
};

class multi4 implements Runnable {

    public void start() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("\tFrom Thread 1 j = " + j);
        }
    }

    // Runnable interface have to implements all abstract methods (run)
    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
};
class runthread {
    public static void main(String[] args) {
        multi3 m3 = new multi3();
        m3.start();
    }

}
