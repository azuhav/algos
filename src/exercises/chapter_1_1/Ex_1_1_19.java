package exercises.chapter_1_1;

/*
Run the following program on your computer:
What is the largest value of N for which this program takes less 1 hour to compute the
value of F(N)? Develop a better implementation of F(N) that saves computed values in
an array.
 */

public class Ex_1_1_19 {
    private static long[] arr = new long[100];

    public static long F(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        return F(N - 1) + F(N - 2);
    }

    public static long F1(int N) {
        if (N == 0) {
            arr[0] = 0;
        } else if (N == 1) {
            arr[1] = 1;
        } else {
            arr[N] = arr[N - 1] + arr[N - 2];
        }
        return arr[N];
    }

    public static long F2(int n) {
        int a = 0;
        int b = 1;
        for (int i = 2; i <= n; ++i) {
            int next = a + b;
            a = b;
            b = next;
        }
        return a + b;
    }

    public static void main(String[] args) {
        for (int N = 0; N < 100; N++)
            System.out.println((N + " " + F2(N)));
    }
}
