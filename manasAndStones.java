import java.util.*;

public class manasAndStones {

	public static void main(String[] args) {
		/*
		 * Manasa is out on a hike with friends. She finds a trail of stones with
		 * numbers on them. She starts following the trail and notices that any two
		 * consecutive stones' numbers differ by one of two values. Legend has it that
		 * there is a treasure trove at the end of the trail. If Manasa can guess the
		 * value of the last stone, the treasure will be hers.
		 * 
		 * 
		 * int[]: all possible values of the last stone, sorted ascending
		 * 
		 */
		/*
		 * Draw a tree diagram. Start with node 0 as a root. The left child is a and the right 
		 * child is b. Keep on doing this until it reaches to the max height (last branch, n - 1)
		 * Using recursion is not a good idea because it will exceed the time limit and only works
		 * with small cases.
		 * 
		 * ex.						  0
		 * 							/   \
		 * 						   10     100
		 * 						  /  \   /  \
		 *                       20  110 110 200
		 * 						..................
		 * 
		 * the best approach is to trace each branch 
		 * we got 3a,0b , 2a,1b,  2a,1b,  1a,2b, 2a,1b, 1a,2b, 0a,3b 
		 * 	avoid the duplicates, and get: 3a,0b, 2a,1b, 1a,2b, 0a,3b
		 * 
		 * add all a and b values together and store into set, then sort
		 * 						 
		 */
		int numStones = 4;
		// a and b differences
		int aDiff = 10;
		int bDiff = 100;

		HashSet<Integer> possibleLastValues = new HashSet<Integer>();

		int total = 0;
		for (int i = 0; i < numStones; i++) {

			total = (i * bDiff) + (aDiff * (numStones - i - 1));
			possibleLastValues.add(total);

		}
		// converting from hashset to list, in order to sort
		List<Integer> possibleLastValuesCopy = new ArrayList<Integer>(possibleLastValues);

		Collections.sort(possibleLastValuesCopy);
		// copy all values into integer array, to return
		int[] finalCopy = new int[possibleLastValuesCopy.size()];
		for (int i = 0; i < possibleLastValuesCopy.size(); i++) {
			finalCopy[i] = possibleLastValuesCopy.get(i);
		}
		for (int i = 0; i < finalCopy.length; i++) {
			System.out.println(finalCopy[i]);
		}

	}
}
