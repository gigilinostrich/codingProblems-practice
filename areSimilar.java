import java.util.*;
public class areSimilar {

	public static void main(String[] args) {
		//Two arrays are called similar if one can be obtained from another
		//by swapping at most one pair of elements in one of the arrays.
		// a = [1,2,3]    b = [1,2,3]   true
		// a = [1,2,3]    b = [2,1,3]   true  swap once
		//For a = [1, 2, 2] , b = [2, 1, 1] false 
		int [] a = {2,3,1};
		int [] b = {1,3,2};
		
		// if a and b contains different length, it's return false cuz it's impossible
		if (a.length != b.length) {
			System.out.println("return false");
		}
		
		int [] sortedA = Arrays.copyOf(a, a.length);
		int [] sortedB = Arrays.copyOf(b, b.length);
		// check if both contain the same elements
		Arrays.sort(sortedA);
		Arrays.sort(sortedB);
		if (!Arrays.equals(sortedA, sortedB)) {
			System.out.println("return false");
		}
		int count = 0;
		for (int i = 0; i < a.length; i++) { // check for 2 min swaps in original arrays
			if (a[i] != b[i]) {
				count++;
			}
		}
		if (count <= 2) {
			System.out.println("return true");
		}
		
		
		/*// exceeeded time limit
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < b.length; j++) {
				if (a[i] != b[i] && a[j] != b[j]) {
					System.out.println( b[i] + " " + b[j]);
					int temp = b[i];
					b[i] = b[j];
					b[j] = temp;
					count++;
				}	
			}
		}
		//System.out.println("count " + count);
		
		if (count <= 1 && Arrays.equals(a, b)) {
			System.out.println("return true");
		}
		else {
			System.out.println("return false");
		}
		*/
	}
	


}