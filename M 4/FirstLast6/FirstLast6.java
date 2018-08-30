import java.util.Scanner;
import java.lang.*;
    /*
    Do not modify this main function.
    */
    /**
    @author Mahateja
    */
public final class FirstLast6 {
    /* Fill the main function to print the number of 7's between 1 to n*/
    /**
    @default constructor
    */
    private FirstLast6() { }
    /**
     *
     * @param      args    String
     */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        int l = a.length;
        for (int i = 0; i < l; i++) {
            a[i] = s.nextInt();
        } if (a[0] == 6 || a[l-1] == 6) {
                System.out.println(true);    
        }
    }
}


