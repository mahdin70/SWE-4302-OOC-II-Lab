package FinalPrep.Threading;

public class ThreadCreator {
    public static void main(String[] args){
        Thread thread1 = new Thread(new PrintTask("Thread 1"));
        Thread thread2 = new Thread(new PrintTask("Thread 2"));
        Thread thread3 = new Thread(new PrintTask("Thread 3"));


        thread1.start();
        thread2.start();
        thread3.start();
    }
}
