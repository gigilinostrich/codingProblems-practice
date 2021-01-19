
public class digitDegree {
	/*
	 * Let's define digit degree of some positive integer as the number of times we
	 * need to replace this number with the sum of its digits until we get to a one
	 * digit number.
	 * 
	 * Given an integer, find its digit degree.
	 * 
	 * Example
	 * 
	 * For n = 5, the output should be digitDegree(n) = 0; For n = 100, the output
	 * should be digitDegree(n) = 1. 1 + 0 + 0 = 1. For n = 91, the output should be
	 * digitDegree(n) = 2. 9 + 1 = 10 -> 1 + 0 = 1
	 * 
	 */
	public static void main(String[] args) {
		int num = 777773; // 3

		int count = 0;
		// single digit number returns 0
		while (num >= 10) {
			count++;
			int sum = 0; // reset calcuated sum 
			while (num > 0) {
				sum += (num % 10); // add digits in sum
				num = num / 10; // reduce by one digit
			}
			num = sum; // store sum into num and iterate again
		}
		System.out.println("count " + count);

	}

}
