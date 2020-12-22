
public class hurdleRace {

	public static void main(String[] args) {

		int k = 4; // the height the character can jump naturally
		int[] height = { 1, 6, 3, 5, 2 }; // the heights of each hurdle
		// return the min number of doses required
		// return 2
		// 6 (max height) - 4 = 2
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < height.length; i++) { // find the max element in the array
			if (max < height[i]) {
				max = height[i];
			}
		}
		if (k > max) {
			System.out.println("return 0. No doses needed");
		} else { // k < max
			System.out.println("return " + (max - k));
		}
	}

}
