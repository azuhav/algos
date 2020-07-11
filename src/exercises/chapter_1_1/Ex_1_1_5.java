package exercises.chapter_1_1;
/*
Write a code fragment that prints true if the double variables x and y are both
strictly between 0 and 1 and false otherwise.
 */

public class Ex_1_1_5 {

    public static void main(String[] args) {

        double x = 0.9999;
        double y = 0.0001;
        double upper = 1.0;
        double lower = 0;

        if ((x < upper && x > lower) && (y < upper && y > lower)) {
            System.out.println("TRUE");
        } else System.out.println("FALSE");

    }
}
