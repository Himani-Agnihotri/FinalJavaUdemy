public class MultithreadingExample1 {
    public static void main(String args[]){
        System.out.println("I am starting thread and my name is: "+ Thread.currentThread().getName());
        RunnableExample1 example1 = new RunnableExample1();
        Thread thread1 = new Thread(example1);
        thread1.start();
        System.out.println("I am ending thread and my name is: "+ Thread.currentThread().getName());
    }
}
