
public class spiralNumbers {

	public static void main(String[] args) {
		
		int n = 3;
		
	}
	public static int [][] spiralNumbersF(int n){
		
		int [][] spiralSquare = new int [n][n];
		int walk = 1;
		int row0 = 0; // up and down, start boundary
		int col0 = 0; // left and right. start boundary
		int rowLength = n; // up and down, end boundary
		int colLength = n; // left and right, end boundary
		
		while (row0 < rowLength && col0 < colLength) {
			for (int i = col0; i < colLength; i++) {
				spiralSquare[row0][i] = walk;
				walk++;
			}
			row0++;
			
			for (int j = row0; j < rowLength; j++) {
				spiralSquare[j][colLength -1] = walk;
				walk++;
			}
			colLength--;
			
			for (int i = colLength - 1; i >= col0; i--) {
				spiralSquare[rowLength-1][i] = walk;
				walk++;
			}
			rowLength--;
			
			for (int j = rowLength -1; j>= row0; j--) {
				spiralSquare[j][col0] = walk;
				walk++;
			}
			col0++;
		}	
		
		return spiralSquare;
		
	}
}
