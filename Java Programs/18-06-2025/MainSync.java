class CounterSync {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class ThreadDemoSync extends Thread {
    CounterSync counter;

    ThreadDemoSync(CounterSync counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            counter.increment();
        }
    }
}

public class MainSync {
    public static void main(String[] args) {
        CounterSync counter = new CounterSync();
        ThreadDemoSync t1 = new ThreadDemoSync(counter);
        ThreadDemoSync t2 = new ThreadDemoSync(counter);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count: " + counter.getCount());
    }
}
