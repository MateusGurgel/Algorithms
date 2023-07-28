package Algorithms.Sort;

public class Insertion {

    public static void sort(int[] a){
        int N = a.length;
        for (int i = 0; i < N; i++) {
            for (int j = i; j > 0; j--) {
                if(a[j-1] < a[j]){
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }
    }
}
