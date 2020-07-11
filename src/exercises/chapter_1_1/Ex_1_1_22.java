package exercises.chapter_1_1;
/*
Write a version of BinarySearch that uses the recursive rank() given on page
25 and traces the method calls. Each time the recursive method is called, print the argument
values lo and hi, indented by the depth of the recursion. Hint: Add an argument
to the recursive method that keeps track of the depth.
 */

import java.util.Arrays;

public class Ex_1_1_22 {

    // Recursion version of binary search

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
