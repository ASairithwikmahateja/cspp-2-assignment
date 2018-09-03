import java.util.Scanner;
class InputValidator {
	/*Write the atrributes and methods for InputValidator*/
	private String str;
	public InputValidator(String input) {
	    str = input;
	}
    public boolean validateData(final String input) {
        int len = input.length();
        final int six = 6; 
        if (len >= six) {
        	return true;
        } else {
        	return false;
        }
    }
}
public final class Solution {
	public Solution() { }
	public static void main(final String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String input = sc.nextLine();
    	InputValidator i = new InputValidator(input);  	
    	System.out.println(i.validateData(input));
    }
}
