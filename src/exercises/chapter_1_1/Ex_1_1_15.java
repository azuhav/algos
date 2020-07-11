package exercises.chapter_1_1;

/*
1.1.15 Write a static method histogram() that takes an array a[] of int values and
an integer M as arguments and returns an array of length M whose ith entry is the number
of times the integer i appeared in the argument array. If the values in a[] are all
between 0 and M–1, the sum of the values in the returned array should be equal to
a.length.
 */

import java.util.Arrays;

public class Ex_1_1_15 {
    public static int[] histogram(int arr[], int m) {

        int[] result = new int[m];

        for (int i = 0; i < arr.length; i++) {
            System.out.println(result[arr[i]] + " " + arr[i]);
            result[arr[i]] += 1;
            System.out.println(result[arr[i]]);
        }
        return result;

    }

    public static void main(String[] args) {

        int[] a = {1, 1, 2, 3, 5, 5, 8};
        int[] b = histogram(a, 9);
        System.out.println(Arrays.toString(a));
        System.out.print(Arrays.toString(b));
    }
}
