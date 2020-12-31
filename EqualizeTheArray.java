import java.util.*;

public class EqualizeTheArray {

	public static void main(String[] args) {

		 int [] arr = {10 ,27, 9, 10, 100, 38, 30, 32, 45, 29, 27, 29, 32, 38, 32, 38,
		 14, 38, 29, 30, 63, 29,
		 63, 91, 54, 10, 63}; // return 23 ( 27 - maxCount)

		//int[] arr = { 37, 32, 97, 35, 76, 62 }; // return 5 (6-1)

		// key: element Value: count

		HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();

		for (int i : arr) {
			if (m.containsKey(i)) {
				m.put(i, m.get(i) + 1);
			} else {
				m.put(i, 1);
			}
		}
		
		int maxCount = 0;
		for (int i : m.values()) {
			if (maxCount < i) {
				maxCount = i;
			}

		}
	
		System.out.println("remove count " + (arr.length - maxCount));

	}

}
