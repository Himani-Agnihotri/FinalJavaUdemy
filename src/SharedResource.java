import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {

    private Queue<Integer> sharedBuffer;
    private int bufferSize;

    public SharedResource(int bufferSize){
        sharedBuffer = new LinkedList<>();
        this.bufferSize=bufferSize;
    }

    public synchronized void produce(int item) throws InterruptedException {
        while (sharedBuffer.size()==bufferSize){
            System.out.println("Buffer is full");
            wait();
        }
        sharedBuffer.add(item);
        System.out.println("Produced Item" + item);
        notify();
    }

    public synchronized int consume() throws InterruptedException {
        if(sharedBuffer.isEmpty()){
            wait();
        }
        int item = sharedBuffer.poll();
        System.out.println("Consumed Item" + item);
        return item;
    }
}
