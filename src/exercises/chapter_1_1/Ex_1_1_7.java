package exercises.chapter_1_1;
/*
Give the value printed by each of the following code fragments:
 */

public class Ex_1_1_7 {

    public static void main(String[] args) {

        // A
        double t = 9.0; // 5.0, 3.4, 3.023 ...
        while (Math.abs(t - 9.0/t) > .001) // 8.0 > 0.001, 3.2 > .001, 0.75 > .001 ...
            t = (9.0/t + t) / 2.0; // 10/ 2.0 = 5, 6.8/ 2.0 = 3.4, 6.047 /2 = 2.023 ...
        System.out.printf("%.5f\n", t); // 3.00009
        // B
        int sum1 = 0;
        for (int i = 1; i < 1000; i++)
            for (int j = 0; j < i; j++)
                sum1++;
        System.out.println(sum1); // sum1 = 1, sum1 =2, sum1 = 3 ...  sum1 = 499500
        // C
        int sum2 = 0;
        for (int i = 1; i < 1000; i *= 2)
            for (int j = 0; j < i; j++) {
                sum2++;
        System.out.println(sum2);}
        System.out.println(sum2); // 1023
    }
}
