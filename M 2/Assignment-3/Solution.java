import java.util.Scanner;
import java.lang.Math.*;

public class Solution {
	/*
	Do not modify this main function.
	*/
	public static void main(final String[] args) {
		Scanner s = new Scanner(System.in);      
        int base = s.nextInt();
        int exponent = s.nextInt();
        long result = power(base, exponent);
        System.out.println(result);
	}
	/*
	Need to write the power function and print the output.
	*/
	static long power(final int base, final int exponent) {
		if (exponent == 0) {
			int pow = 1;
			return pow;
			 }
		else if (exponent == 1) {
			int pow = base;
			return pow;
			 }
		else {
			long pow = base * power(base, exponent - 1);
			return pow;
			 }
	}
}
