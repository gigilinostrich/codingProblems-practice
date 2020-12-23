
public class utopianTree {

	public static void main(String[] args) {
	//The Utopian Tree goes through 2 cycles of growth every year. Each spring, 
	//it doubles in height. Each summer, its height increases by 1 meter.
	//A Utopian Tree sapling with a height of 1 meter is planted at the onset of spring. 
	//	How tall will the tree be after growth n cycles?
		int n = 4;
		/* Period (index)  Height
		 * 0				1
		 * 1				2 //doubled
		 * 2				3 // add 1 meter
		 * 3				6 // doubled
		 * 4				7 // add 1
		 * 5				14 // doubled
		 */
		// input (n) : 0 1 4
		// output (height): 1 2 7
		/* Period (n)    Height  
		 *  0				1  (remain unchanged)
		 */
		/* Period (n)    Height  
		 *  0				1  (remain unchanged)
		 *  1				2  (doubled)
		 */ 	
		 /*Period (n)	  Height
		  * 0				1
		  * 1				2 (doubled)
		  * 2				3 (grows a meter)
		  * 3				6 (doubled) 
		  * 4				7 (grows a meter)
		  * 
		  */
		int height = 1;
		 for (int i = 0; i <= n; i++) {
			 if (i != 0 && i % 2 == 0) {
				height++;
				 
			 }
			 else if (i!= 0 && i % 2 == 1) {
				 height *=2;
			 }
		 }
		 System.out.println(height);
	}

}
