import java.util.Collections;
import java.util.HashSet;

public class hourGlassSum2dArraysDay11 {

	public static void main(String[] args) {
	// goal: given 6x6 matrix, find the max hourglass sum 
	/*	a b c               arr[i][j] (current) = a 
	 *    d                 arr[i][j+1] =  b
 	 *  e f g               arr[i][j+2] =  c
 	 *                      arr[i+1][j+1] = d
 	 *                      arr[i+2][j] = e
 	 *                      arr[i+2][j+1] = f
 	 *                      arr[i+2][j+2] = g
	 */
	/*	1 1 1 0 0 0
		0 1 0 0 0 0
		1 1 1 0 0 0      max hour glass sum is 19
		0 0 2 4 4 0
		0 0 0 2 0 0
		0 0 1 2 4 0       
	*/	
		int [][] arr = {{1,1,1,0,0,0},
						{0,1,0,0,0,0},
						{1,1,1,0,0,0},
						{0,0,2,4,4,0},
						{0,0,0,2,0,0},
						{0,0,1,2,4,0}
						};
		int row = arr.length; //6 for i index (vertically)
		int col = arr[0].length; // 6 for j index (horizontally)
		
		// iterate the 2d array normally by using nested for loop
		// the +2 is used to compare adjacent elements. The -2 will prevent array out of bound exception
		
		// hash set to store the hour glass sums
		HashSet <Integer> hourglassSumStorage = new HashSet<Integer>();
		for (int i = 0; i < row - 2; i++) {
			for (int j = 0; j < col - 2; j++) {
				int currentHourGlassSum = arr[i][j] + arr[i][j+1] + arr[i][j+2]
										  + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
				hourglassSumStorage.add(currentHourGlassSum);
			}
		}
		// now the hour glass sums are store in the hash set. Get the max from it
		System.out.println(hourglassSumStorage);
		System.out.println(Collections.max(hourglassSumStorage));
	}

}
