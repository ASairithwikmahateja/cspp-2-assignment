import java.util.Scanner;
//import java.lang.Math.*;
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
    @param  args string
    */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        rootsOfQuadratic(a, b, c);
        //System.out.println(rootsOfQuadraticEquation(a, b, c));
    }
    /**
    Need to write the rootsOfQuadraticEquation
    function and print the output.
    @param a int
    @param b int
    @param c int
    */
    static void rootsOfQuadratic(final int a, final int b, final int c) {
        final int t = 4;
    double proot = (-1 * b + Math.sqrt(b * b - t * a * c)) / (2 * a);
    double nroot = (-1 * b - Math.sqrt(b * b - t * a * c)) / (2 * a);
    System.out.println(proot + " " + nroot);
    }
}


