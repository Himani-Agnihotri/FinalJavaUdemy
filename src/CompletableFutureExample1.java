import java.util.concurrent.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CompletableFutureExample1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1,1,1,
                TimeUnit.HOURS,new ArrayBlockingQueue<>(10),Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

        CompletableFuture<String> asyncTask1 = CompletableFuture.supplyAsync(()->{
           return "task completed";
        },executor);
        System.out.println(asyncTask1.get());
        }
}