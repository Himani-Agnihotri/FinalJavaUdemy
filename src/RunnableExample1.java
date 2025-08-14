public class RunnableExample1 implements Runnable {
    @Override
    public void run() {
        System.out.println("I am another thread and my name is: "+ Thread.currentThread().getName());
    }
}
