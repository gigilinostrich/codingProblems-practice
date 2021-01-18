import java.util.*;

public class knapSackLight {
	/*
	 * You found two items in a treasure chest! The first item weighs weight1 and is
	 * worth value1, and the second item weighs weight2 and is worth value2. What is
	 * the total maximum value of the items you can take with you, assuming that
	 * your max weight capacity is maxW and you can't come back for the items later?
	 * 
	 * Note that there are only two items and you can't bring more than one item of
	 * each type, i.e. you can't take two first items or two second items.
	 * 
	 * Example
	 * 
	 * For value1 = 10, weight1 = 5, value2 = 6, weight2 = 4, and maxW = 8, the
	 * output should be knapsackLight(value1, weight1, value2, weight2, maxW) = 10.
	 * 
	 * You can only carry the first item.
	 * 
	 * For value1 = 10, weight1 = 5, value2 = 6, weight2 = 4, and maxW = 9, the
	 * output should be knapsackLight(value1, weight1, value2, weight2, maxW) = 16.
	 * 
	 * You're strong enough to take both of the items with you.
	 * 
	 * For value1 = 5, weight1 = 3, value2 = 7, weight2 = 4, and maxW = 6, the
	 * output should be knapsackLight(value1, weight1, value2, weight2, maxW) = 7.
	 * 
	 * You can't take both items, but you can take any of them.
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		int value1 = 15;
		int weight1 = 2;
		int value2 = 20;
		int weight2 = 3;
		int maxW = 2;

		System.out.println(knapsackLight(value1, weight1, value2, weight2, maxW));

	}

	public static int knapsackLight(int value1, int weight1, int value2, int weight2, int maxW) {
		int weightCarry = 0;
		int canGetTotalValue = 0;

		if ((maxW < weight1 && maxW < weight2) || (maxW < weight2 && maxW < weight1)) {
			canGetTotalValue = 0;
			return canGetTotalValue;
		} else if (maxW == weight1 && maxW < weight2) {
			canGetTotalValue = value1;
			return canGetTotalValue;
		} else if (maxW == weight2 && maxW < weight1) {
			canGetTotalValue = value2;
			return canGetTotalValue;
		} else {
			canGetTotalValue += Math.max(value1, value2);
			weightCarry += weight1;
			weightCarry += weight2;
			if (weightCarry <= maxW) {

				canGetTotalValue += Math.min(value2, value1);
			}
			return canGetTotalValue;
		}

	}
}
