
public class sherlockAndArray {

	public static void main(String[] args) {
		/*
		 * Watson gives Sherlock an array of integers. His challenge is to find an
		 * element of the array such that the sum of all elements to the left is equal
		 * to the sum of all elements to the right.
		 * 
		 * ex. arr = {1,2,3} NO. no such index exists
		 * 
		 * ex. arr = {1,2,3,3} YES arr[0] + arr[1] = arr[3] 1 + 2 = 3
		 * 
		 */
		// use math logic
		// split array into 3 parts: left is x (0 to n/2 - 1), y is the mid, x is right
		// (n/2 + 1 to n)
		// simplify the math equation: x + y + x = sumAll
		// 2x + y = sumAll
		// 2x = sumAll - y
		// y is the pointer that moves in each iteration but x is the accumlation of
		// previous y values
		// if the lhs is equal to rhs, return YES. Else return NO

		int[] arr = { 1, 2, 3 };

		// find the overall sum in the array
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		int x = 0;

		for (int y = 0; y < arr.length; y++) {
			if (2 * x == sum - arr[y]) { // lhs = rhs of equation
				System.out.println("YES");
			} else { // accumulating x with previous y values
				x += arr[y];
			}
		}
		// default, return NO
	}

}
