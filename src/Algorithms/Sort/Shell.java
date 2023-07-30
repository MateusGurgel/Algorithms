package Algorithms.Sort;

public class Shell {
    public static void sort(int[] a){
        int N = a.length;

        int h = 1;
        while (h < N / 3 ) h = 3*h + 1;

        while (h >= 1){
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && a[j] > a[j - h]; j -= h) {
                    int temp = a[j];
                    a[j] = a[j - h];
                    a[j - h] = temp;
                }
            }

            h = h/3;
        }
    }
}
