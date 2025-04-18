import java.util.concurrent.*;

class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println("Task is being executed in: " + Thread.currentThread().getName());
        return 123; // Return result
    }
}

public class Callable_Completed_FutureExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Callable<Integer> task = new MyCallable();
        Future<Integer> future = executor.submit(task);

        // Blocking until the result is ready
        Integer result = future.get();
        System.out.println("Task result: " + result);

        executor.shutdown();
    }
}

class CompletableFutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            System.out.println("Running asynchronously in: " + Thread.currentThread().getName());
            return 10;
        }).thenApplyAsync(result -> {
            return result * 2;
        });

        // Non-blocking result handling
        System.out.println("Final result: " + future.get());
    }
}
