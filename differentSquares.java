import java.util.*;
public class differentSquares {
	/*
	 * Given a rectangular matrix containing only digits, calculate the number of
	 * different 2 × 2 squares in it.
	 * 
	 * Example
	 * 
	 * For
	 * 
	 * matrix = [[1, 2, 1], [2, 2, 2], [2, 2, 2], [1, 2, 3], [2, 2, 1]]
	 * 
	 * the output should be differentSquares(matrix) = 6.
	 * 
	 * Here are all 6 different 2 × 2 squares:
	 * 
	 * 1 2 2 2   2 1 2 2    2 2 2 2    2 2 1 2    2 2 2 3    2 3 2 1
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		int [][] matrix = {{1, 2, 1}, {2, 2, 2}, {2, 2, 2}, {1, 2, 3}, {2, 2, 1}};
		
		int row = matrix.length;
		int col = matrix[0].length;
		
		HashSet <String>squareTracker = new HashSet<String>();
		for (int i = 0; i < row - 1; i++) {
			for (int j = 0; j < col - 1; j++) {
			squareTracker.add(get2x2Window(matrix,j,i));
			}
		}
	System.out.println("number of different squares " + squareTracker.size());
	} 
	// capture 2x2 window of data from matrix
	public static String get2x2Window(int[][]matrix, int j, int i) {
		
	return encode(matrix[i][j], matrix[i+1][j],matrix[i][j+1],matrix[i+1][j+1]);
	
	}
	// encode it as a string val for adding into hashset
	public static String encode(int tl, int tr, int bl, int br) {
		
		return tl+""+tr+""+bl+""+br;
	}

}
