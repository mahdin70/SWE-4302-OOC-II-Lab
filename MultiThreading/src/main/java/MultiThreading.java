public class MultiThreading {
    public static void main(String[] args){
        for(int i = 0; i <=3 ; i++){
            MultiThreadingEx thread = new MultiThreadingEx(i);
            thread.start();
        }
    }
}
