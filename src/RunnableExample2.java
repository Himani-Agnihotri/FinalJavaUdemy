public class RunnableExample2 extends Thread{
    @Override
    public void run(){
        System.out.println("I am another thread and my name is: "+ Thread.currentThread().getName());
    }
}
