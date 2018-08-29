import java.util.Scanner;
    /*
    Do not modify this main function.
    */
    /**
    @author Mahateja
    */
public final class Solution {
    /* Fill the main function to print the number of 7's between 1 to n*/
    /**
    @default constructor
    */
    private Solution() { }
    /**
     *
     * @param      args    String
     */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        final int seven = 7;
        final int rem = 10;
        int i = n, cnt = 0, j = i, k = 0;
        for (i = n; i >= seven; i--) {
            	k = j % rem;
            	j = i / rem;
            	if (j > 0) {
            		if (k == seven) {
            			cnt = cnt + 1;
            		}

            	}

        } System.out.println(cnt);
    }
}
