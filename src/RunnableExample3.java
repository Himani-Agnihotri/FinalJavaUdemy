public class RunnableExample3 implements Runnable{

    MonitorLockExample obj;

    public RunnableExample3(MonitorLockExample obj){
        this.obj=obj;
    }
    @Override
    public void run() {
           obj.task1();
    }

}
