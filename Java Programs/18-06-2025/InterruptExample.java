class InterruptibleThread extends Thread {
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Thread is running");
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted");
        }
    }
}

public class InterruptExample {
    public static void main(String[] args) {
        InterruptibleThread thread = new InterruptibleThread();
        thread.start();

        try {
            Thread.sleep(500);
            thread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
