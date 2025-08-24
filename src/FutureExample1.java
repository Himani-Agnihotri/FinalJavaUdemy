import java.util.concurrent.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class FutureExample1 {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2,4,10,
                TimeUnit.MINUTES,new ArrayBlockingQueue<>(2),Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

        Future<?> future = executor.submit(()->{
           System.out.println("This is the task which thread will execute");
        });
        System.out.println(future.isDone());
        }
}