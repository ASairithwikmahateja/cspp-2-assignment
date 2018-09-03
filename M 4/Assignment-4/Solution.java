/* Given an String, Write a java method that returns
the decimal value for the given binary string.*/
import java.util.Scanner;
    /**
    @author Mahateja
    */
public final class Solution {
    /*
    Do not modify the main function
    */
    /**
    @default constructor
    */
    private Solution() { }
    /**
     *
     * @param      args    String
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String reverse = reverseString(s);
        System.out.println(reverse);
    }
    //Write reverseString function
    /**
     *
     * @param      s     String
     *
     * @return     rev
     */
    static String reverseString(final String s) {
        String revstr = "";
        for (int i = 0; i < s.length(); i++) {
            revstr = s.charAt(i) + revstr;
        } return revstr;
    }
}


