import java.util.*;
public class absoluteValuesSumMinimization {

	public static void main(String[] args) {
		/*
		 * Given a sorted array of integers a, your task is to determine which element
		 * of a is closest to all other values of a. In other words, find the element x
		 * in a, which minimizes the following sum:
		 * 
		 * abs(a[0] - x) + abs(a[1] - x) + ... + abs(a[a.length - 1] - x)
		 * 
		 * If there are several possible answers, output the smallest one.
		 * 
		 * 
		 * For a = [2, 4, 7], the output should be absoluteValuesSumMinimization(a) = 4.
		 * 
		 * for x = 2, the value will be abs(2 - 2) + abs(4 - 2) + abs(7 - 2) = 7. for x
		 * = 4, the value will be abs(2 - 4) + abs(4 - 4) + abs(7 - 4) = 5. for x = 7,
		 * the value will be abs(2 - 7) + abs(4 - 7) + abs(7 - 7) = 8.
		 * 
		 * The lowest possible value is when x = 4, so the answer is 4.
		 * 
		 */

		int[] a = {0,7,9};  //4
		
		List <Integer> differenceMapArr = new ArrayList<Integer>();
		
		for (int i = 0; i < a.length; i++) {
			int sum = 0;
			for (int j = 0; j < a.length; j++) {
			sum += Math.abs(a[j] - a[i]);
			}
				differenceMapArr.add(sum);
		}
		// find the min differnece in list
		int minDiff = Collections.min(differenceMapArr);
		// get the index of min difference
		int minDiffIndex = differenceMapArr.indexOf(minDiff);
		// map to the original array
		System.out.println(a[minDiffIndex]);
	
	}

}
