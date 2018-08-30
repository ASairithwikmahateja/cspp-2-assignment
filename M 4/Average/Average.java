import java.util.Scanner;
    /*
    Do not modify this main function.
    */
    /**
    @author Mahateja
    */
public final class Average {
    /* Fill the main function to print the number of 7's between 1 to n*/
    /**
    @default constructor
    */
    private Average() { }
    /**
     *
     * @param      args    String
     */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        float sum = 0, avg = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
            sum = sum + a[i];
            avg = sum / a.length;
        } System.out.println("sum :"+ sum + "," + "avg :"+ avg);    
    }
}
