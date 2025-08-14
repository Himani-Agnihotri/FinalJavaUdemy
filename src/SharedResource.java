public class SharedResource {
    boolean itemAvailable = false;

    public synchronized void addItem(){
        itemAvailable=true;
        System.out.println("Item added by: "+ Thread.currentThread().getName());
        notifyAll();
    }

    public synchronized void consumeItem(){
        System.out.println("consumeItem invoked by: "+ Thread.currentThread().getName());
        while (!itemAvailable){
            try {
                System.out.println("Thead is waiting now: "+ Thread.currentThread().getName());
                wait();
            }catch (Exception e){

            }
        }
        System.out.println("Item consumed by: "+ Thread.currentThread().getName());
        itemAvailable=false;
    }
}
