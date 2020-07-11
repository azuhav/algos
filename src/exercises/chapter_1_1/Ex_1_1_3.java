package exercises.chapter_1_1;
/*
Write a program that takes three integer command-line arguments and prints
equal if all three are equal, and not equal otherwise.
 */

import java.util.Scanner;

public class Ex_1_1_3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();

        if (one == two && two == three) {
            System.out.println("All equal");
        }
        else System.out.println("Not all equal");
    }
}
