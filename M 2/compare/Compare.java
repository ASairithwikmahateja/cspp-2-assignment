import java.util.Scanner;
/**
@author Mahateja
*/
public final class Compare {
    /**
    Do not modify this class
    */
    /**
    @default constructor
    */
    private Compare() { }
    /**
    @param  args string
    */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        compare(a, b);
    }
    /**
    @param a int
    @param b int
    */
    static void compare(final int a, final int b) {
        if (a > b) {
            System.out.println("Bigger");
         } else if (a < b) {
            System.out.println("Lesser");
         } else if (a == b) {
            System.out.println("Equal");
        }
    }
}
