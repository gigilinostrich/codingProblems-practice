import java.util.*;
public class migratoryBirds {

	public static void main(String[] args) {
		//return the lowest type number of the most frequently sighted bird. 
		List<Integer> arr = new ArrayList<Integer>();
		//1 4 4 4 5 3
		// print 4
		arr.add(1);
		arr.add(4);
		arr.add(4);
		arr.add(4);
		arr.add(5);
		arr.add(3);
		
	
		HashMap <Integer, Integer> m = new HashMap<Integer,Integer>();
		// store element as key and count as value
		for (int i : arr) {// if one same key exists in map, increase count 
			if(m.containsKey(i)) { 
				m.put(i, m.get(i)+1);
			}
			else { // if map is empty, set value as 1 
				m.put(i, 1);
			}
		}
		System.out.println(m);
		int min = Integer.MAX_VALUE; // convention: set min value to max int
		int max = 0;
		for (int maxIndex : m.values()) { // find max count in the map's vaues
			if (max < maxIndex) { // find the max 
				max = maxIndex; // set max 
			}
		}
		System.out.println("max count is " + max);
		
		// iterate hashMap. Find the min key 
		for (Map.Entry<Integer, Integer> e : m.entrySet()) {
			if (e.getValue() == max ) {// if the max count condition is met, look for min element
				if(min > e.getKey()) { // finding min element
					min = e.getKey();	// set min element 
				}
			}
		}	
		System.out.println("min element " + min);
		System.out.println("max count " + max);
		

	}

}
