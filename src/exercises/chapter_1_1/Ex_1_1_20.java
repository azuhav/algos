package exercises.chapter_1_1;
/*
Write a recursive static method that computes the value of ln (N !)
 */

public class Ex_1_1_20 {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println((Math.log(factorial(5))));
    }
}
