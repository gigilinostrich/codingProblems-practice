import java.util.*;

public class sortingDay20 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		/*
		 * original a: 4 3 1 2 round 1 a: 3 1 2 4 swaps this round: 3 round 2 a: 1 2 3 4
		 * swaps this round: 2 round 3 a: 1 2 3 4 swaps this round: 0
		 */
		/*
		 * 3 3 2 1 Array is sorted in 3 swaps. First Element: 1 Last Element: 3
		 */
		// Write Your Code Here
		System.out.println("original a: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		int totalSwap = 0;
		for (int i = 0; i < n; i++) {
			// Track number of elements swapped during a single array traversal
			int numberOfSwaps = 0;

			for (int j = 0; j < n - 1; j++) {
				// Swap adjacent elements if they are in decreasing order
				if (a[j] > a[j + 1]) {

					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;

					numberOfSwaps++;
					totalSwap++;
				}

				// If no elements were swapped during a traversal, array is sorted
				if (numberOfSwaps == 0) {
					break;
				}
			}
			System.out.println("Array is sorted in " + totalSwap + " swaps.");
			System.out.println("First Element: " + a[0]);
			System.out.println("Last Element: " + a[n - 1]);

		}

	}
}
