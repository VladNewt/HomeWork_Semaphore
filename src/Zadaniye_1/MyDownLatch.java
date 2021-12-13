package Zadaniye_1;

import java.util.concurrent.CountDownLatch;

public class MyDownLatch extends Thread {

    CountDownLatch latch;

    public MyDownLatch(String name, CountDownLatch latch) {
        super(name);
        this.latch = latch;
    }

    @Override
    public void run() {

            System.out.println("Thread: " + this.getName() + " run");
            //latch.countDown();
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread: " + this.getName() + " end.");


    }
}
