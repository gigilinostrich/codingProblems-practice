import java.math.BigInteger;
import java.util.*;

public class ModifiedKaprekarNumbers {

	public static void main(String[] args) {
		/*
		 * Consider a positive whole number n with d digits We square n to arrive at a
		 * number that is either 2 * d digits long or (2 * d ) - 1 digits long. Split
		 * the string representation of the square into two parts, l and r. The right
		 * hand part must be d digits long. The left is the remaining substring. Convert
		 * those two substrings back to integers, add them and see if you get n
		 * 
		 * Example: n = 5, d = 1 First calcuate that n ^ 2 = 25. Split that into two
		 * strings and convert them back to integers 2 and 5. Test 2 + 5 = 7 != 5. Not
		 * mortifiedKaprekar num Example: n = 9, d = 1, n ^ 2 = 81, 8 + 1 = 9. Yes
		 */
		int p = 1; // lower bound
		int q = 99999; // higher bound
		List<Integer> store = new LinkedList<Integer>();// list to store modified Kaprekar numbers
		for (int i = p; i <= q; i++) {
			// if n square has only one digit, don't do left substrings cuz exceptions will occur
			int right = getRightSub(i);
			if (i == 1) {// base case: 1 is always 1
				store.add(i);
			}
			if (i > 3) { // works when there are two digits
				int left = getLeftSubRemain(i);
				int sum = right + left;
				if (sum == i) {
					store.add(i);
				}
			}
		}
		
		if (store.isEmpty()) { // if empty, it means there aren't any modified Kaprekar numbers
			System.out.println("INVALID RANGE");
		} else { // if exists, iterate the list and print it out
			for (int i : store) {
				System.out.print(i + " ");
			}
		}

	}

	public static int digitCount(long num) {
		String numStr = Long.toString(num);
		int count = 0;
		for (int i = 0; i < numStr.length(); i++) {
			count++;
		}

		return count;
	}

	public static String numSquare(long num) {
		String longNumStr = Long.toString(num);
		BigInteger numSquare = new BigInteger(longNumStr);
		BigInteger result = numSquare.multiply(numSquare);
		return result.toString();
	}

	public static int getRightSub(long num) {
		String numSquareLocal = numSquare(num);
		int digitCountStore = digitCount(num); // count original n, not n square
		String right = numSquareLocal.substring(numSquareLocal.length() - digitCountStore, numSquareLocal.length());
		return Integer.parseInt(right);
	}

	public static int getLeftSubRemain(long num) {

		String numSquareLocal = numSquare(num);
		int digitCountStore = digitCount(num); // count original n, not n square
		String left = numSquareLocal.substring(0, numSquareLocal.length() - digitCountStore);
		return Integer.parseInt(left);
	}

}
