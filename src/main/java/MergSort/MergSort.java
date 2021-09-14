package MergSort;

import Array.Array;
import InsertionSort.InsertionSort;

import java.util.Arrays;

public class MergSort {
    public MergSort() {
    }

    public static <E extends Comparable<E>> void sort(E[] arr) {
        E[] temp = Arrays.copyOf(arr, arr.length);
        sort(arr, 0, arr.length - 1, temp);
    }

    private static <E extends Comparable<E>> void sort(E[] arr, int l, int r, E[] temp) {

//        if (l >= r) {
//            return;
//        }

        if (r - l <= 15) {
            InsertionSort.sort(arr, l, r);
            return;
        }
        int mid = (l + r) / 2;
        sort(arr, l, mid, temp);
        sort(arr, mid + 1, r, temp);
        if (arr[mid].compareTo(arr[mid + 1]) > 0) {
            merge(arr, l, mid, r, temp);
        }

    }

    public static <E extends Comparable<E>> void merge(E[] arr, int l, int mid, int r, E[] temp) {
        System.arraycopy(arr, l, temp, l, r - l + 1);
        int i = l, j = mid + 1;
        for (int k = l; k <= r; k++) {
            if (i > mid) {
                arr[k] = temp[j];
                j++;
            } else if (j > r) {
                arr[k] = temp[i];
                i++;
            } else if (temp[i].compareTo(temp[j - l]) <= 0) {
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp[j];
                j++;
            }
        }
    }
}
