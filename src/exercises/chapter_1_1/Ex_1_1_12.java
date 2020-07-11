package exercises.chapter_1_1;
/*
What does the following code fragment print?
 */

public class Ex_1_1_12 {

    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++)
            a[i] = 9 - i;
        for (int i = 0; i < 10; i++)
            a[i] = a[a[i]];
        for (int i = 0; i < 10; i++)
            System.out.println(i); // 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
    }
}
