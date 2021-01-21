import java.util.*;
public class gameOfThrones1 {

	public static void main(String[] args) {
		/*
		 * Dothraki are planning an attack to usurp King Robert's throne. King Robert
		 * learns of this conspiracy from Raven and plans to lock the single door
		 * through which the enemy can enter his kingdom.
		 * 
		 * But, to lock the door he needs a key that is an anagram of a palindrome. He
		 * starts to go through his box of strings, checking to see if they can be
		 * rearranged into a palindrome. Given a string, determine if it can be
		 * rearranged into a palindrome. Return the string YES or NO.
		 * 
		 * aaabbbb // YES
		 * cdefghmnopqrstuvw // NO
		 * cdcdcdcdeeeef // YES
		 */
		// logic: palindromes cannot consist more than one odd count characters
		
		String s = "aabbccdd"; // YES
		HashMap <Character,Integer> charCount = new HashMap<Character,Integer>();
		
		for (int i = 0; i < s.length(); i++) {
			if (charCount.containsKey(s.charAt(i))) {
				charCount.put(s.charAt(i),charCount.get(s.charAt(i)) + 1);
			}
			else {
				charCount.put(s.charAt(i),1);
			}
		}
		System.out.println(charCount);
		int oddCount = 0;
		for (int counts : charCount.values()) {
			if (counts % 2 != 0) {
				oddCount++;
			}
		}
		if (oddCount <= 1) {
			System.out.println("return YES;");
		}
		else {
			System.out.println("return NO;");

		}
	}

}
