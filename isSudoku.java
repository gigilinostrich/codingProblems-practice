
package isSudoku;

import java.util.*;

public class isSudoku {
	/*
	 * Sudoku is a number-placement puzzle. The objective is to fill a 9 × 9 grid
	 * with digits so that each column, each row, and each of the nine 3 × 3
	 * sub-grids that compose the grid contains all of the digits from 1 to 9.
	 * 
	 * This algorithm should check if the given grid of numbers represents a correct
	 * solution to Sudoku.
	 * 
	 * Example
	 * 
	 * For
	 * 
	 * grid = [[1, 3, 2, 5, 4, 6, 9, 8, 7], [4, 6, 5, 8, 7, 9, 3, 2, 1], [7, 9, 8,
	 * 2, 1, 3, 6, 5, 4], [9, 2, 1, 4, 3, 5, 8, 7, 6], [3, 5, 4, 7, 6, 8, 2, 1, 9],
	 * [6, 8, 7, 1, 9, 2, 5, 4, 3], [5, 7, 6, 9, 8, 1, 4, 3, 2], [2, 4, 3, 6, 5, 7,
	 * 1, 9, 8], [8, 1, 9, 3, 2, 4, 7, 6, 5]]
	 * 
	 * the output should be sudoku(grid) = true;
	 * 
	 * For
	 * 
	 * grid = [[1, 3, 2, 5, 4, 6, 9, 2, 7], [4, 6, 5, 8, 7, 9, 3, 8, 1], [7, 9, 8,
	 * 2, 1, 3, 6, 5, 4], [9, 2, 1, 4, 3, 5, 8, 7, 6], [3, 5, 4, 7, 6, 8, 2, 1, 9],
	 * [6, 8, 7, 1, 9, 2, 5, 4, 3], [5, 7, 6, 9, 8, 1, 4, 3, 2], [2, 4, 3, 6, 5, 7,
	 * 1, 9, 8], [8, 1, 9, 3, 2, 4, 7, 6, 5]]
	 * 
	 * the output should be sudoku(grid) = false.
	 * 
	 * The output should be false: each of the nine 3 × 3 sub-grids should contain
	 * all of the digits from 1 to 9. These examples are represented on the image
	 * below.
	 * 
	 * Guaranteed constraints: grid.length = 9, grid[i].length = 9, 1 ≤ grid[i][j] ≤
	 * 9
	 * 
	 */
	public static void main(String[] args) {
		 int[][] grid = { { 1, 3, 2, 5, 4, 6, 9, 2, 7 }, { 4, 6, 5, 8, 7, 9, 3, 8, 1
		 }, { 7, 9, 8, 2, 1, 3, 6, 5, 4 },
		 { 9, 2, 1, 4, 3, 5, 8, 7, 6 }, { 3, 5, 4, 7, 6, 8, 2, 1, 9 }, { 6, 8, 7, 1,
		 9, 2, 5, 4, 3 },
		 { 5, 7, 6, 9, 8, 1, 4, 3, 2 }, { 2, 4, 3, 6, 5, 7, 1, 9, 8 }, { 8, 1, 9, 3,
		 2, 4, 7, 6, 5 } }; // false

		int row = grid.length;
		int col = grid[0].length;
		int metSum = 0;
		HashSet<Integer> oneToNine = new HashSet<Integer>();
		for (int i = 1; i <= 9; i++) {
			oneToNine.add(i);
			metSum += i;
		}
// calculate the sum for 9 sub squares
		int sum1 = grid[0][0] + grid[0][1] + grid[0][2] + grid[1][0] + grid[1][1] + grid[1][2] + grid[2][0] + grid[2][1]
				+ grid[2][2];
		int sum2 = grid[0][3] + grid[0][4] + grid[0][5] + grid[1][3] + grid[1][4] + grid[1][5] + grid[2][3] + grid[2][4]
				+ grid[2][5];
		int sum3 = grid[0][6] + grid[0][7] + grid[0][8] + grid[1][6] + grid[1][7] + grid[1][8] + grid[2][6] + grid[2][7]
				+ grid[2][8];

		int sum4 = grid[3][0] + grid[3][1] + grid[3][2] + grid[4][0] + grid[4][1] + grid[4][2] + grid[5][0] + grid[5][1]
				+ grid[5][2];
		int sum5 = grid[3][3] + grid[3][4] + grid[3][5] + grid[4][3] + grid[4][4] + grid[4][5] + grid[5][3] + grid[5][4]
				+ grid[5][5];
		int sum6 = grid[3][6] + grid[3][7] + grid[3][8] + grid[4][6] + grid[4][7] + grid[4][8] + grid[5][6] + grid[5][7]
				+ grid[5][8];

		int sum7 = grid[6][0] + grid[6][1] + grid[6][2] + grid[7][0] + grid[7][1] + grid[7][2] + grid[8][0] + grid[8][1]
				+ grid[8][2];
		int sum8 = grid[6][3] + grid[6][4] + grid[6][5] + grid[7][3] + grid[7][4] + grid[7][5] + grid[8][3] + grid[8][4]
				+ grid[8][5];
		int sum9 = grid[6][6] + grid[6][7] + grid[6][8] + grid[7][6] + grid[7][7] + grid[7][8] + grid[8][6] + grid[8][7]
				+ grid[8][8];

		for (int i = 0; i < row; i++) {
			// reset hashSets for every row iteration
			HashSet<Integer> iterationRow = new HashSet<Integer>();
			HashSet<Integer> iterationCol = new HashSet<Integer>();
			for (int j = 0; j < col; j++) {
				iterationRow.add(grid[i][j]); // check rows
				iterationCol.add(grid[j][i]); // check columns)
			}
			// check if row list and col list contain all numbers from 1 to 9, so does the 9 sub squares
			if (oneToNine.equals(iterationRow) && oneToNine.equals(iterationCol)
					&& subSquareSum(metSum, sum1, sum2, sum3, sum4, sum5, sum6, sum7, sum8, sum9)) {
				System.out.println("every condition is met");
				continue; // skip for now
			}
			else {
				System.out.println("return false");
			}
		}
		// if no failing conditions are met 
		// return true  
	}

	public static boolean subSquareSum(int mainSum, int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8,
			int s9) {
		return (s1 == mainSum && s2 == mainSum && s3 == mainSum && s4 == mainSum && s5 == mainSum && s6 == mainSum
				&& s7 == mainSum && s8 == mainSum && s9 == mainSum);
	}

}
