import java.util.*;

public class buildPalindrome {
	/*
	 * Given a string, find the shortest possible string which can be achieved by
	 * adding characters to the end of initial string to make it a palindrome.
	 * 
	 * Example
	 * 
	 * For st = "abcdc", the output should be buildPalindrome(st) = "abcdcba"
	 */
	public static void main(String[] args) {
		String st = "abcabc"; // abcabcbacba

		int len = st.length();

		StringBuffer ans = new StringBuffer(st);

		for (int i = 0; i < len; i++) {
			if (!isPalindrome(ans.toString())) {
				ans.insert(ans.length() - i, st.charAt(i));
				// ansStr = ans + ansStr; don't put this
			}
		}
		System.out.println("result: " + ans.toString());
	}

	public static boolean isPalindrome(String s) {
		int len = s.length();
		for (int i = 0; i < len / 2; i++) {
			if (s.charAt(i) != s.charAt(len - i - 1)) {
				return false;
			}
		}

		return true;
	}

}
