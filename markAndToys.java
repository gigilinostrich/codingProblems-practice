import java.util.Arrays;

public class markAndToys {
	/*
	 * Mark and Jane are very happy after having their first child. Their son loves
	 * toys, so Mark wants to buy some. There are a number of different toys lying
	 * in front of him, tagged with their prices. Mark has only a certain amount to
	 * spend, and he wants to maximize the number of toys he buys with this money.
	 * Given a list of toy prices and an amount to spend, determine the maximum
	 * number of gifts he can buy.
	 * 
	 * Note Each toy can be purchased only once.
	 * 
	 * 
	 */
	public static void main(String[] args) {
		int[] prices = { 1, 12, 5, 111, 200, 1000, 10 }; // 4
		Arrays.sort(prices);
		int k = 50;
		int sum = 0;
		int count = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < prices.length; i++) {

			sum += prices[i];
			max = Math.max(max, sum);

			if (max <= k) {
				count++;
			}
		}
		System.out.println(count);
	}

}
