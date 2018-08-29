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
        int cnt = 0;
        for (int i = n; i > 0;i--) {
        	for (int j = i % 10; j == 7;) {
        		cnt = cnt + 1;
        		j = j / 10;
        	}
        } System.out.println(cnt);
    }
}
