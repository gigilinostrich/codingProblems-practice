import java.util.Arrays;

public class arrayChange {

	public static void main(String[] args) {
		int[] a = { 1, 1, 1 }; // 3
		// 1 2 1
		// 1 2 2
		// 1 2 3

		int moves = 0; 

		for (int i = 0; i < a.length - 1; i++) {
		
			if (a[i + 1] <= a[i]) {
				a[i + 1]++;
				moves++;
				i--; // the for loop can't reach the last element of the array
				// go back to previous index and compare it with the same value again
			}
		
		}
System.out.println("total moves " + moves);
	}

}
