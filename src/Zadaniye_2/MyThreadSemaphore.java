package Zadaniye_2;

import java.util.SortedMap;
import java.util.concurrent.Semaphore;

public class MyThreadSemaphore extends Thread {
    public static int counter;

    private Semaphore semaphore;
    private int permit;

    public MyThreadSemaphore(String name, Semaphore semaphore, int permit) {
        super(name);
        this.semaphore = semaphore;
        this.permit = permit;
    }

    @Override
    public void run() {
        try {
            System.out.println(getName() + " start " + permit);
            semaphore.acquire(semaphore.availablePermits());
            System.out.println("The asqure " + counter);
            Tools.sleepThread(1000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release(1);
            System.out.println(getName() + " the relese get counter " + counter++);
        }
    }
}
