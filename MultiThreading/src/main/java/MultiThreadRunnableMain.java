public class MultiThreadRunnableMain {
    public static void main(String[] args) throws InterruptedException {
        for(int i = 0 ; i <=3 ; i++){
            MultiThreadRunnable thread = new MultiThreadRunnable(i);
            Thread t = new Thread(thread);
            t.start();
        }
    }
}
