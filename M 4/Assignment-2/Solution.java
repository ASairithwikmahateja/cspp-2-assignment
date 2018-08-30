import java.util.Scanner;
    /*
    Do not modify this main function.
    */
    /**
    @author Mahateja
    */
public final class Solution {
	/* Fill the main function to print resultant of addition of matrices*/
    /**
    @default constructor
    */
    private Solution() { }
    /**
     *
     * @param      args    String
     */
	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] a = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = sc.nextInt();
        	    //System.out.println(a[i][j]);
        	}
        }
        int row1 = sc.nextInt();
        int col1 = sc.nextInt();
        int[][] b = new int[row1][col1];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                b[i][j] = sc.nextInt();
        	    //System.out.println(b[i][j]);
        	}
        }
        if (row == row1 & col == col1) {
        	int[][] c = new int[row][col];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    c[i][j] = a[i][j] + b[i][j];
        	        System.out.print(c[i][j] + " ");
        	    } System.out.println();
            }
        } else {
        	System.out.println("not possible");
        }
	}
}
