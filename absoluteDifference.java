import java.util.*;

public class absoluteDifference {

	public static void main(String[] args) {
		//goal: find the minimum absolute difference in the array 
		/*     nested for loop O(N^2) approach 
		int [] arr = {1 ,-3, 71, 68, 17};
		HashSet <Integer> diff = new HashSet<Integer>();
		// nested loop approach: failed some cases cuz it took longer than expected
		for(int i = 0; i < arr.length; i++) {
			for (int j =0; j < arr.length; j++) {
				if (i != j ) {
					int difference = Math.abs(arr[i] - arr[j]);
					diff.add(difference);
				}
			
			}
		}
		System.out.println(diff);
		System.out.println(Collections.min(diff));
	 * 
	 */
		// better approach
		
		int [] arr = {1 ,-3 ,71, 68, 17}; // get 3 as output
		//NOTE: IF YOU ARE COMPARING ADJACENT ELEMENTS, USE ARR.LENGTH - 1!!!!!!!!
		Arrays.sort(arr);
		HashSet <Integer> diff = new HashSet<Integer>();
		for (int i = 0; i < arr.length-1; i++) {
		
			int difference = Math.abs(arr[i+1] - arr[i]);
		//	System.out.println(difference);
			diff.add(difference);
		}
		System.out.println(Collections.min(diff));
	}

}
