public class MultithreadingExample2 {
    public static void main(String args[]){
        System.out.println("I am starting thread and my name is: "+ Thread.currentThread().getName());
        RunnableExample2 example2 = new RunnableExample2();
        example2.start();
        System.out.println("I am ending thread and my name is: "+ Thread.currentThread().getName());
    }
}
