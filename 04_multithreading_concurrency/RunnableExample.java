class MyTask implements Runnable {
    public void run() {
        System.out.println("Running via Runnable: " + Thread.currentThread().getName());
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyTask());
        t1.start();
    }
}


class MyThread extends Thread {
    public void run() {
        System.out.println("Running via Thread class: " + getName());
    }
}

class ThreadExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
    }
}
