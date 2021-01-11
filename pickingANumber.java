
public class pickingANumber {

	public static void main(String[] args) {
	
		//Given an array of integers, find the longest subarray where the absolute 
		//difference between any two elements is less than or equal to 1
		
		
		
		// when is the difference gonna be 0? it's when the duplicate subtract from itself. This is the 0 condition
		// the max count is a good candidate, which is the minimum answer
		//  maximum length subarray is 7
		// number line:	3 4 5 6   , ai = 5, ai - 1 = 4 , the abs is 1 ( the 1 condition)
		// 				4, 4, 4, 5, 5, 5, 5
		int[] a = { 1, 1, 3, 3, 3, 4, 4, 4, 5, 5, 5, 5, 6, 6 }; // output 7
		// 1. get the frequency of each number where a varies between [0,100]
		// 2. find and print the maximal value of any ai + (ai + 1) or ai + (ai - 1) 
		// instead of using hashMap, let's use array instead
		int[] frequencyOfEachA = new int[101]; // each number varies from 0 to 100

		for (int i = 0; i < a.length; i++) {
			int index = a[i]; // let frequencyOfEachA's indices to be a element
			frequencyOfEachA[index]++; // increases count if the index matches
		}
		int result = 0;
		for (int i = 1; i <= 100; i++) { // prevent from array out of bound
			// check element with the previous one
			result = Math.max(result, frequencyOfEachA[i] + frequencyOfEachA[i-1]);
		}
		System.out.println(result);
	}

}
