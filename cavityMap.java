
import java.util.Scanner;

public class cavityMap {

	public static void main(String[] args) {
		/*
		 * You are given a square map as a matrix of integer strings. Each cell of the
		 * map has a value denoting its depth. We will call a cell of the map a cavity
		 * if and only if this cell is not on the border of the map and each cell
		 * adjacent to it has strictly smaller depth. Two cells are adjacent if they
		 * have a common side, or edge.
		 * 
		 * Find all the cavities on the map and replace their depths with the uppercase
		 * character X.
		 *
			STDIN   Function
			-----   --------
			4       grid[] size n = 4
			1112    grid = ['1112', '1912', '1892', '1234']
			1912
			1892
			1234
		
			1112
			1X12
			18X2
			1234
		*/
		Scanner in = new Scanner (System.in);
		int n = in.nextInt();
		String [] grid = new String [n];
		// user filling in string array
		for (int i = 0; i < n; i++) {
			grid[i] = in.next();
		}
		in.close();

		char [][] grid2DArr = new char[grid.length][];
		// converting from string array to char 2d array
		for (int i = 0; i < grid.length; i++) {
		grid2DArr[i] = grid[i].toCharArray();
		}
		// make extra 2d char array to store x values in selected area
		char [][] grid2DCopy = new char [grid2DArr.length][grid2DArr[0].length];
		
		for (int i = 0; i < grid2DArr.length; i++) {
			for (int j = 0; j < grid2DArr[i].length;j++) {
				// making copies
				grid2DCopy[i][j] = grid2DArr[i][j];
			}
		}
		// find the cavity and replace the value with X
		for (int i = 1; i < grid2DArr.length - 1; i++) { // i = 1 is for a[i-1]
			for (int j = 1; j < grid2DArr.length - 1; j++) {//grid2DArr.length - 1 is for a[i+1]
				// drawing the row and columns out helps!!!			
				int key = grid2DArr[i][j];
				int up = grid2DArr[i-1][j];
				int down = grid2DArr[i+1][j];
				int left =  grid2DArr[i][j-1];
				int right =  grid2DArr[i][j+1];
				
				if (key > up && key > down && key > left && key > right) {
					grid2DCopy[i][j] = 'X';
				}
			}
		}
	
		for (int i = 0; i < grid2DCopy.length; i++) {
			for (int j = 0; j < grid2DCopy[i].length;j++) {
				System.out.print(grid2DCopy[i][j] );
		
			}
			System.out.println();
		}
		
		/* print approach
		for (int i = 0; i < grid2DArr.length; i++) { // i = 1 is for a[i-1]
			for (int j = 0; j < grid2DArr[i].length ; j ++) { //grid2DArr.length - 1 is for a[i+1]
					
				if (i == 0 || j == 0 || i == grid2DArr.length - 1 ||  j == grid2DArr[i].length - 1  ) {
					System.out.print(grid2DArr[i][j] + " ");
				}
				else {
				
					int key = grid2DArr[i][j];
					int up = grid2DArr[i-1][j];
					int down = grid2DArr[i+1][j];
					int left =  grid2DArr[i][j-1];
					int right =  grid2DArr[i][j+1];
			
					if (key > up && key > down && key > left && key > right) {
						System.out.print('X' + " ");
					}
					else {
						System.out.print(grid2DArr[i][j] + " ");	
					}
					
				}
			
			}
			System.out.println();
		}
		*/
	
	}

}
