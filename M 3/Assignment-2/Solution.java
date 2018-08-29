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
        } System.out.println(num);
        for (i = n; i >= 0; i--) {
        	while (num > 0) {
        		if (i % 10 == 7) {
        			//System.out.println(i);
        			cnt = cnt + 1;
        		} num = num -1;
        	}
       	} System.out.println(cnt);
    } 
}

