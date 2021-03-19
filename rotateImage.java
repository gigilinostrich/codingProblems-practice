
public class rotateImage {

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		
		int[][] rotatedF = rotatedA(a); // 90 degrees clockwise
		for (int i = 0; i < rotatedF.length; i++) {
			for (int j = 0; j < rotatedF[0].length; j++) {
			System.out.print(rotatedF[i][j] + " ");
			}
			System.out.println();
		}	
		

	}
public static int [][] rotatedA (int [][] a) {
	int[][] rotated = new int[a.length][a[0].length];
	
	for (int i = 0; i < a.length; i++) {
		int k = a.length - 1; // reset back to the normal row length
		for (int j = 0; j < a[0].length; j++) {
			rotated[i][j] = a[k][i];
			k--;
		}
	}
	return rotated;

}
}
