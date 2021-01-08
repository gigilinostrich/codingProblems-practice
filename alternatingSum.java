
public class alternatingSum {

	public static void main(String[] args) {
		/*
		 * Several people are standing in a row and need to be divided into two teams.
		 * The first person goes into team 1, the second goes into team 2, the third
		 * goes into team 1 again, the fourth into team 2, and so on.
		 * 
		 * You are given an array of positive integers - the weights of the people.
		 * Return an array of two integers, where the first element is the total weight
		 * of team 1, and the second element is the total weight of team 2 after the
		 * division is complete.
		 * 
		 */
		int[] a = { 50, 60, 60, 45, 70 };
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0) { // team 1
				sum1 += a[i];
			} else {// team 2
				sum2 += a[i];
			}
		}
		System.out.println(sum1 + " " + sum2);
		int[] sumResult = { sum1, sum2 };
	}

}
