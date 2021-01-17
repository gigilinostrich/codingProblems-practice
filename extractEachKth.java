import java.util.*;

public class extractEachKth {

	public static void main(String[] args) {
		/*
		 * Given array of integers, remove each kth element from it.
		 * 
		 * Example
		 * 
		 * For inputArray = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] and k = 3, the output should
		 * be extractEachKth(inputArray, k) = [1, 2, 4, 5, 7, 8, 10].
		 */

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		List<Integer> result = new ArrayList<Integer>();

		int k = 3;
		for (int i = 1; i <= arr.length; i++) {

			if (i % k == 0) {
				continue;
			} else {
				result.add(arr[i - 1]);
			}
		}
		int[] resultArr = new int[result.size()];
		for (int i = 0; i < result.size(); i++) {
			resultArr[i] = result.get(i);
		}
		// return resultArr;
	}

}
