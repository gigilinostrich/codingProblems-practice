import java.util.HashSet;

public class matchSocks {

	public static void main(String[] args) {
		int [] arr = {10, 20, 20, 10, 10, 30, 50, 10, 20};
		int socksCount = 0;
	HashSet <Integer> hs = new HashSet<Integer>();
	for(int i =0; i < arr.length; i++) {
		int element = arr[i];
		if(hs.contains(element)) { // if the element have duplicate, remove one, increase count
			hs.remove(element);
			socksCount++;
		}
		else {
			hs.add(element); // if element haven't match, keep adding
		}
	}
		System.out.println(" matching pairs " + socksCount);
	}

}
