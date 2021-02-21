import java.util.*;

public class PriyankaAndToys {
	/*
	 * Priyanka works for an international toy company that ships by container. Her
	 * task is to the determine the lowest cost way to combine her orders for
	 * shipping. She has a list of item weights. The shipping company has a
	 * requirement that all items loaded in a container must weigh less than or
	 * equal to 4 units plus the weight of the minimum weight item. All items
	 * meeting that requirement will be shipped in one container.F
	 * 
	 * 
	 */
	public static void main(String[] args) {

		int[] w = { 16, 18, 10, 13, 2, 9, 17, 17, 0, 19 };// 3
		// 82 75 19 35 67 5 54 7 31 46 8
		// 16,18,10,13,2,9,17,17,0,19 3
		Arrays.sort(w);
		int cost = 1;
		int p = w[0]; // start with the min value of the array
		for (int i = 0; i < w.length; i++) {
			if (w[i] > p+4) {
				cost++;
				p=w[i]; // assign the next element for comparison. Efficient without the nested for loops
				
			}
		}
		System.out.println(cost);
	}
}
