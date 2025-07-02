class CounterBlock {
    private int count = 0;

    public void increment() {
        synchronized (this) {
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}

class ThreadDemoBlock extends Thread {
    CounterBlock counter;

    ThreadDemoBlock(CounterBlock counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            counter.increment();
        }
    }
}

public class MainBlock {
    public static void main(String[] args) {
        CounterBlock counter = new CounterBlock();
        ThreadDemoBlock t1 = new ThreadDemoBlock(counter);
        ThreadDemoBlock t2 = new ThreadDemoBlock(counter);

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
