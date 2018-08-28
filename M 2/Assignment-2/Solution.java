import java.util.Scanner;
import java.lang.Math.*;

public class Solution {
	/*
	Do not modify this main function.
	*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		rootsOfQuadraticEquation(a, b, c);
		//System.out.println(rootsOfQuadraticEquation(a, b, c));
	}
	/*
	Need to write the rootsOfQuadraticEquation function and print the output.
	*/
	static void rootsOfQuadraticEquation(int a, int b, int c) {
		double proot = (-1 * b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		double nroot = (-1 * b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		System.out.println(" positive root is : " + proot + "\n" + " negative root is : " + nroot);
	}
}
