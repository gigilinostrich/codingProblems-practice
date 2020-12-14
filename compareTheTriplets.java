import java.util.*;
public class compareTheTriplets {

	public static void main(String[] args) {
		//a [17 28 30]
		//b [ 99 16 8]
		// return [2,1]
		List<Integer> a = new ArrayList<Integer>(); // alice 
		List<Integer> b = new ArrayList<Integer>(); // bob
		List<Integer> pointsStorage= new ArrayList<Integer>(); 
		a.add(17);
		a.add(28);
		a.add(30);
		
		b.add(99);
		b.add(16);
		b.add(8);
		
		System.out.println("a " + a);
		System.out.println("b " + b);
		
		// iterating one of the arrayLists, a, and compare it with the b
		// assuming both arrayLists have the same length
		int addPointsA = 0;
		int addPointsB = 0;
		for (int i = 0; i < a.size(); i++) {
			// compare each index 
			int aIndex = a.get(i);
			int bIndex = b.get(i);
			if (aIndex > bIndex) {
				System.out.println("points added to A");
				addPointsA++;
			}
			else if (bIndex > aIndex) {
				System.out.println("points added to B");
				addPointsB++;
			}
			else if (aIndex == bIndex) {
				System.out.println("no points is added");
			}
			
		}
		System.out.println("points in A " + addPointsA);
		System.out.println("points in B " + addPointsB);
		
		// return a list that is [points for a, points for b]
		pointsStorage.add(addPointsA);
		pointsStorage.add(addPointsB);
		System.out.println("points storage list for a and b" + pointsStorage);

	}

}
