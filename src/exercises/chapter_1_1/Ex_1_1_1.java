package exercises.chapter_1_1;
/*
Give the value of each of the following expressions:
a. ( 0 + 15 ) / 2
b. 2.0e-6 * 100000000.1
c. true && false || true && true
 */

public class Ex_1_1_1 {

    public static void main(String[] args) {
        System.out.println((0 + 15) / 2); // 7
        System.out.println(2.0e-6 * 100000000.1); // 200.0000002
        System.out.println(true && false || true && true); // true
        System.out.println(0.000002 * 100000000.1); //200.0000002
    }
}
