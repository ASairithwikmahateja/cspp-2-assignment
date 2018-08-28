import java.util.Scanner;
/**
@author Mahateja
*/
public final class Factorial {
    /**
    Do not modify this class
    */
    /**
    @default constructor
    */
    private Factorial() { }
    /**
    @param  args string
    */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(fact(num));
    }
    /**
    @param num int
    @return f
    */
    static int fact(final int num) {
        if (num == 0 || num == 1) {
            final int f = 1;
            return f;
        } else {
            final int f;
            f = num * fact(num - 1);
            return f;
        }
    }
}
