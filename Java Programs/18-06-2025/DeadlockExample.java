class Resource {
    synchronized void method1(Resource r) {
        System.out.println(Thread.currentThread().getName() + " is executing method1");
        try { Thread.sleep(100); } catch (InterruptedException e) {}
        r.method2(this);
    }

    synchronized void method2(Resource r) {
        System.out.println(Thread.currentThread().getName() + " is executing method2");
        try { Thread.sleep(100); } catch (InterruptedException e) {}
        r.method1(this);
    }
}

public class DeadlockExample {
    public static void main(String[] args) {
        final Resource r1 = new Resource();
        final Resource r2 = new Resource();

        Thread t1 = new Thread(() -> r1.method1(r2), "Thread-1");
        Thread t2 = new Thread(() -> r2.method1(r1), "Thread-2");

        t1.start();
        t2.start();
    }
}
