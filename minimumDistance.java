import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class minimumDistance {

	public static void main(String[] args) {

		int[] a = { 2, 1, 3, 4, 1, 7 };
		// The distance between two array values is the number of indices between them.
		// Given a, find the minimum distance between any pair of equal elements in the
		// array.
		// If no such value exists, return -1.
		HashSet<Integer> distancePair = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if (i != j && a[i] == a[j]) {
					distancePair.add(Math.abs(j - i));

				}
			}
		}
		if (distancePair.isEmpty()) {
			System.out.println("return -1");
		} else {
			System.out.println("min distance " + Collections.min(distancePair));
		}

	}

}
