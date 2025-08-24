import java.util.concurrent.*;

public class CompletableFutureExample2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1,1,1,
                TimeUnit.HOURS,new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

        CompletableFuture<String> asyncTask1 = CompletableFuture.supplyAsync(()->{
            return "concept and ";
        },executor).thenApply((String val)->{
            return val + " coding";
        });
        System.out.println(asyncTask1.get());
    }
}
