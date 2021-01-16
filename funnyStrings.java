import java.util.*;
public class funnyStrings {

	public static void main(String[] args) {
		/*
		 * In this challenge, you will determine whether a string is funny or not. To
		 * determine whether a string is funny, create a copy of the string in reverse
		 * e.g. abc -> cba
		 * 
		 * . Iterating through each string, compare the absolute difference in the ascii
		 * values of the characters at positions 0 and 1, 1 and 2 and so on to the end.
		 * If the list of absolute differences is the same for both strings, they are
		 * funny.
		 * 
		 * Determine whether a give string is funny. If it is, return Funny, otherwise
		 * return Not Funny.
		 * 
		 */
		String s = "acxz";
		List <Integer> sAsciiValues = new ArrayList <Integer>();
		List <Integer> sReversedAsciiValues = new ArrayList <Integer>();
		
		for (int i = 0; i < s.length(); i++) {
			sAsciiValues.add((int)s.charAt(i));
		}
		for (int i = s.length()-1; i >= 0; i--)
		{
			sReversedAsciiValues.add((int)s.charAt(i));
		}
		List <Integer>absDiffS = new ArrayList <Integer>();
	for (int i = 0; i < sAsciiValues.size() - 1; i++) {
		absDiffS.add(Math.abs( sAsciiValues.get(i) -  sAsciiValues.get(i+1)));
	}
	List <Integer>absDiffSR = new ArrayList <Integer>();
	for (int i = 0; i < sReversedAsciiValues.size()-1; i++) {
		absDiffSR.add(Math.abs( sReversedAsciiValues.get(i) -  sReversedAsciiValues.get(i+1)));
	}
		if (absDiffS.equals(absDiffSR)) {
			System.out.println("Funny");
		}
		else {
			System.out.println("Not Funny");
		}

	}

}
