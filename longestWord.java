import java.util.regex.*;
import java.util.*;
public class longestWord {
	/*
	 * Define a word as a sequence of consecutive English letters. Find the longest
	 * word from the given string.
	 * 
	 * Example
	 * 
	 * For text = "Ready, steady, go!", the output should be longestWord(text) =
	 * "steady"
	 * 
	 */
	public static void main(String[] args) {
		
		String text = "ab-CDE-fg_hi";
		String regex = "[a-z|A-Z]+";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(text);
		int max = Integer.MIN_VALUE;
		List <String> sList = new ArrayList<String>();
		while(m.find()) {
			sList.add(m.group());
			max = Math.max(m.group().length(),max);
		}
		for (int i = 0; i < sList.size(); i++) {
			if (sList.get(i).length() == max) {
				System.out.println(sList.get(i));
			}
		}
	
	
		
		
	}

}
