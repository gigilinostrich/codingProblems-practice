import java.util.*;
public class separateTheNumber {

	public static void main(String[] args) {
		String s = "99100101";
		String subString = "";
		boolean isValid = false;
		// only reaches the half of string length because the substring will excceed the original length
		for (int i = 1; i <= s.length()/2; i++) {
		// every substring will be different for each iteration
		subString = s.substring(0,i);
		System.out.println("subString " + subString);
		// convert to long because we need to increment the number
		Long num = Long.parseLong(subString);
		// set validStr with current substring first
		String validStr = subString;
		System.out.println("validString before " + validStr);
		// increment a num, convert back to string and concat validStr until it exceeds original length
		while (validStr.length() < s.length()) {
			validStr += Long.toString(++num);
			System.out.println("validString during " + validStr);
		}
		System.out.println("validString after " + validStr);

		if (s.equals(validStr)) {
			isValid = true;
			break;
		}
	}
		if (isValid == true) {
			System.out.println("YES " + subString);
		}
		else {
			System.out.println("NO");
		}
		}
	/*	
	  	subString 9
		validString before 9
	  	validString during 910
		validString during 91011
		validString during 9101112
		validString during 910111213
		validString after 910111213

		subString 99
		validString before 99
		validString during 99100
		validString during 99100101
		validString after 99100101
		break out of for loop
		YES 99

	 */
		
	
}
