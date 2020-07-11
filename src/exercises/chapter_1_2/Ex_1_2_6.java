package exercises.chapter_1_2;
/*
A string s is a circular rotation of a string t if it matches when the characters
are circularly shifted by any number of positions; e.g., ACTGACG is a circular shift of
TGACGAC, and vice versa. Detecting this condition is important in the study of genomic
sequences. Write a program that checks whether two given strings s and t are circular
shifts of one another. Hint : The solution is a one-liner with indexOf(), length(), and
string concatenation.
 */

public class Ex_1_2_6 {

    static boolean isRotation(String s1, String s2) {
        return (s1.length() == s2.length()) && ((s1 + s1).indexOf(s2) != -1);
    }

    public static void main(String[] args) {
        System.out.println(isRotation("ACTGACG", "TGACGAC"));
    }
}
