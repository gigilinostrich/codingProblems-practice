import java.util.*;

public class serviceLane {

	public static void main(String[] args) {
		int[] width = { 2, 3, 1, 2, 3, 2, 3, 3 };
		int[][] cases = { { 0, 3 }, { 4, 6 }, { 6, 7 }, { 3, 5 }, { 0, 7 } };
		// copy 2D array into nested lists, it's easier
		List<List<Integer>> casesCopyList = new ArrayList<List<Integer>>();
		for (int[] ints : cases) {
			List<Integer> casesCopyInt = new ArrayList<Integer>();
			for (int i : ints) {
				casesCopyInt.add(i);
			}
			casesCopyList.add(casesCopyInt);
		}
		// now iterate nested list (2dArray) to get the min value in each range
		List<Integer> minValueList = new ArrayList<Integer>();

		for (List<Integer> i : casesCopyList) {
			int start = i.get(0); // start index needs to be RESET for each new sub list
			int finish = i.get(1); // finish index needs to be RESET for each new sub list
			int minValue = Integer.MAX_VALUE; // min value needs to be RESET for each new sub list!!!!!
			for (int j = start; j <= finish; j++) { // in case for index that is the size. for example, n=2, index = 2
				if (minValue > width[j]) {
					minValue = width[j];
				}

			}
			minValueList.add(minValue);
		}
		System.out.println("min value list " + minValueList);
	}

}
