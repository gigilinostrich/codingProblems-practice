import java.util.*;
public class iceCreamParlor {

	public static void main(String[] args) {
		/*
		 * Sunny and Johnny like to pool their money and go to the ice cream parlor.
		 * Johnny never buys the same flavor that Sunny does. The only other rule they
		 * have is that they spend all of their money.
		 * 
		 * Given a list of prices for the flavors of ice cream, select the two that will
		 * cost all of the money they have.
		 * 
		 * For example, they have m = 6 to spend and there are flavors costing cost = {1,3,4,5,6}. The two
		 * flavors costing 1 and 5 meet the criteria. Using 1-based indexing, they are at
		 * indices 1 and 4 .
		 */
			int [] arr = {1,3,4,5,6};
			int m = 6;
			int maxCost = 0;
			// note: I changed from int array to list
			List <Integer> indexStore = new ArrayList<Integer>(); // can only buy two ice cream
			for (int i = 0; i < arr.length; i++) {
				for (int j = i+1; j < arr.length; j++) {
					maxCost = arr[i] + arr[j];
					if (maxCost == m) {
						 indexStore.add(i + 1) ;
						indexStore.add(j + 1);
					}
				}
			}
			System.out.println(indexStore);
		
	}

}
