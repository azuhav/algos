package exercises.chapter_1_1;
/*
Add to the BinarySearch test client the ability to respond to a second argument:
+ to print numbers from standard input that are not in the whitelist, - to print
numbers that are in the whitelist.
 */

import java.util.Arrays;

public class Ex_1_1_23 {
    public static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1, 0);
    }

    public static int rank(int key, int[] a, int lo, int hi, int deep) {

        deep += 1;
        for (int i = 1; i < deep; i++) {
            System.out.println(" ");
        }
        System.out.println("lo=" + lo + " hi=" + hi);
        // Index of key in a[], if present, is not smaller than lo
        // and not larger than hi.
        if (lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) return rank(key, a, lo, mid - 1, deep);
        else if (key > a[mid]) return rank(key, a, mid + 1, hi, deep);
        else return mid;
    }

    public static void main(String[] args) {
        int [] arr = new int[]{2, 87, 31, 0, 7, 12, 65};
        Arrays.sort(arr);
        System.out.println(rank(87, arr));
    }
}
