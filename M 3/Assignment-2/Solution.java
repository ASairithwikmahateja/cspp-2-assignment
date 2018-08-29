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
        for (int i = n; i >= seven; i--) {
        	for (int j = i % rem; j == seven; j = j / rem) {
        			cnt = cnt + 1;
        	}
        } System.out.println(cnt);
    }
}
