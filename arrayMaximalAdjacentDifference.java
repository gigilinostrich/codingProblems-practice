
public class arrayMaximalAdjacentDifference {

	public static void main(String[] args) {

		// Given an array of integers, find the maximal absolute difference between any
		// two of its adjacent elements
		// [2, 4, 1, 0] get 3
		int [] a = {2,4,1,0};
		int absDiff = 0;
		int maxResult = Integer.MIN_VALUE;
		for (int i = 0; i < a.length - 1; i++ ) {
			absDiff = Math.abs(a[i] - a[i+1]);
			if (maxResult < absDiff) {
				maxResult = absDiff;
			}
		}
		System.out.println(maxResult);

	}

}
