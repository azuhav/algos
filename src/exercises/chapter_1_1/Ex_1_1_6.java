package exercises.chapter_1_1;
/*
What does the following program print?
 */

public class Ex_1_1_6 {

    public static void main(String[] args) {
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++)
        {
            System.out.println(f); // 0, 1, 1, 2, 3, 5, 8 ...
            f = f + g; // 1, 1, 2, 3, 5, 8 ...
            g = f - g; // 0, 1, 1, 2, 3, 5 ...
        }
    }
}
