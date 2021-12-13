package Zadaniye_1;

import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        int numThread = 8;

        CountDownLatch latch = new CountDownLatch(2);
        for (int i = 1; i < numThread; i++) {
            new MyDownLatch( "Thread-"+i, latch).start();
            Thread.sleep(500);
        }
        System.out.println("Потоки созданы");

        //Разблокировка потока
        for (int i = 0; i < 8; i++) {
            latch.countDown();
        }

    }
}
