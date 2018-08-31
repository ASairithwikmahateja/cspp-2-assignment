import java.util.Scanner;
/*
Do not modify this main function.
*/
/**
@author Mahateja
*/
public final class Solution {
    /**
    @default constructor
    */
    private Solution() { }
    /**
     *
     * @param      args    String
     */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        gcd(n1, n2);
    }
    /*
    *Need to write the gcd function and print the output.
    */
    /**
     *
     *
     * @param      n1    int
     * @param      n2    int
     */
    static void gcd(final int n1, final int n2) {
        int gcd = 0;
        int swptmp = 0, num1 = n1, num2 = n2;
        if (n1 > n2) {
            for (int i = 2; i <= n1; i++) {
                if (n1 % i == 0 & n2 % i == 0) {
                    gcd = i;
                }
            } System.out.println(gcd);
        } else if (n1 < n2) {
            swptmp = num1;
            num1 = num2;
            num2 = swptmp;
            gcd(num1, num2);
        } else if (n1 == n2) {
            System.out.println(n1);
        }
    }
}

