class CounterStatic {
    private static int count = 0;

    public static synchronized void increment() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}

class ThreadDemoStatic extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            CounterStatic.increment();
        }
    }
}

public class MainStatic {
    public static void main(String[] args) {
        ThreadDemoStatic t1 = new ThreadDemoStatic();
        ThreadDemoStatic t2 = new ThreadDemoStatic();

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count: " + CounterStatic.getCount());
    }
}
