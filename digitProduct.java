
public class digitProduct {
	/*
	 * Given an integer product, find the smallest positive (i.e. greater than 0)
	 * integer the product of whose digits is equal to product. If there is no such
	 * integer, return -1 instead.
	 * 
	 * Example
	 * 
	 * For product = 12, the output should be digitsProduct(product) = 26; For
	 * product = 19, the output should be digitsProduct(product) = -1.
	 * 13 - > -1
	 * 243 -> 399
	 * 360 -> 589
	 * 
	 */
	public static void main(String[] args) {
		int n = 450; // 2559

		System.out.println(digitProductF(n));

	}

	public static int digitProductF(int product) {
		// two edge cases, judging by given test case
		if (product == 0) {
			return 10;
		} else if (product < 10) {
			return product; // single digit equals to itself
		}
		int smallPos = 0; // what we are looking for
		while (product > 9) { // more than 2 digits
			// find the divisible digit
			int original = product;
			for (int i = 9; i > 1; i--) {
				// execute and update product value, work with remaining digits
				if (product % i == 0) {
					int nextDigit = product / i; // append to the front, ensure the smallest pos int
					nextDigit = digitProductF(nextDigit); // break it down further
					if (nextDigit == -1) {
						return -1;
					}
					smallPos = smallPos * 10 + nextDigit; // shift the smallest to the left
					product = i; // update product
					break; // find the digit and break the loop, do it for the new value
				}
			}
			if (original == product) { // remains the same
				return -1;
			}
		}
		return smallPos * 10 + product;
	}
}
