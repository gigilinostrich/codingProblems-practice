import java.util.*;
import java.util.regex.*;
public class longestDigitPrefix {

	public static void main(String[] args) {
		/*
		 * Given a string, output its longest prefix which contains only digits.
		 * 
		 * Example
		 * 
		 * For inputString = "123aa1", the output should be
		 * longestDigitsPrefix(inputString) = "123"
		 * 
		 * 
		 */

		String inputString = "12abc34"; //12
		String result = "";
		for (int i = 0; i < inputString.length(); i++) {
			if (Character.isWhitespace(inputString.charAt(i))) {
				break;
			}
			else if (Character.isDigit(inputString.charAt(i))) {
				result += inputString.charAt(i);
			}
			else {
				break;
			}
		}
		System.out.println("result " + result);
		
		
		
		
		
		
	}

}
