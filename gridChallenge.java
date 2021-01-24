import java.util.*;

public class gridChallenge {

	public static void main(String[] args) {
		/*
		 * Given a square grid of characters in the range ascii[a-z], rearrange elements
		 * of each row alphabetically, ascending. Determine if the columns are also in
		 * ascending alphabetical order, top to bottom. Return YES if they are or NO if
		 * they are not.
		 *  abcde fghij klmno pqrst uvwxy
		 */
		// sort each element
		String[] grid = { "mpxz", "abcd", "wlmf" };

		// no need to populate 2D array
		List<String> sortedGridList = new ArrayList<String>();
		// sort the strings first in the array
		for (int i = 0; i < grid.length; i++) {
			sortedGridList.add(sortedStr(grid[i]));
		}
		// compare previous element's chars with current element char
		for (int i = 1; i < sortedGridList.size(); i++) { // each element
			for (int j = 0; j < sortedGridList.get(i).length(); j++) { // each element's characters
				if (sortedGridList.get(i - 1).charAt(j) > sortedGridList.get(i).charAt(j)) {
					System.out.println("return NO");
				} // else return "YES"
			}
		}

	}
	public static String sortedStr(String s) {
		char[] charArr = s.toCharArray();
		Arrays.sort(charArr);
		return new String(charArr);
	}

}
