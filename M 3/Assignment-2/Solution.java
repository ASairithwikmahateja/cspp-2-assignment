import java.util.Scanner;
    /*
	Do not modify this main function.
	*/
	/**
    @author Mahateja
    */
public final class Solution {
    /* Fill the main function to print the number of 7's between 1 to n*/
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
        int n = s.nextInt();
        int i, cnt = 0;
        for (i = n; i >= 7; i--) {
        	while (i % 10 == 7){
        		i = i / 10;
            	cnt = cnt + 1;
            	i++;
            }
        } System.out.println(cnt);
    }
}
