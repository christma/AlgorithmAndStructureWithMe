package QuickSort;


import java.util.Random;

public class QuickSortOptimization {
    private QuickSortOptimization() {
    }

    public static <E extends Comparable<E>> void sort(E[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    public static <E extends Comparable<E>> void sort(E[] arr, int l, int r) {
        if (l >= r) {
            return;
        }
        int partiticn = partiticn(arr, l, r);
        sort(arr, l, partiticn - 1);
        sort(arr, partiticn + 1, r);

    }

    private static <E extends Comparable<E>> int partiticn(E[] arr, int l, int r) {

        int p = l + (new Random()).nextInt(r - l + 1);
        swap(arr, l, p);

        int j = l;
        for (int i = l + 1; i <= r; i++) {

            if (arr[i].compareTo(arr[l]) <= 0) {
                j++;
                swap(arr, i, j);
            }
        }
        swap(arr, l, j);
        return j;
    }

    private static <E> void swap(E[] arr, int i, int j) {
        E e = arr[i];
        arr[i] = arr[j];
        arr[j] = e;
    }


}
