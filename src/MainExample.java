public class MainExample {
    public static void main(String args[]){
        SharedResourceOne obj = new SharedResourceOne();
        Thread t1 = new Thread(()->{
            try{
                  Thread.sleep(3000);
            }catch (Exception e){
            }
            obj.addItem();});
        Thread t2 = new Thread(()->{obj.consumeItem();});
        t1.start();
        t2.start();
    }
}

