import java.util.concurrent.*;

public class CompletableFutureExample4 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1,1,1,
                TimeUnit.HOURS,new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

        CompletableFuture<String> asyncTask1 = CompletableFuture.supplyAsync(()->{
            return "Hello ";
        },executor).thenCompose((String val) ->{
           return CompletableFuture.supplyAsync(()-> val+"world");
        });

        System.out.println(asyncTask1.get());
    }
}
