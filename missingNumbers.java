import java.util.*;

public class missingNumbers {
	/*
	 * Given two arrays of integers, find which elements in the second array are
	 * missing from the first array.
	 * 
	 * If a number occurs multiple times in the lists, you must ensure that the
	 * frequency of that number in both lists is the same. If that is not the case,
	 * then it is also a missing number. Return the missing numbers sorted
	 * ascending. Only include a missing number once, even if it is missing multiple
	 * times. The difference between the maximum and minimum numbers in the original
	 * list is less than or equal to 100.
	 */
	public static void main(String[] args) {
		int[] brr = { 7, 2, 5, 4, 6, 3, 5, 3 };
		int[] arr = { 7, 2, 5, 3, 5, 3 };
		// 4,6
		HashMap<Integer, Integer> brrM = new HashMap<Integer, Integer>();
		// get counts from brr
		for (int i = 0; i < brr.length; i++) {
			if (brrM.containsKey(brr[i])) {
				brrM.put(brr[i], brrM.get(brr[i]) + 1);
			} else {
				brrM.put(brr[i], 1);
			}
		}
		System.out.println("before " + brrM);
		// iterate the arr, if same element occurs, decreases brr's count
		for (int i = 0; i < arr.length; i++) {
			if (brrM.containsKey(arr[i])) {
				brrM.put(arr[i], brrM.get(arr[i]) - 1);
			}
		}
		
		System.out.println("after " + brrM);
		HashSet <Integer> noDups = new HashSet<Integer>(); // get rid od duplicates
		for (Map.Entry<Integer, Integer> e : brrM.entrySet()) {
			if (e.getValue() > 0) { // leftover numbers, aka missing number 
				noDups.add(e.getKey());
			}
		}
		List<Integer> result = new ArrayList<Integer>(noDups);
		Collections.sort(result); // sort 
		int [] resultArr = new int [result.size()];
		// convert from list to array
		for (int i = 0; i < result.size(); i++) {
			resultArr[i] = result.get(i);
		}
		// return resultArr;
	}

}
