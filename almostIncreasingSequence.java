
public class almostIncreasingSequence {

	public static void main(String[] args) {
		int[] a = { 1, 2, 1, 2 }; // return false, deletes 1 and 2

		int count1 = 0, count2 = 0;
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] >= a[i + 1]) // checks for duplicates and if the next element is smaller than previous 
				count1++;
		}

		for (int i = 0; i < a.length - 2; i++) { // also checks the last element 
			if (a[i] >= a[i + 2])
				count2++;
		}
		if (count1 <= 1 && count2 <= 1) {
			System.out.println("return true");
		} else {
			System.out.println("return false");
		}
	}

}
