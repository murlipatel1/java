
import java.util.concurrent.atomic.AtomicInteger;

class Shared {
    private volatile boolean flag = false;

    void changeFlag() {
        flag = true; // change visible across threads
    }

    boolean getFlag() {
        return flag;
    }
}

public class VolatileExample {
    public static void main(String[] args) throws InterruptedException {
        Shared shared = new Shared();

        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(1000);
                shared.changeFlag();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread(() -> {
            while (!shared.getFlag()) {
                // Busy-waiting until the flag is true
            }
            System.out.println("Flag has been changed!");
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}

class Counter {
    private AtomicInteger count = new AtomicInteger(0);

    void increment() {
        count.incrementAndGet(); // thread-safe increment
    }

    int getCount() {
        return count.get();
    }
}

class AtomicExample {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        // Create 1000 threads to increment counter
        Thread[] threads = new Thread[1000];
        for (int i = 0; i < 1000; i++) {
            threads[i] = new Thread(counter::increment);
            threads[i].start();
        }

        // Wait for all threads to finish
        for (Thread t : threads) {
            t.join();
        }

        System.out.println("Final count: " + counter.getCount()); // Should print 1000
    }
}
