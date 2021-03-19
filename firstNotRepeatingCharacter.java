import java.util.*;

public class firstNotRepeatingCharacter {
	/*
	 * Given a string s consisting of small English letters, find and return the
	 * first instance of a non-repeating character in it. If there is no such
	 * character, return '_'.
	 * 
	 * Example
	 * 
	 * For s = "abacabad", the output should be firstNotRepeatingCharacter(s) = 'c'.
	 * 
	 * There are 2 non-repeating characters in the string: 'c' and 'd'. Return c
	 * since it appears in the string first.
	 * 
	 * For s = "abacabaabacaba", the output should be firstNotRepeatingCharacter(s)
	 * = '_'.
	 * 
	 * There are no characters in this string that do not repeat.
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		String s = "abacabaabacaba"; // g
		
System.out.println(firstNonRepeat2(s));


	}

	public static char firstNonRepeat2(String s) {
		
	HashMap<Character,Integer> countM = new HashMap<Character,Integer>();
	for(int i = 0; i < s.length(); i++) {
		if(countM.containsKey(s.charAt(i))) {
			countM.put(s.charAt(i),countM.get(s.charAt(i))+1);
		}
		else {
			countM.put(s.charAt(i), 1);
		}
	}
	List<Character> ans = new ArrayList<Character>();
	for(int i = 0; i < s.length(); i++) {
		int oneC = countM.get(s.charAt(i));
		// store only character with one count into a separate list
		if(oneC == 1) {
			ans.add(s.charAt(i));
		}
		
	}
	// iterate s, search the string if it contains the first non repeating character
	for(int i = 0; i < s.length(); i++) {
	if(!ans.isEmpty() && s.charAt(i) == ans.get(0)) {
		return ans.get(0);
	}
	}

	return '_';
	}
}
