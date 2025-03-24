package MultiThreading;

import java.util.concurrent.*;

class Task implements Callable<Integer> {
    public Integer call() {
        return 10;
    }
}

public class CallableExample {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(new Task());
        System.out.println(future.get()); // Retrieves the result
        executor.shutdown();
    }
}
