class MyThread extends Thread {
    public void run() {
        System.out.println("Running thread: " + Thread.currentThread().getName());
    }
}

public class ThreadExample1 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start(); // runs in a new thread
    }
}

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Running with Runnable: " + Thread.currentThread().getName());
    }
}

class ThreadExample2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());
        t1.start();
    }
}

class LambdaThread {
    public static void main(String[] args) {
        Thread t = new Thread(() -> System.out.println("Running via Lambda"));
        t.start();
    }
}
