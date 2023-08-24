public class Animate implements Runnable{
    BlockBreakerPanel bp;
    Animate(BlockBreakerPanel b){
        bp=b;
    }
    public void run(){
        while(true){
            bp.update();
            Thread.sleep(10);

        }
    }

}
