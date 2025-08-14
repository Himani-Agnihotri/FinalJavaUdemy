public class Main {
    public static void main(String args[]){
        System.out.println("Main Start");

        SharedResource sharedResource = new SharedResource();

        Thread produceThread = new Thread(new ProduceTask(sharedResource));

        Thread consumeThread = new Thread(new ConsumeTask(sharedResource));

        produceThread.start();
        consumeThread.start();

        System.out.println("Main End");
    }
}
