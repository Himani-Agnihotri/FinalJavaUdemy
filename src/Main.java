public class Main {
    public static void main(String args[]){
        SharedResource1 sharedResource1 = new SharedResource1();
        System.out.println("Main Thread Started");
        Thread th1 = new Thread(()->{
            System.out.println("Thread 1 calling produce method");
            sharedResource1.produce();
        });

        th1.start();
        System.out.println("Main Thread is finishing");
    }
}
