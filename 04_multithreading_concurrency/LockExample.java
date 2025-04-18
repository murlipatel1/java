import java.util.concurrent.locks.ReentrantLock;

class LockCounter {
    int count = 0;
    ReentrantLock lock = new ReentrantLock();

    void increment() {
        lock.lock(); // acquire lock
        try {
            count++;
        } finally {
            lock.unlock(); // always release
        }
    }
}

public class LockExample {
    public static void main(String[] args) throws InterruptedException {
        LockCounter counter = new LockCounter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) counter.increment();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) counter.increment();
        });

        t1.start(); t2.start();
        t1.join(); t2.join();

        System.out.println("Final Count (With Lock): " + counter.count);
    }
}

// Feature | synchronized | ReentrantLock
// Simplicity | ✅ Easy to use | ❌ Verbose
// Flexibility | ❌ Basic locking only | ✅ Try-lock, timed-lock, reentrancy
// Fairness control | ❌ Not available | ✅ Can specify fairness policy
// Condition support | ❌ Not directly supported | ✅ Supports multiple wait sets
