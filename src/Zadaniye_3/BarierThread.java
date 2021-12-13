package Zadaniye_3;

import Zadaniye_2.Tools;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class BarierThread extends Thread {

    private final int number;
    private final long timeout;
    private final CyclicBarrier cb;
    private final int[] arr;

    public BarierThread(String name, int number, long timeout, CyclicBarrier cb, int[] arr) {
        super(name);
        this.number = number;
        this.timeout = timeout;
        this.cb = cb;
        this.arr = arr;
    }


    @Override
    public void run() {

        try {
            System.out.println(getName());
            cb.await();
            Tools.sleepThread((int)timeout);
            System.out.println("array["+number+"] = " + arr[number]);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }

    }
}
