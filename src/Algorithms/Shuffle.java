package Algorithms;

import java.util.Random;

public class Shuffle {

    public static void sort(int[] a){

    }

    public static void shuffle(int[] a){

        Random random = new Random();
        int N = a.length;

        for (int i = 0; i < N; i++) {
            int swapIndex = random.nextInt(i + 1);

            int temp = a[i];
            a[i] = a[swapIndex];
            a[swapIndex] = temp;
        }

    }

}
