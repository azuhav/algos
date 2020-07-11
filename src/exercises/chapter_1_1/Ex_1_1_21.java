package exercises.chapter_1_1;
/*
Write a program that reads in lines from standard input with each line containing
a name and two integers and then uses printf() to print a table with a column of
the names, the integers, and the result of dividing the first by the second, accurate to
three decimal places. You could use a program like this to tabulate batting averages for
baseball players or grades for students.
 */

import java.util.Scanner;

public class Ex_1_1_21 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str;
        while (!scanner.hasNext()) {
            str = scanner.nextLine();
            String[] arr = str.split(" ");
            int d1 = Integer.parseInt(arr[1]);
            int d2 = Integer.parseInt(arr[2]);
            double f1 = (double) d2 / d1;
            System.out.printf("%-6s %-6d %-6d %.3f\n", arr[0], d1, d2, f1);
        }
    }
}
