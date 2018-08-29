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
        int i, j, cnt = 0, num = 0;
        for (i = n; i >= 7; i--) {
        	for (j = i % 10; j >= 7; j--) {
        	    if (i % 10 == 7) 
        		    cnt = cnt + 1;
        	}
        } System.out.println(cnt);
   	}
} 


