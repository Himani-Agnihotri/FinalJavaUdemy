import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.*;

public class FutureExample3 {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(3,3,3,
                TimeUnit.HOURS,new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

        Future<?> future1 = executor.submit(()->{
                System.out.println("task 1 with runnable");
        });

        try{
            Object obj = future1.get();
            System.out.println(obj==null);
        }catch (Exception e){

        }

        List<Integer> output = new ArrayList<>();
        Future<List<Integer>> obj1 = executor.submit(()->{
               output.add(100);
               System.out.println("task 2 with runnable");
        },output);

    }
}
