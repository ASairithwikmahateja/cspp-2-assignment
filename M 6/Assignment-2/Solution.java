import java.util.Scanner;
/**
 * Write a java program to round the
 * elements of a matrix to the nearest 100.
 *
 * @author : Mahateja
 */
final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        //not used
    }
    /**
     * Function to round the
     * elements of a matrix to the nearest 100.
     *
     * @param      a     Matrix of which the elements to be rounded
     * @param      rows     Number of rows
     * @param      columns     Number of columns
     *
     * @return     Matrix of the rounded elements
     */
    static int[][] roundHundred(final int[][] a,
        final int rows, final int columns) {
    // write your code here
        int m = rows;
        int n = columns;
        int[][] b = new int[m][n];
        final int zer = 0, fift = 50, hunft = 150,
        tohunf = 250, trhunf = 350, fohunf = 450, fihunf = 550;
        final int hundred = 100, tohundred = 200,
        trhundred = 300, fohundred = 400, fihundred = 500;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] >= zer & a[i][j] < fift) {
                    b[i][j] = zer;
                } else if (a[i][j] >= fift & a[i][j] < hunft) {
                    b[i][j] = hundred;
                } else if (a[i][j] >= hunft & a[i][j] < tohunf) {
                    b[i][j] = tohundred;
                } else if (a[i][j] >= tohunf & a[i][j] < trhunf) {
                    b[i][j] = trhundred;
                } else if (a[i][j] >= trhunf & a[i][j] < fohunf) {
                    b[i][j] = fohundred;
                } else if (a[i][j] >= fohunf & a[i][j] < fihunf) {
                    b[i][j] = fihundred;
                }
            }
        } return b;
    }
    /**
     * Main function.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scan.nextInt();
            }
        }
        int[][] b = roundHundred(a, m, n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n - 1; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println(b[i][n - 1]);
        }
    }
}
