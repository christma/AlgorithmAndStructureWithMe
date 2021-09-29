package QuickSort;


import java.util.Random;

public class QuickSort2 {
    private QuickSort2() {
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

        int i = l + 1, j = r;
        while (true) {
            while (i <= j && arr[i].compareTo(arr[l]) < 0) {
                i++;
            }
            while (j >= i && arr[j].compareTo(arr[i]) > 0) {
                j--;
            }

            if (i >= j) {
                break;
            }
            swap(arr, i, j);
            i++;
            j--;
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
