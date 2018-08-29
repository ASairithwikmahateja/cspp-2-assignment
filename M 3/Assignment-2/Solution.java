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
        int i, cnt = 0, num = 0;
        while (n > 0) {
        	num = num + 1;
        	n = n / 10;
        }
        for (i = n; i >= 7; i--) {
        	if (i % Math.pow(10, num) == 7) {
        		//System.out.println(i);
        		cnt = cnt + 1;
        	}
       	} System.out.println(cnt);
    } 
}

