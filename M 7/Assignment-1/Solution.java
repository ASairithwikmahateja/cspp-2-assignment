import java.util.*;
class InputValidator {
	/*Write the atrributes and methods for InputValidator*/
	public InputValidator() {}
    public boolean validateData(String input) {
        int len = input.length();
        if (len > 6) {
        	return true;
        } else {
        	return false;
        }
    }
}
public class Solution {
	public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
    	String input = sc.nextLine();
    	InputValidator i = new InputValidator();    	
    	System.out.println(i.validateData(input));
    }
}
