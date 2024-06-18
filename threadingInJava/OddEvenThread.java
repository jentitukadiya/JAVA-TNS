package threadingInJava;

class OddNumberThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 20; i += 2) {
            System.out.println("Odd: " + i);
        }
    }
}

class EvenNumberThread extends Thread {
    @Override
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println("Even: " + i);
        }
    }
}

public class OddEvenThread {

    public static void main(String[] args) {
        OddNumberThread oddThread = new OddNumberThread();
        EvenNumberThread evenThread = new EvenNumberThread();
        oddThread.start();
        try {
            oddThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        evenThread.start();
    }
}
