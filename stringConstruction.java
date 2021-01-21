import java.util.*;

public class stringConstruction {
	/*
	 * Amanda has a string of lowercase letters that she wants to copy to a new
	 * string. She can perform the following operations with the given costs. She
	 * can perform them any number of times to construct a new string p
	 * 
	 * :
	 * 
	 * Append a character to the end of string p at a cost of 1 dollar. 
	 * Choose any substring of and append it to the end of at no charge.
	 * 
	 */
	public static void main(String[] args) {
		String s = "abcd"; // cost 4 dollars
		// abab cost 2 dollars

		HashSet<Character> hs = new HashSet<Character>();

		for (int i = 0; i < s.length(); i++) {
			hs.add(s.charAt(i));
		}
		System.out.println("cost " + hs.size());
	}

}
