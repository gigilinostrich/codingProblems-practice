import java.util.Scanner;

public class fairRations {

	public static void main(String[] args) {
		/*
		 * You are the benevolent ruler of Rankhacker Castle, and today you're
		 * distributing bread. Your subjects are in a line, and some of them already
		 * have some loaves. Times are hard and your castle's food stocks are dwindling,
		 * so you must distribute as few loaves as possible according to the following
		 * rules:
		 * 
		 * Every time you give a loaf of bread to some person
		 * 
		 * , you must also give a loaf of bread to the person immediately in front of or
		 * behind them in the line (i.e., persons i+1 or i-1)
		 * 
		 * After all the bread is distributed, each person must have an even number
		 * of loaves.
		 * 
		 * Given the number of loaves already held by each citizen, find and print the
		 * minimum number of loaves you must distribute to satisfy the two rules above.
		 * If this is not possible, print NO.
		 */
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] B = new int [n];
		for (int i = 0; i < n; i++) {
			B[i] = input.nextInt();
		}
		input.close();
		// B = {4,5,7,8};
		// B = {4,6,8,8};
		// output 4
		int count = 0; // bread distruibuted
		int sum = 0;
		for (int i = 0; i < B.length; i++) { // calculating array sum 
			sum += B[i];
		}
		if (sum % 2 == 0) {
			for (int i = 0; i < B.length-1; i++) { // prevent array out of bound
				if (B[i] % 2 != 0) { // if element is not even
					B[i]++; // give people in front of line
					B[i+1]++; // give people behind them (IMMEDIATELY)
					count += 2; // gave away 2 breads in total
				}
			}
			System.out.println("bread gave away " + count);
		}
		else { // even requirement failed if the sum is an odd
			System.out.println(String.valueOf("NO"));
			;
		}
	}

}
