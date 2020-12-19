
public class divisibleSumPairs {

	public static void main(String[] args) {
		// print the number (i,j) pairs where i < j and 
		// a[i] + a[j] is evenly divisible by k
		int [] ar = {1,3,2,6,1,2};
		int k = 3;
		int sum = 0;
		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				if ( i < j) {
					sum = ar[i] + ar[j];
					if(sum % k == 0) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}

}
