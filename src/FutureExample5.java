import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class FutureExample5 {
    public static void main(String args[]){
        ThreadPoolExecutor executor = new ThreadPoolExecutor(3,3,3,
                TimeUnit.HOURS,new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());


        Future<List<Integer>> obj = executor.submit(()->{
            List<Integer> output = new ArrayList<>();
            output.add(4);
            return output;
        });

        try{
            List<Integer> output = obj.get();
            System.out.println(output.get(0));
        }catch (Exception e){

        }
    }
}
