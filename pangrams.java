
package pangrams;

import java.util.*;

public class pangrams {
	public static String pangrams1(String s) {
		String s1 = s.replaceAll("\\s", ""); // remove all white spaces

		HashSet<Character> lettersInS = new HashSet<Character>();

		for (int i = 0; i < s1.length(); i++) {
			lettersInS.add(	Character.toLowerCase(s1.charAt(i)));
		}
		
		for (char c = 'a'; c <= 'z'; c++) {
			if (!lettersInS.contains(c)) {
				return "not pangram";
			}
		}
		return "pangram";
	}

	public static void main(String[] args) {
		// A pangram is a string that contains every letter of the alphabet. Given a
		// sentence determine whether it is a pangram in the English alphabet. Ignore
		// case. Return either pangram or not pangram as appropriate.

		String s = "We promptly judged antique ivory buckles for the  prize";
		System.out.println(pangrams1(s));

	}

}
