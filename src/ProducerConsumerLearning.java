public class ProducerConsumerLearning {
    public static void main(String args[]){
        SharedResource sharedResource = new SharedResource(3);
        Thread producerThread = new Thread(()->{
           try{
               for (int i=1;i<=6;i++){
                   sharedResource.produce(i);
               }
           }catch (Exception ex){

           }
        });

        Thread consumeThread = new Thread(()->{
           try{
               for (int i=1;i<=6;i++){
                   sharedResource.consume();
               }
           }catch (Exception ex){

           }
        });
        producerThread.start();
        consumeThread.start();
    }
}
