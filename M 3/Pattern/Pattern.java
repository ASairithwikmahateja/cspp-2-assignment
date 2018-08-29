//import java.util.*;
/**
@author Mahateja
*/
public final class Pattern {
    /**
    Do not modify this class
    */
    /**
    @default constructor
    */
    private Pattern() { }
    /**
    @param  args string
    */
    public static void main(final String[] args) {
        int i = 1, j = 1;
        final int br = 5;
        for (i = 1; i <= br; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
