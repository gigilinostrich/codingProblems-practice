import java.util.*;

public class cutTheSticks {

	public static void main(String[] args) {
// input: 1 2 3 4 3 3 2 1
// output: 8 6 4 1
	/*
		sticks-length         length-of-cut   sticks-cut
		1 2 3 4 3 3 2 1         1               8
		_ 1 2 3 2 2 1 _         1               6
		_ _ 1 2 1 1 _ _         1               4
		_ _ _ 1 _ _ _ _         1               1
		_ _ _ _ _ _ _ _       DONE            DONE
		*/
		int[] arr = { 1, 2, 3, 4, 3, 3, 2, 1 };
		List<Integer> arrCopy = new ArrayList<Integer>();
		List<Integer> sticksCut = new ArrayList<Integer>(); // what to return

		// copy all arr into a list
		for (int i = 0; i < arr.length; i++) {
			arrCopy.add(arr[i]);
		}
		sticksCut.add(arrCopy.size()); // store the initial arrayCopy size into the stickCut List
		Collections.sort(arrCopy); // sort the arrCopy

		int minValue = arrCopy.get(0); // the min value is the first element of sorted arrCopy
		for (int i = 0; i < arrCopy.size(); i++) { // iterate the arrCopy list
			if (arrCopy.get(i) > minValue) { // if any elements are greater than the min value
				minValue = arrCopy.get(i); // it's like subtracting min value from each element
				// minValue 2 i 2
				// minValue 3 i 4
				// minValue 4 i 7
				sticksCut.add(arrCopy.size() - i); // it's like subtracting the minCount from the total size
			}
		}
		// array list to array converstion
		int[] result = new int[sticksCut.size()];
		for (int i = 0; i < sticksCut.size(); i++) {
			result[i] = sticksCut.get(i);
		}
		// return result
	}

}
