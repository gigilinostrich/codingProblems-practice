import java.util.*;

public class applesAndOranges {

	public static void main(String[] args) {
		// goal: determine the number of apples and oranges that land on Sam's house.
		int s = 7; // starting point of the house
		int t = 10;// ending point of the house
		int a = 4; // apple tree's location
		int b = 12; // orange tree's location

		int[] apples = { 2, 3, -4 }; // thrown apples, units distance from a
		int[] oranges = { 3, -2, -4 }; // thrown oranges, units distance from b

		List<Integer> appleDistanceStorage = new LinkedList<Integer>();
		List<Integer> orangeDistanceStorage = new LinkedList<Integer>();

		int getAppleDistance = 0;
		int getOrangeDistance = 0;
		// add both apples and oranges distance to the position of tree, they land....
		for (int i = 0; i < apples.length; i++) {
			getAppleDistance = a + apples[i];
			appleDistanceStorage.add(getAppleDistance);
		}

		for (int i = 0; i < oranges.length; i++) {
			getOrangeDistance = b + oranges[i];
			orangeDistanceStorage.add(getOrangeDistance);
		}
		int appleCount = 0;
		for (int i : appleDistanceStorage) {
			if (i >= s && i <= t) { // if apple is found by the house [s,t]
				appleCount++;
			}
		}
		System.out.println(appleCount);
		int orangeCount = 0;
		for (int i : orangeDistanceStorage) {
			if (i >= s && i <= t) { // if orange is found by the house [s,t]
				orangeCount++;
			}
		}
		System.out.println(orangeCount);
	}

}
