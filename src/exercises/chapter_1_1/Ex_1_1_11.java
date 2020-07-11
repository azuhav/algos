package exercises.chapter_1_1;
/*
Write a code fragment that prints the contents of a two-dimensional boolean
array, using * to represent true and a space to represent false. Include row and column
numbers.
 */

public class Ex_1_1_11 {

    public static void printContent(boolean[][] arr) {

        for (int x = 0; x < arr.length; x++) {

            for (int y = 0; y < arr[0].length; y++) {
                if (arr[x][y]) System.out.println(x + "," + y + " = " + "*");
                else System.out.println(x + "," + y + " = " + " ");
            }
        }
    }

    public static void main(String[] args) {
        printContent
                (new boolean[][]{{true, false}, {false, true}});
    }
}
