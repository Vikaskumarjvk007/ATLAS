import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class CounterLock {
    private int count = 0;
    private final Lock lock = new ReentrantLock();

    public void increment() {
        lock.lock();
        try {
            count++;
        } finally {
            lock.unlock();
        }
    }

    public int getCount() {
        return count;
    }
}

class ThreadDemoLock extends Thread {
    CounterLock counter;

    ThreadDemoLock(CounterLock counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            counter.increment();
        }
    }
}

public class MainLock {
    public static void main(String[] args) {
        CounterLock counter = new CounterLock();
        ThreadDemoLock t1 = new ThreadDemoLock(counter);
        ThreadDemoLock t2 = new ThreadDemoLock(counter);

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
