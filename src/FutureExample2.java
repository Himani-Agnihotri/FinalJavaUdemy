import java.util.concurrent.*;

public class FutureExample2 {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1,1,1,
                TimeUnit.HOURS,new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

        Future<?> future = executor.submit(()->{
            try{
                Thread.sleep(7000);
                System.out.println("this is the task which thread will execute");
            }catch (Exception e){
            }
        });
        System.out.println("is done:" + future.isDone());
        try{
            future.get(2,TimeUnit.SECONDS);
        }catch (TimeoutException e){
            System.out.println("timeout exception");
        }
        catch (Exception e){

        }
        try{
           future.get();
        }catch (Exception e){
        }
        System.out.println("is done:" + future.isDone());
        System.out.println("is done:" + future.isCancelled());
    }
}
