public class ThreadLifecycleDemo extends Thread {
    public void run() {
        System.out.println("Thread State (RUNNING): " + this.getState());
        try {
            Thread.sleep(1000); // TIMED_WAITING
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread finishing (TERMINATED)");
    }

    public static void main(String[] args) {
        ThreadLifecycleDemo t = new ThreadLifecycleDemo();
        System.out.println("Before start: " + t.getState()); // NEW

        t.start();

        try {
            Thread.sleep(100); // Allow thread to start
            System.out.println("During execution: " + t.getState()); // RUNNABLE or TIMED_WAITING
            t.join(); // Wait for thread to finish
            System.out.println("After join: " + t.getState()); // TERMINATED
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
