import java.util.*;

public class anagram {

	public static void main(String[] args) {
		String s = "xulkowreuowzxgnhmiqekxhzistdocbnyozmnqthhpievvlj"; // 10
		
		// s = aaabbb // 3. replace all characters
		// s = ab // 1
		// s = mnop //2
		// s = xyyx // 0
		/*
		 * For example, given the string 'abccde', you would break it into two parts:
		 * 'abc' and 'cde'. Note that all letters have been used, the substrings are
		 * contiguous and their lengths are equal. Now you can change 'a' and 'b' in the
		 * first substring to 'd' and 'e' to have 'dec' and 'cde' which are anagrams.
		 * Two changes were necessary.
		 * 
		 */

		/*
		 * abccde abc cde
		 * 
		 * a = 1 b = 1 c = 1
		 * 
		 * c = 0 d = -1 e = -1
		 * 
		 * only consider postive occurances
		 * 
		 */
		if (s.length() % 2 != 0) {
			System.out.println("return -1");
		}
		int[] freq = new int[26];
		// iterate first half of string
		for (int i = 0; i < s.length() / 2; i++) {
			freq [s.charAt(i) - 97] = freq [s.charAt(i) - 97] +1;
		}
		// iterate last half of string
		for (int i = s.length() / 2; i < s.length(); i++) {
			freq [s.charAt(i) - 97] = freq [s.charAt(i) - 97] - 1 ;
		}
		int total = 0;
		// loop through freq array, only consider positive values
		for (int i = 0; i < 26; i++) {
			if (freq[i] > 0) {
				total += freq[i];
			}
		}
		System.out.println(total);
	}

}
