import java.util.concurrent.*;

public class CompletableFutureExample6 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1,1,1,
                TimeUnit.HOURS,new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

        CompletableFuture<Integer> asyncTask1 = CompletableFuture.supplyAsync(()->{
            return 10;
        },executor);

        CompletableFuture<String> asyncTask2 = CompletableFuture.supplyAsync(()->{
            return "k";
        },executor);

        CompletableFuture<String> result = asyncTask1.thenCombine(asyncTask2,(Integer val1, String val2)-> val1 + val2);


        System.out.println(result.get());

    }
}
