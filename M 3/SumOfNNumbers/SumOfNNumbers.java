//import java.util.*;
/**
@author Mahateja
*/
public final class SumOfNNumbers {
    /**
    Do not modify this class
    */
    /**
    @default constructor
    */
    private SumOfNNumbers() { }
    /**
    @param  args string
    */
    public static void main(final String[] args) {
        int i = 1;
        final int br = 10;
        int sum = 0;
        while (i <= br) {
            sum = sum  + i;
            i = i + 1;
        } System.out.println(sum);
    }
}
