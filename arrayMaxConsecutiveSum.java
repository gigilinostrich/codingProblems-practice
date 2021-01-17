
public class arrayMaxConsecutiveSum {

	public static void main(String[] args) {
		// find the possible max some from its k consecutive elements
		int [] a = {2,3,5,1,6};
		int k = 3; // 2+3+5, 3+5+1, 5+1+6
		int initialSum = 0; // current sum within k
	
		for (int i = 0; i < k ; i++) {
			initialSum += a[i];
		}
		int max = initialSum; // use it to compare with modified sum
		// we already know the sum in the beginning, so don't do i = 0
		// don't go all the way down to the end of length, avoid array out of bound exception
		for (int i = 1; i <= a.length - k; i++) {
			// take out previous value and update new value that moves in to
			initialSum = initialSum - a[i - 1] + a[i + k -1];
			max = Math.max(max, initialSum);
		}
		// return max;
 	}

}
