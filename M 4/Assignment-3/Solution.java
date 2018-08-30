// Given an String, Write a java method that returns the decimal value for the given binary string.
import java.util.Scanner;
import java.lang.Math;
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
		int n = sc.nextInt();
		for (int i = 0; i <= n; i++) {
			String s = sc.nextLine();
			double res = binaryToDecimal(s);//Write binaryToDecimal function
			System.out.println((int)res);
		}
	}
	static double binaryToDecimal(final String s) {
		double bin = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s == "1") {
				bin = bin + Math.pow(2, i);
			}
		} return bin;
	}

}
