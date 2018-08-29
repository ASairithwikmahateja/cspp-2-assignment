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
 		int i, r = 0, temp;
        int cnt = 0;
        for (i = 2; i <= n; i++) {
        	temp = i;
        	while (temp > 0) {
        		r = temp % rem;
        		if(r == seven) 
        		cnt = cnt + 1;
        		temp = temp / rem;	
        	}
        } System.out.println(cnt);
    }
}
