package FinalPrep.Threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskExecutor {
    public static void main(String[] args){
        PrintTask task1 = new PrintTask("Task 1");
        PrintTask task2 = new PrintTask("Task 2");
        PrintTask task3 = new PrintTask("Task 3");

        ExecutorService executorService = Executors.newCachedThreadPool();


        executorService.execute(task1);
        executorService.execute(task2);
        executorService.execute(task3);

        executorService.shutdown();
    }
}
