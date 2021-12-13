package Zadaniye_3;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.CyclicBarrier;

public class Main {
    private static CyclicBarrier barrier = new CyclicBarrier(3, new Broken());
    public static void main(String[] args) {
        Random rnd = new Random();

        int[] array = new int[rnd.nextInt(10)];

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(100);
            System.out.println("array["+i+"] = " + array[i]);
        }


        for (int i = 0; i < array.length; i++) {
            new BarierThread("Th"+i, i, rnd.nextLong(10000),barrier,array).start();
        }


    }

}
