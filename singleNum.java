import java.util.*;

public class singleNum {

	public static void main(String[] args) {
		int[] nums = { 1, 1, 2 };
		// key: array element value: element counts
		HashMap<Integer, Integer> elementCountMap = new HashMap<Integer, Integer>();

		for (int i : nums) { // iterating through the num array
			System.out.println("i " + i); // printing i means printing array elements
			Integer count = elementCountMap.get(i);
			System.out.println("count is " + count); // currently the key is null in the map
			// If element is present in elementCountMap, incrementing its count by 1
			// if one specific array element is in the map, it means there are duplicates.
			// Increase count (value)
			if (elementCountMap.containsKey(i)) {
				elementCountMap.put(i, count + 1);
			} else { // if one specific key (element in array ) does not exist, add 1 as initial
						// count
						// If element is not present in elementCountMap,
						// adding this element to elementCountMap with 1 as it's value
				elementCountMap.put(i, 1); // start with (key: any elements in array | Value: 1) in map
			}

		}
		System.out.println("inside the elementCountMap " + elementCountMap);
		for (int i : elementCountMap.values()) {
			if (elementCountMap.get(i) == 1) {
				System.out.println(i);
			}
		}

	}
}
