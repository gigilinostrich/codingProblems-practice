import java.util.*;
public class taumAndBday {

	public static void main(String[] args) {
	/*	Test case 1
	 *  b = 10, w = 10 , bc = 1, wc = 1, z = 1
	 *  output: b * bc + w * wc = 10 * 1 + 10 * 1 = 20
	 * 	Since black gifts cost the same as white, there is no 
	 * 	benefit to converting the gifts. Taum will have to buy 
	 * 	each gift for 1 unit. 
	 * ----------------------------------------------------------
	 * Test 2
	 * b = 5, w = 5 , bc = 2, wc = 3, z = 4
	 * output: b * bc + w * wc = 5 * 2 + 9 * 3 = 37
	 * Again, he cannot decrease the cost of black or white gifts
	 * by converting colors. z is too high. He will buy gifts at
	 *  their original prices
	 * ------------------------------------------------------------
	 * Test 3
	 *   b = 3, w = 6, bc = 9, wc = 1, z = 1
	 *   since bc > wc + z. he will buy b + w = 3 + 6 = 9 white gifts 
	 *   at their original gifts at their original price of 1.
	 *   b = 3 of the gifts must be black, and the cost per conversion, z = 1
	 *   Total cost is 9 * 1 + 3 * 1 = 12
	 * -------------------------------------------------------------- 
	 *  Test 4
	 *   b = 7, w = 7, bc = 4, wc = 2, z = 1
	 *  Similarly, he will buy w = 7 white gifts at their original price, wc = 2
	 *  For black gifts, he will first buy white ones and color them black. so their
	 *  cost will be reduced to wc + z = 2 + 1 = 3. So cost of buying all the gifts
	 *  will be : 7 * 3 + 7 * 2 = 35
	 *  ----------------------------------------------------------------
	 *  Test 5
	 *  b = 3, w = 3 , bc = 1, wc = 9, z = 2
	 *  He will buy black gifts at their original price, bc = 1.
	 *  For white gifts, he will first black gifts worth bc = 1 unit and 
	 *  color them to white for z = 2 units. The cost for white gifts is
	 *  reduced to wc = bc + z = 2 + 1 = 3 units.The cost of buying all gifts will
	 *  be : 3 * 1 + 3 * 3 = 3 + 9 = 12
	 * 
	 */
		Scanner input = new Scanner (System.in);
		
		int b = input.nextInt(); // number of black gifts
		int w = input.nextInt(); // number of white gifts
		int bc = input.nextInt(); // costs of black gifts
		int wc = input.nextInt(); // costs of white gifts
		int z = input.nextInt(); // costs to convert one color gift to another
		
		input.close();
		
		// use the built in min function to determine  which cases have the least value
		// make sure you convert from int to long to pass all the test cases
		long total = (b * (long)Math.min(bc, wc + z)) + (w * (long)Math.min(wc, bc + z));
		System.out.println("total is " + total);
	}

}
