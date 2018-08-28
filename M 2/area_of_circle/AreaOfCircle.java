import java.util.Scanner;
/**
@author Mahateja
*/
public final class AreaOfCircle {
    /**
    Do not modify this class
    */
    /**
    @default constructor
    */
    private AreaOfCircle() { }
    /**
    @param  args string
    */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        area(r);
    }
    /**
    @return pi
    */
    static double pi() {
        final double pi = 3.14;
        return pi;
    }
    /**
    @param r int
    @return Cir_area
    */
    static double area(final int r) {
        double cirarea = pi() * r * r;
        System.out.println(cirarea);
        return cirarea;
    }
}
