import java.util.Scanner;

public class Solution {
	/*
	Do not modify this main function.
	*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double degreesCelsius = scan.nextDouble();
		calculateFromDegreesToFarenheit(degreesCelsius);
	}
	static double calculateFromDegreesToFarenheit(double degreesCelsius) {
	/*
	Need to fill the calculateFromDegreesToFarenheit function
	and print the output of fahrenheit.
	*/
		double farenheit;
		farenheit = (((9 * degreesCelsius) / 5) + 32);
		System.out.println(farenheit);
		return farenheit;
	}
}
