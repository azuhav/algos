package exercises.chapter_1_1;
/*
Write a static method lg() that takes an int value N as argument and returns
the largest int not larger than the base-2 logarithm of N. Do not use Math.
 */

public class Ex_1_1_14 {

    public static void main(String[] args) {

        int n = 8;
        int i = 0; // the largest int

        while(true) {
            if (n / 2 == 0) {
                break;
            }
            i += 1; // how many times 8 will be divided by 2
            n /= 2;
        }
        System.out.println(i); // 2 ^ 3 == 2 * 2 * 2, int = 3
    }
}
