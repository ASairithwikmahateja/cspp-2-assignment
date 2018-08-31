// Given an String, Write a java method that returns the decimal value for the given binary string.
import java.util.Scanner;
import java.lang.*;
    /**
    @author Mahateja
    */
public final class Solution {
    /*
	Do not modify this main function.
	*/
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
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i <= n; i++) {
			String s = sc.nextLine();
			double res = binaryToDecimal(s);//Write binaryToDecimal function
			System.out.println((int) res);
		}
	}
	/**
	 *
	 * @param      s     String
	 *
	 * @return     rev
	 */
	static double binaryToDecimal(final String s) {
		double bin = 0;
		int v = Integer.parseInt(s);
		int tmp = 0;
		for (int i = 0; i < s.length(); i++) {
			tmp = v % 10;
	        bin = bin + tmp * Math.pow(2, i);
	        v = v / 10;
   	    }  
	    return bin;
	}
}
