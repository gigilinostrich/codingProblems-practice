import java.util.*;

public class weightedUniformString {

	public static void main(String[] args) {
		/*
		 * Given a string, s ,let U be the set of weights for all possible uniform
		 * contiguous substrings of string s. There will be n queries to answer where each
		 * query consists of a single integer. Create a return array where for each
		 * query, the value is Yes if queries[i] belongs to U. Otherwise, append No
		 */
		String s = "abccddde";
		int[] queries = { 5, 9, 7, 8, 12, 5 };

		String[] result = new String[queries.length];
		List<Integer> charWeights = new ArrayList<Integer>();
		HashSet<Integer> allWeights = new HashSet<Integer>();
		// set up weights map using arrayList instead of hashMap
		for (int i = 1; i <= 26; i++) {
			charWeights.add(i);
		}

		char currentC = s.charAt(0);
		int currentWeight = charWeights.get(currentC - 'a');
		// calculate weight and add into list for the first character
		allWeights.add(currentWeight);
		// iterate the string to calculate weights for all possible uniform contiguous
		// string
		// starting from index 1. We have already calculated the first weight
		for (int i = 1; i < s.length(); i++) {
			currentC = s.charAt(i);
			char previousC = s.charAt(i - 1);
			// store current calculated weight into the list before checking conditions
			allWeights.add(charWeights.get(currentC - 'a'));
			if (previousC == currentC) {
				// map to charWeights to get fixed weights
				currentWeight += charWeights.get(currentC - 'a');
			} else { // current letter - 'a' will map to the current data
				currentWeight = charWeights.get(currentC - 'a');
			}
			// store mortified weight into the list
			allWeights.add(currentWeight);

		}

		for (int i = 0; i < result.length; i++) {
			if (allWeights.contains(queries[i])) {
				result[i] = "YES";
			} else {
				result[i] = "NO";
			}
		}
		// return result
	}

}
