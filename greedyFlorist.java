import java.util.*;

public class greedyFlorist {

	public static void main(String[] args) {
		int[] c = { 1, 3, 5, 7, 9 };
		int k = 3; // 29

		Arrays.sort(c); // sort just in case it is not sorted, then loop in reverse
		int[] tempArr = new int[c.length]; // count array, fill with 0s

		int sum = 0;
		int count = 0;

		for (int i = c.length - 1; i >= 0; i--) {
			sum += (tempArr[count] + 1) * c[i];
			tempArr[count]++; // increase count in count array
			count = (count + 1) % k; // cycles of counting back to 0. 1,2,0,1,2...
			System.out.println("Count " + count);
		}
		System.out.println(sum);
	}

}
