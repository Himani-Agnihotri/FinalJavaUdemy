import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class FutureExample4 {
    public static void main(String args[]){
        ThreadPoolExecutor executor = new ThreadPoolExecutor(3,3,3,
                TimeUnit.HOURS,new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

        List<Integer> output = new ArrayList<>();
        Future<List<Integer>> obj = executor.submit(new MyRunnable(output),output);

        try {
            obj.get();
            System.out.println(output.get(0));

            List<Integer> out = obj.get();
            System.out.println(out.get(0));
        }catch (Exception e){
        }

    }
}
