import java.util.*;
public class firstDuplicate {
	/*
	 * 
	 * 
	 * For a = [2, 1, 3, 5, 3, 2], the output should be firstDuplicate(a) = 3.
	 * 
	 * There are 2 duplicates: numbers 2 and 3. The second occurrence of 3 has a
	 * smaller index than the second occurrence of 2 does, so the answer is 3.
	 * 
	 * For a = [2, 2], the output should be firstDuplicate(a) = 2;
	 * 
	 * For a = [2, 4, 3, 5, 1], the output should be firstDuplicate(a) = -1.
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {

		int [] a = {2,1,3,5,3,2};
		
		HashMap <Integer,Integer> countM = new HashMap<Integer,Integer>();
		
		for (int i = 0; i < a.length; i++) {
			if(countM.containsKey(a[i])) {
				countM.put(a[i], countM.get(a[i]) + 1);
				break; // first duplicate found, don't read it anymore
			}
			else {
				countM.put(a[i], 1);
			}
		}
		
		for(Map.Entry<Integer, Integer> e : countM.entrySet()) {
			if(e.getValue() > 1) {
				System.out.println("return " + e.getKey());
			}
			else {
				System.out.println("return -1");
			}
		}
		
		
		
		
		
	}

}
