import java.util.*;

public class climbingTheLeaderBoard {

	public static void main(String[] args) {
		int[] ranked = { 100, 90, 90, 80, 75, 60 };
		int[] player = { 50, 65, 77, 90, 102 };
		int[] result = new int[player.length];
		int[] ranks = new int[ranked.length];
		ranks[0] = 1; // the first element will always be 1
		// populating ranks array
		for (int i = 1; i < ranked.length; i++) {
			// check two boundaries.
			// if current rank is the same as the previous rank
			if (ranked[i] == ranked[i - 1]) {
				// set the current rank as previous rank
				ranks[i] = ranks[i - 1];
			} else {
				// the current rank will move down, meaning incrementing by 1
				ranks[i] = ranks[i - 1] + 1;
			}
		}
		for (int i = 0; i < player.length; i++) {
			int aliceScore = player[i];
			// alice score exceeding the first rank
			if (aliceScore > ranked[0]) {
				result[i] = 1; // set the result array element to 1
			} else if (aliceScore < ranked[ranked.length - 1]) { // if score is less than the lowest rank
				result[i] = ranks[ranks.length - 1] + 1; // lower the rank
			} else { // if the score is between the best rank and worst rank
						// find the best index in ranked array, which is in decreasing order
				int index = modifiedBinarySearch(ranked, aliceScore);
				// place index into result array
				result[i] = ranks[index];
			}
		}
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}

		// brute force approach
/*
		int[] ranked = { 100, 90, 90, 80, 75, 60 };
		int[] player = { 50, 65, 77, 90, 102 };

		List<Integer> rankedWithoutDuplicates = new ArrayList<Integer>();

		for (int i = 0; i < ranked.length; i++) {

			if (!rankedWithoutDuplicates.contains(ranked[i])) {
				rankedWithoutDuplicates.add(ranked[i]);
			}
		}

		List<Integer> rankResult = new ArrayList<Integer>();
		for (int i = 0; i < player.length; i++) {
			int ranking = 1; // resets ranking to 1 for next iteration
			for (int j = 0; j < rankedWithoutDuplicates.size(); j++) {
				if (player[i] < rankedWithoutDuplicates.get(j)) {
					ranking++;
				}
			}
			rankResult.add(ranking);
		}

		System.out.println(rankResult);
*/
	}

	public static int modifiedBinarySearch(int[] a, int key) {
		int lo = 0;
		int hi = a.length - 1;

		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;

			if (a[mid] == key) {
				return mid;
			} else if (a[mid] < key && key < a[mid - 1]) {
				return mid; // between two mid values, like median in even length
			} else if (a[mid] > key && key >= a[mid + 1]) {
				return mid + 1; // right side of the array
			} else if (a[mid] < key) { // get rid of right side
				hi = mid - 1;
			} else if (a[mid] > key) { // get rid of left side
				lo = mid + 1;
			}
		}
		return -1;
	}
}
