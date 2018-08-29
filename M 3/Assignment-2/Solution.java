import java.util.Scanner;
import java.lang.Math;
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
        int i = n, cnt = 0, j = 0;
        for (i = n; i >= 0; i--) {
        	j = i % 10;
        	if (j == 7) {
   	    	    j = i % 10;
   	    	    cnt = cnt + 1;
       	        i = i / 10;
       	    }
       	} System.out.println(cnt);
   	}
} 


