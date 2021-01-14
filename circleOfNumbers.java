
public class circleOfNumbers {

	public static void main(String[] args) {
		/*
		 * Consider integer numbers from 0 to n - 1 written down along the circle in
		 * such a way that the distance between any two neighboring numbers is equal
		 * (note that 0 and n - 1 are neighboring, too).
		 * 
		 * Given n and firstNumber, find the number which is written in the radially
		 * opposite position to firstNumber
		 */

		int n = 10;
		int firstNumber = 2; // 7
		
		for (int i = 0; i < n; i++) {
			
			if (firstNumber == i) {
				System.out.println((i + (n/2)) % (n));
			}
	
		}
		
	}

}
