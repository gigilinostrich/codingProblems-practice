
public class checkPalindrome {

	public static void main(String[] args) {
		// aabaa true
		// abac false
		// a 	true
		String inputStr = "a";
		String reversedStr = "";
		for (int i = inputStr.length()-1; i >= 0; i--) {
			reversedStr += inputStr.charAt(i);
		}
		if (reversedStr.equals(inputStr)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}

}
