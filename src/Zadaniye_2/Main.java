package Zadaniye_2;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();

        for (int i = 0; i < 10; i++) {
            Tools.startThreads(rnd.nextInt(6));
            Tools.sleepThread(3000);
        }

    }







}
