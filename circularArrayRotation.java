
public class circularArrayRotation {
// a = [1,2,3]
// k = 2
// final state a = [2,3,1]

	public static void main(String[] args) {
		int [] a = {1,2,3}; 
		int k = 2; // how many times it got rotated
		int [] aCopy = new int [a.length]; // rotated array
		int [] queries = {0,1,2};
		
		//1) First, (i+k) ensures that each array value is 'moved' k positions to the right.
		//Obviously, this means that towards the end of the array, values will exceed the array size,
		//i+k > n-1, which we cannot allow to happen.
		//2) Then, by using %n ('mod n'), we ensure that whenever (i+k) exceeds the max array
		//position (n-1), we loop back to position a[0] and continue from there. Essentially this 
		//works in the same was as a clock 'starts over' when the hands of the clock reach 12.
		for (int i = 0; i < a.length; i++) {
			// % to prevent out of bounds exception
			int newIndex = (i + k) % a.length;
			aCopy[newIndex] = a[i]; // copying into a new array with new positions
		}
		int [] result = new int [queries.length];
		for (int i = 0; i < queries.length; i++) {
			// aCopy[queries[i]]
			// queries[0] = 0, aCopy[0] = 2
			// queries[1] = 1, aCopy[1] = 3
			// queries[2] = 2, aCopy[2] = 1
			result [i] = aCopy[queries[i]];
		}
	
	}

}
