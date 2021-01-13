
public class boxBlur {

	public static void main(String[] args) {
		/*
		 * Last night you partied a little too hard. Now there's a black and white photo
		 * of you that's about to go viral! You can't let this ruin your reputation, so
		 * you want to apply the box blur algorithm to the photo to hide its content.
		 * 
		 * The pixels in the input image are represented as integers. The algorithm
		 * distorts the input image in the following way: Every pixel x in the output
		 * image has a value equal to the average value of the pixel values from the 3 ×
		 * 3 square that has its center at x, including x itself. All the pixels on the
		 * border of x are then removed.
		 * 
		 * Return the blurred image as an integer, with the fractions rounded down.
		 * 
		 */

		int[][] image = { { 36, 0, 18, 9 }, { 27, 54, 9, 0 }, { 81, 63, 72, 45 } };
		// [[40,30]] number of iteration is # columns
		// new row = original row - 2
		// new column = original column - 2
		int[][] result = new int[image.length - 2][image[0].length - 2];
		for (int i = 0; i < image.length - 2; i++) {
			for (int j = 0; j < image[0].length - 2; j++) {
				int average = image[i][j] + image[i][j + 1] + image[i][j + 2] + image[i + 1][j] + image[i + 1][j + 1]
						+ image[i + 1][j + 2] + image[i + 2][j] + image[i + 2][j + 1] + image[i + 2][j + 2];

				result[i][j] = average / 9;
			}
		}
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[0].length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}

	}

}
