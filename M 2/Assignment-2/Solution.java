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
        int frstcoeff = scan.nextInt();
        int secncoeff = scan.nextInt();
        int thrdcoeff = scan.nextInt();
        rootsOfQuadratic(frstcoeff, secncoeff, thrdcoeff);
        /*System.out.println(rootsOfQuadraticEquation
        (frstcoeff, secncoeff, thrdcoeff));*/
    }
    /**
    Need to write the rootsOfQuadraticEquation
    function and print the output.
    @param frstcoeff int
    @param secncoeff int
    @param thrdcoeff int
    */
    static void rootsOfQuadratic(final int frstcoeff, final int secncoeff,
     final int thrdcoeff) {
        final int val = 4;
    double proot = (-1 * secncoeff + Math.sqrt
    (secncoeff * secncoeff - val * frstcoeff * thrdcoeff)) / (2 * frstcoeff);
    double nroot = (-1 * secncoeff - Math.sqrt
    (secncoeff * secncoeff - val * frstcoeff * thrdcoeff)) / (2 * frstcoeff);
    System.out.println(proot + " " + nroot);
    }
}
