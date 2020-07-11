package sorting;

import java.util.Arrays;

public class SelectionSort {

    public void sort(int[] a) {
        int N = a.length; // array length
        for (int i = 0; i < N; i++) { // Exchange a[i] with smallest entry in a[i+1...N).
            int min = i; // index of minimal entr.
            for (int j = i + 1; j < N; j++) {
                if ((a[j] < a[min])) min = j;
            }
            int temp = a[min]; // smallest item (founded while looping) in []a is assigned to temp
            a[min] = a[i]; // a[0] is assigned to ex-smallest item
            a[i] = temp; // smallest item (founded while looping) is a[0] now
        }
        System.out.println(Arrays.toString(a));
    }

//


    public static void main(String[] args) {
        SelectionSort sort = new SelectionSort();
        sort.sort(new int[]{10, 6, 4, 9, 1, 5, 2, 0, 3, 7});

    }
}
