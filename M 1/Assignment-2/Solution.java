import java.util.Scanner;

public class Solution {
	/*
	Do not modify this main function.
	*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int base = scan.nextInt();
		int height = scan.nextInt();
		areaOfTriangle(base, height);
	}
	static float areaOfTriangle(int base, int height) {
	/*
	Need to fill the areaOfTriangle function
	*/
		float area = (base * height) / 2;
		System.out.println(area);
		return area;
	}
}
