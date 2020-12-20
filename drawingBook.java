import java.util.*;
public class drawingBook {

	public static void main(String[] args) {
		// find and print the minimum number of pages that must be turned in order to arrive at page p
		int n = 11;
		int p = 4; // 1
		int frontTotal = n/2; // the first page is guaranteed to be on the right side of the page
		int pFront = p/2; // Each page except the last page will always be printed on both sides
		int pBack = frontTotal - pFront; // the back page is not guaranteed to start on the left side or the right side
		HashSet <Integer> countStorage = new HashSet<Integer>();
		countStorage.add(pFront);
		countStorage.add(pBack);
		System.out.println(countStorage);
		System.out.println(Collections.min(countStorage));
	
	}
}

