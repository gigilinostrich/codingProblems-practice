

public class diagonalDiff {

	public static void main(String[] args) {
		/*
		11 2 4          output: 15
		4 5 6
		10 8 -12
		 	*/
		// 2d array approach
		
		int [] [] matrix = {{11,2,4},
							{4,5,6},
							{10,8,-12}
						};
		int sumPrimaryDiagonal = 0;
		int sumSecondaryDiagonal = 0;
		for (int i = 0; i < matrix.length; i ++) {
			sumPrimaryDiagonal += matrix[i][i];
			sumSecondaryDiagonal += matrix[matrix.length-i-1][i];
		}
		
		// calculate absolute value difference of sumPrimaryDiagonal - sumSecondaryDiagonal
		System.out.println(Math.abs(sumPrimaryDiagonal - sumSecondaryDiagonal));
		
		// nested List approach
		
		/*
		   public static int diagonalDifference(List<List<Integer>> arr) {
		        int leftSum = 0;
		        int rightSum = 0;

		        for (int i = 0; i < arr.size(); i++) {
		        leftSum += arr.get(i).get(i);
		        rightSum += arr.get(i).get(arr.size() - (1 + i)); // prevent array out of bound exception
		        }
		        
		        return Math.abs(leftSum - rightSum);
		    }
		   */
		
		}

	
	
}

