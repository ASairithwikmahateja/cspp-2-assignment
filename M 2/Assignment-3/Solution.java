import java.util.Scanner;
import java.lang.Math.*;

public class Solution {
	/*
	Do not modify this main function.
	*/
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);      
        int base = s.nextInt();
        int exponent = s.nextInt();
        int result = power(base, exponent);
        System.out.println(result);
	}
	/*
	Need to write the power function and print the output.
	*/
	static int power(int base, int exponent) {
		if (exponent == 0) {
			int pow = 1;
			return pow; }
		else if (exponent == 1) {
			int pow = base;
			return pow; }
		else {
			int pow = base * power(base, exponent - 1);
			return pow; }
	}
}
