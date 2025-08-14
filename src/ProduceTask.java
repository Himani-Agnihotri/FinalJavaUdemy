public class ProduceTask implements Runnable{

    SharedResource sharedResource;

    public ProduceTask(SharedResource resource){
        this.sharedResource=resource;
    }

    @Override
    public void run() {
       System.out.println("Produce Task: "+ Thread.currentThread().getName());
       try{
           Thread.sleep(5000l);
       }catch (Exception e){

       }
       sharedResource.addItem();
    }
}
