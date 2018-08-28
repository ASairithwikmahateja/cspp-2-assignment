import java.util.Scanner;
//import java.lang.Math.*;
/**
@author Mahateja
*/
public class Solution {
    /*
    Do not modify this main function.
    */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        rootsOfQuadraticEquation(a, b, c);
        //System.out.println(rootsOfQuadraticEquation(a, b, c));
    }
    /*
    Need to write the rootsOfQuadraticEquation
    function and print the output.
    */
    static void rootsOfQuadraticEquation(final int a, final int b, final int c) {
    	final int t = 4;
    double proot = (-1 * b + Math.sqrt(b * b - t * a * c)) / (2 * a);
    double nroot = (-1 * b - Math.sqrt(b * b - t * a * c)) / (2 * a);
    System.out.println(proot + " " + nroot);
    }
}


