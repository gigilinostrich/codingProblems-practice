import java.util.*;

public class maximumPerimeterTriangle {

	public static void main(String[] args) {
		int[] sticks = { 1, 2, 3, 4, 5, 10 }; // 3,4,5
		Arrays.sort(sticks);
		// store valid triangle sides into nested List
		List<List<Integer>> pairList = new ArrayList<List<Integer>>();

		for (int i = 0; i < sticks.length - 2; i++) {
			List<Integer> pair = new ArrayList<Integer>();
			if (validTriangle(sticks[i], sticks[i + 1], sticks[i + 2])) {
				pair.add(sticks[i]);
				pair.add(sticks[i + 1]);
				pair.add(sticks[i + 2]);
				pairList.add(pair);
			}
		}
		// get the last sublist of nested list to obtain max perimeter
		if (pairList.size() == 0) { // no valid triangle sides
			List<Integer> wrong = new ArrayList<Integer>();
			wrong.add(-1);
			pairList.add(wrong);
			System.out.println(pairList.get(pairList.size() - 1));
		} else { // with valid triangle sides
			System.out.println(pairList.get(pairList.size() - 1));
		}

	}

	public static boolean validTriangle(int a, int b, int c) {
		return (a + b > c && a + c > b && b + c > a);
	}

}
