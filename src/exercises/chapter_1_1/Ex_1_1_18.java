package exercises.chapter_1_1;
/*
Consider the following recursive function:
What are the values of mystery(2, 25) and mystery(3, 11)? Given positive integers
a and b, describe what value mystery(a, b) computes. Answer the same question, but
replace + with * and replace return 0 with return 1.
 */

public class Ex_1_1_18 {

    public static int mystery(int a, int b)
    {
        if (b == 0) return 0;
        if (b % 2 == 0) return mystery(a+a, b/2);
        return mystery(a+a, b/2) + a;
    }

    public static void main(String[] args) {
        System.out.println(mystery(2, 25));
        System.out.println(mystery(3, 11));
    }
}
