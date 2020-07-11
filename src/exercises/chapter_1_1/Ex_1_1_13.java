package exercises.chapter_1_1;
/*
Write a code fragment to print the transposition (rows and columns changed)
of a two-dimensional array with M rows and N columns.
 */

public class Ex_1_1_13 {

    public static void main(String[] args) {
        String s = "abcdef";
        int N = 2;
        int M = 3;
        char[][] arr = new char[N][M];
        for (int x = 0, z = 0; x < arr.length; x++)
            for (int y = 0; y < arr[0].length && z < N * M; y++) {
                arr[x][y] = s.charAt(z);
                z++;
            }

        for (int x = 0; x < N; x++) {
            System.out.println();
            for (int y = 0; y < M; y++) {
                System.out.print(arr[x][y] + "");
            }
        }

        System.out.println();

        char[][] arr_last = new char[M][N];

        for (int m = 0; m < M; m++)
            for (int n = 0; n < N; n++) {
                arr_last[m][n] = arr[n][m];
            }

        for (int x = 0; x < M; x++) {
            System.out.println();
            for (int y = 0; y < N; y++) {
                System.out.print(arr_last[x][y] + "");
            }
        }
    }
}
