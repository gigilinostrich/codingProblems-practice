import java.util.*;

public class birthdayCakeCandles {

	public static void main(String[] args) {
	//You are in charge of the cake for a child's birthday. You have decided the cake 
	//will have one candle for each year of their total age. They will only be able to blow
	// out the tallest of the candles. Count how many candles are tallest.
	// int: the number of candles that are tallest
	    
		List<Integer> candles = new LinkedList<Integer>();
	//	3 2 1 3    output: 2
		candles.add(3);
		candles.add(2);
		candles.add(1);
		candles.add(3);
		
		System.out.println(candles);
		HashMap <Integer,Integer> getCountFromList = new HashMap<Integer,Integer>();
		
		for (int i : candles) {
			Integer addCount = getCountFromList.get(i);
			if(getCountFromList.containsKey(i)) {
				getCountFromList.put(i,addCount+1);
			}
			else {
				getCountFromList.put(i, 1);
			}
			
		}
		System.out.println(getCountFromList);
		int getMaxCount = 0;
		for (int i : getCountFromList.values()) {
			if (i > getMaxCount) {
				getMaxCount = i;
			}
		}
		System.out.println(getMaxCount);

	}

}
