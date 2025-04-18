import java.util.concurrent.*;

public class ThreadPoolExecutorDemo {
    public static void main(String[] args) {
        // Creating ThreadPoolExecutor with custom configuration
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                2,  // core pool size
                4,  // maximum pool size
                60, // time to wait before closing idle threads (in seconds)
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(2) // Work queue with max 2 tasks
        );

        // Submit tasks
        for (int i = 0; i < 5; i++) {
            final int taskId = i;
            executor.submit(() -> {
                System.out.println("Task " + taskId + " is being executed by " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000); // Simulate task
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        // Shutdown the executor
        executor.shutdown();
    }
}
