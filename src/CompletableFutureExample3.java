import java.util.concurrent.*;

public class CompletableFutureExample3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1,1,1,
                TimeUnit.HOURS,new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

        CompletableFuture<String> asyncTask1 = CompletableFuture.supplyAsync(()->{
            try{
                System.out.println("Current thread is: "+ Thread.currentThread().getName());
                Thread.sleep(5000);
            }catch (Exception e){
            }
            return "Concept ";
        },executor);

        CompletableFuture<String> asyncTask2 = asyncTask1.thenApplyAsync((String val)->{
                System.out.println("Current thread in thenApply is: "+ Thread.currentThread().getName());
                return "And";
            });

    }
}
