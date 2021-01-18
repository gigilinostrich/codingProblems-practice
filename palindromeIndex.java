
public class palindromeIndex {

	public static void main(String[] args) {
		String s = "bcbc";
		int palindromeIndex = -1; // given
		int len = s.length();
		/* len - i - 1
		 * If you are matching first character from start then you should compare it
		 * with first character from last also to check the palindromes.
		 * 
		 * If you are comparing 2nd character from start then you should compare 2nd
		 * character from last.
		 * 
		 * ex.   aabccccaa
		 * 		 a and a is same, good
		 *		 a and a is same, good
		 * 		 b and c is different, stop
		 * 		check cccc and bccc if one of them is palindromes
		 *       if b is (cccc), return i
		 *       if c is (bccc), return len - i - 1
		 */
		for (int i = 0; i < len / 2; i++) {
			if (s.charAt(i) != s.charAt(len - i - 1)) { // 
				if (isPalindrome(s.substring(i + 1, len - i))) {
					System.out.println("return i");
				} else {
					System.out.println("return len - i -1");
				}
			}
		}
		// return palindromeIndex;
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
