import java.util.*;

public class closestNumber {

	public static void main(String[] args) {
		/*
		 * Sorting is useful as the first step in many different tasks. The most common
		 * task is to make finding things easier, but there are other uses as well. In
		 * this case, it will make it easier to determine which pair or pairs of
		 * elements have the smallest absolute difference between them.
		 * 
		 */

		int[] arr = { -5 ,15 ,25, 71, 63}; // 63 71
		Arrays.sort(arr);
		int minAbs = Integer.MAX_VALUE;
		int absDiff = 0;
		List <Integer> resultPairs = new ArrayList<Integer>();
		for (int i = 0; i < arr.length - 1; i++) {
		
			absDiff = Math.abs(arr[i] - arr[i+1]);
			minAbs = Math.min(minAbs, absDiff);
			
		}
		for (int i = 0; i < arr.length - 1; i++) {
		// don't use the same variable absDiff as you did from the previous for loop
			if (Math.abs(arr[i] - arr[i+1])== minAbs){
			resultPairs.add(arr[i]);
			resultPairs.add(arr[i+1]);
			}
		}
		int [] resultArr = new int [resultPairs.size()];
		for (int i = 0; i < resultPairs.size(); i++) {
			resultArr[i] = resultPairs.get(i);
		}
		// return resultArr;
	}

}
