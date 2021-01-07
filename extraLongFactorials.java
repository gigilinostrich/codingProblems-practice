import java.math.BigInteger;

public class extraLongFactorials {

	public static void main(String[] args) {

		// if n > 20, use BigInteger class
		int n = 30;
		if (n > 20) {

			BigInteger factorialResult = new BigInteger("1");
			for (int i = 1; i <= n; i++) {
				factorialResult = factorialResult.multiply(BigInteger.valueOf(i));
			}
			System.out.println(factorialResult);
		} else {
			long factorialResult = 1;
			for (int i = 1; i <= n; i++) {
				factorialResult = factorialResult * i;
			}
			System.out.println(factorialResult);
		}
	}

}
