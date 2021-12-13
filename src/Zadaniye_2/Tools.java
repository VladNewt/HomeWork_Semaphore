package Zadaniye_2;

import java.util.SortedMap;
import java.util.concurrent.Semaphore;

public class Tools {

    public static final int permit = 3;

    public static void sleepThread(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void startThreads(int number) {
        Semaphore semafore = new Semaphore(permit);
        System.out.println("Start is " + number + " threads");
        for (int i = 0; i < number; i++) {
            new MyThreadSemaphore("T "+i, semafore, permit).start();
        }
    }
}
