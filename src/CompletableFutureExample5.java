import java.util.concurrent.*;

public class CompletableFutureExample5 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1,1,1,
                TimeUnit.HOURS,new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

        CompletableFuture<String> asyncTask1 = CompletableFuture.supplyAsync(()->{
            return "Hello ";
        },executor);

        CompletableFuture<Void> asyncTask2 =asyncTask1.thenAccept((String val)->
        {
           System.out.println("Value is: "+ val);
        });


    }
}
