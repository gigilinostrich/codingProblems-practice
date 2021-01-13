
public class avoidObstacle {

	public static void main(String[] args) {
		/*
		 * You are given an array of integers representing coordinates of obstacles
		 * situated on a straight line.
		 * 
		 * Assume that you are jumping from the point with coordinate 0 to the right.
		 * You are allowed only to make jumps of the same length represented by some
		 * integer.
		 * 
		 * Find the minimal length of the jump enough to avoid all the obstacles
		 */

		int[] a = { 5, 3, 6, 7, 9 }; // 4
		int jump = 2; // 2 ≤ inputArray.length ≤ 1000,
		for (int i = 0; i < a.length; i++) {
			if (a[i] % jump == 0) { // if not avoidable, increase jump distance
				i = -1; // starting from beginning, because of i++, it should be -1 to equal to 0
				jump++;
			}
		}
		System.out.println(jump);

	}

}
