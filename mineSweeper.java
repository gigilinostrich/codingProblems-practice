
public class mineSweeper {

	public static void main(String[] args) {
		/*
		 * In the popular Minesweeper game you have a board with some mines and those
		 * cells that don't contain a mine have a number in it that indicates the total
		 * number of mines in the neighboring cells. Starting off with some arrangement
		 * of mines we want to create a Minesweeper game setup.
		 * 
		 * matrix = [[true, false, false], [false, true, false], [false, false, false]]
		 * 
		 * minesweeper(matrix) = [[1, 2, 1], [2, 1, 1], [1, 1, 1]]
		 */
		// 0. create an int matrix for counting neighboring mines
		// 1. Iterate through each square
		// 2. count the neighbors that have a mine
		// ul, um, ur, ml , mr, (not mm), dl,dm, dr
		// 3. input value of neighboring mines
		// 4. go to next square

		boolean[][] matrix = { { true, false, false }, { false, true, false }, { false, false, false } };

		int[][] mineMatrix = new int[matrix.length][matrix[0].length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				mineMatrix[i][j] = check(matrix, i, j);
			}
		}
		// return mineMatrix;

	}

	public static int check(boolean[][] mat, int rw, int cl) {
		int mines = 0;
		// ul -1 -1
		// um -1 0
		// ur -1 +1
		// ml 0 -1
		// mr 0 +1
		// dl +1 -1
		// dm +1 0
		// dr +1 +1

		// take care of boundaries first
		int u = rw - 1 >= 0 ? rw - 1 : 0; // -1 - > 0
		int d = rw + 1 <= mat.length - 1 ? rw + 1 : mat.length - 1;
		int l = cl - 1 >= 0 ? cl - 1 : 0;
		int r = cl + 1 <= mat[0].length - 1 ? cl + 1 : mat[0].length - 1;
		// iterating neighbors
		for (int i = u; i <= d; i++) {
			for (int j = l; j <= r; j++) {
				// can't go on the same mine as square we choosen
				// not the same square, then increment
				if (mat[i][j] && !(rw == i && cl == j)) {
					mines++;
				}
			}
		}
		return mines;
	}

}
