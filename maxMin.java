import java.util.*;

public class maxMin {

	public static void main(String[] args) {
		int[] arr = { 10, 100, 300, 200, 1000, 20, 30 };
		int k = 3;
		Arrays.sort(arr); // perfect for finding the min possible k combos like 10 100 300, 10 20 30, etc
		int min = Integer.MAX_VALUE;
		// element at i is the start
		// element at i + k is the element after moving k to the right. If we include
		// this element, then our subarray is now length k + 1. so subtract 1 from k so
		// that the subarray is only size k.

		for (int i = 0; i < arr.length - k + 1; i++) { // i+k-1 to prevent array exception
			min = Math.min(min, arr[i + k - 1] - arr[i]); // max - min
			
			
		}
		System.out.println(min);
		/*
		 * 10 30 ,   arr[i], arr[i+k-1]
		 * 20 100,
		 * 30 200,
		 * 100 300,
		 * 200 1000, 
		 * 20
		 * 
		 * 
		 */
	}
}
