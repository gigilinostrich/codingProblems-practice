import java.util.Arrays;

public class twoSums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = { 3, 3 };
		int sum = 0;
		int target = 6;
		int tempI[] = new int[2];

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				sum = nums[i] + nums[j];
				System.out.println("inner i " + i + " nums[i] " + nums[i]);
				System.out.println("inner j " + j + " nums[j] " + nums[j]);
				System.out.println("sum " + sum);
				System.out.println();
				if (i != j && sum == target) {

					tempI[0] = i;
					tempI[1] = j;

					System.out.println("requirement met");
					System.out.println("i " + i + " j " + j);

				}

			}
		}
		System.out.println("outside of nested for loops");
		for (int i = 0; i < tempI.length; i++) {

			System.out.println("i " + i + " tempI[i] " + tempI[i]);

		}

	}

}
