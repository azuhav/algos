package exercises.chapter_1_2;

import java.util.Arrays;

public class Ex_1_2_9 {

    class Count {
        private int count = 0;

        public void increment() {
            count++;
        }

        public int tally() {
            return count;
        }
    }

    public static int rank(int key, int[] a, Count counter) { // Array must be sorted.
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) { // Key is in a[lo..hi] or not present.
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
                counter.increment();
            } else if (key > a[mid]) {
                lo = mid + 1;
                counter.increment();
            } else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        Ex_1_2_9 ex = new Ex_1_2_9();
        Ex_1_2_9.Count c = ex.new Count();
        int[] whitelist = {10, 4, 56, 7, 99, 32, 5, 79, 2, 42};
        Arrays.sort(whitelist);
        int key = 1;
        if (rank(key, whitelist, c) < 0)
            System.out.println(key);
        System.out.println(c.tally());
    }
}


