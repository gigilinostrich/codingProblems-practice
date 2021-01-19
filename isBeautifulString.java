import java.util.*;

public class isBeautifulString {
	/*
	 * A string is said to be beautiful if each letter in the string appears at most
	 * as many times as the previous letter in the alphabet within the string; ie: b
	 * occurs no more times than a; c occurs no more times than b; etc. Note that
	 * letter a has no previous letter.
	 * 
	 * Given a string, check whether it is beautiful.
	 * 
	 * Example
	 * 
	 * For inputString = "bbbaacdafe", the output should be
	 * isBeautifulString(inputString) = true.
	 * 
	 * This string contains 3 as, 3 bs, 1 c, 1 d, 1 e, and 1 f (and 0 of every other
	 * letter), so since there aren't any letters that appear more frequently than
	 * the previous letter, this string qualifies as beautiful.
	 * 
	 * For inputString = "aabbb", the output should be
	 * isBeautifulString(inputString) = false.
	 * 
	 * Since there are more bs than as, this string is not beautiful.
	 * 
	 * For inputString = "bbc", the output should be isBeautifulString(inputString)
	 * = false.
	 * 
	 * Although there are more bs than cs, this string is not beautiful because
	 * there are no as, so therefore there are more bs than as.
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		String inputString = "abcdefghijklmnopqrstuvwxyzz";
		
		HashMap<Character, Integer> m = new HashMap<Character, Integer>();
		List<Integer> countArr = new ArrayList<Integer>();
		// count number of occurances and store into hashMap
		for (int i = 0; i < inputString.length(); i++) {
			if (m.containsKey(inputString.charAt(i))) {
				m.put(inputString.charAt(i), m.get(inputString.charAt(i)) + 1);
			} else {
				m.put(inputString.charAt(i), 1);
			}
		}
	// store rest of characters into map from English alphabet and its count to 0 
		for (char c = 'a'; c <= 'z'; c++) {
			if (!m.containsKey(c)) {
				m.put(c, 0);
			}
		}
		// transfer all count values to array list
		for (int i : m.values()) {
			countArr.add(i);
		}
	// compare each element (count values) 
		for (int i = 0; i < countArr.size() - 1; i++) {
			if (countArr.get(i) >= countArr.get(i + 1)) {
				continue;
			} else {
				System.out.println("return false");
				break;
			}
		}
		// return true
		
	}
}
