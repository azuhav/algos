package exercises.chapter_1_1;
/*
Write a code fragment that puts the binary representation of a positive integer N
into a String s.
Solution: Java has a built-in method Integer.toBinaryString(N) for this job, but
the point of the exercise is to see how such a method might be implemented. Here is a
particularly concise solution:
 */

public class Ex_1_1_9 {
    public static void main(String[] args) {
        String s = "";
        int N = 6;
        for (int n = N; n > 0; n /= 2)
            s = (n % 2) + s;
        System.out.println(s);
    }
}
