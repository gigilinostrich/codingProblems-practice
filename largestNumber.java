
public class largestNumber {
	/*
	 * Given an integer n, return the largest number that contains exactly n digits.
	 * 
	 * Example
	 * 
	 * For n = 2, the output should be largestNumber(n) = 99
	 * 
	 * 
	 */
	public static void main(String[] args) {
		int n = 7;
		
		String initalNum = "9";
		
		for (int i = 0; i < n - 1; i++) {
			initalNum += "9";
		}
		System.out.println(Integer.parseInt(initalNum));

	}

}
