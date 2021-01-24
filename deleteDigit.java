import java.util.*;
import java.util.regex.*;
public class deleteDigit {
	/*
	 * Given some integer, find the maximal number you can obtain by deleting
	 * exactly one digit of the given number.
	 * 
	 * Example
	 * 
	 * For n = 152, the output should be deleteDigit(n) = 52; For n = 1001, the
	 * output should be deleteDigit(n) = 101
	 * 
	 * 
	 */
	public static void main(String[] args) {
		int n = 1001; // 101
		
		String s = Integer.toString(n);
		List <String>compareDigits = new ArrayList<String>();
		
		for (int i = 0; i < s.length(); i++) {
			String b = s;
			// don't use replace, replaceAll because it will replace every number instead of only one number
			b = b.replaceFirst(String.valueOf(s.charAt(i)),"");
			compareDigits.add(b);
		}
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < compareDigits.size(); i++) {
			max = Math.max(max, Integer.parseInt(compareDigits.get(i)));
		}
		System.out.println(max);
	}

}
