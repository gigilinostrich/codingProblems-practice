import java.util.Collections;
import java.util.HashSet;

public class miniMaxSum {

	public static void main(String[] args) {
		//1 2 3 4 5
		//10 14
		// min: 1+2+3+4 = 10 (i=0 to i = arr.length()-1)  max: 2+3+4+5 (i = 1 to i arr.length)
		
		int [] arr = {7 ,69, 2, 221, 8974};
		long min = 0;
		long max = 0;
		long sum1=0;
		long sum2 = 0;
		long sum3 = 0;
		long sum4 = 0;
		long sum5 = 0;
		//7 69 2 221 8974
		//299 9271
		for (int i =0; i < arr.length; i++) {
			if (i!= 0) {
				sum1 += arr[i];		
			}
			if (i!= 1) {
				sum2 += arr[i];
			}
			if (i!= 2) {
				sum3 += arr[i];
			}
			if (i!= 3) {
				sum4 += arr[i];
			}
			if (i!= 4) {
				sum5 += arr[i];
			}
		}
		
		HashSet <Long> sumsStorage = new HashSet<Long>();
		
		sumsStorage.add(sum1);
		sumsStorage.add(sum2);
		sumsStorage.add(sum3);
		sumsStorage.add(sum4);
		sumsStorage.add(sum5);
		
		System.out.println(Collections.min(sumsStorage)+ " " + Collections.max(sumsStorage));
		
	}

}
