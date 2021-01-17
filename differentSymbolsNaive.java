import java.util.*;
public class differentSymbolsNaive {

	public static void main(String[] args) {

		// Given a string, find the number of different characters in it.
		/*
		 * For s = "cabca", the output should be differentSymbolsNaive(s) = 3.
		 * 
		 * There are 3 different characters a, b and c.
		 * 
		 */
		String s = "cabca";
		HashSet <Character> countM = new HashSet <Character>();
		
		for (int i = 0; i < s.length(); i++) {
			countM.add(s.charAt(i));
		}
		System.out.println(countM.size());
		
	}

}
