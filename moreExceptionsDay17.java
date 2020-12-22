import java.util.*;

class Calculator {
	/*
	 * 
	 * void example() throws Exception{ throw new
	 * Exception("This exception will always be thrown."); }
	 */
// write a Calculator class with a single method: int power(int,int)
// the power method takes two integers n and p, as parameters and return result n^p
// if either n or p is negative, then the method must throw an exception with a message:
//n and p should be non -negative
	int n;
	int p;

	public int power(int n, int p) throws Exception {
		if (n < 0 || p < 0) {
			throw new Exception("n and p should be non-negative");
		} else {
			return (int) Math.pow(n, p);
		}
	}
}

public class moreExceptionsDay17 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {

			int n = in.nextInt();
			int p = in.nextInt();
			Calculator myCalculator = new Calculator();
			try {
				int ans = myCalculator.power(n, p);
				System.out.println(ans);
			} catch (Exception e) {
				System.out.println(e.getMessage());

			}
		}
		in.close();
	}

}
