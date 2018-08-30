import java.util.*;
public class Solution
{/*
	Fill this main function to print maximum of given array
	*/
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int tmp = 0;
		for (int i = 0; i < a.length-1; i++) {
			if (tmp < a[i+1]) {
				tmp = a[i+1];
			}
		} System.out.println(tmp);
	}
}
