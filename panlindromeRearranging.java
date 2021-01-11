import java.util.*;
public class panlindromeRearranging {

	public static void main(String[] args) {
		// approach. If the string contains more than one odd count, return false. 
		
		String inputString = "aabb";
		
		HashMap <Character,Integer> charCountinStr = new HashMap<Character,Integer>();
		
		for (int i = 0; i < inputString.length(); i++) {
			if (charCountinStr.containsKey(inputString.charAt(i))) {
				charCountinStr.put(inputString.charAt(i),charCountinStr.get(inputString.charAt(i))+1);
			}
			else {
				charCountinStr.put(inputString.charAt(i), 1);
			}	
		}
		
		int countOdd = 0;
		
		for (int i : charCountinStr.values()) {
			if (i % 2 != 0) { // if not even
			countOdd++;
			}
			
		}
		if (countOdd > 1) {
			System.out.println("return false");
		}
		else {
			System.out.println("return true");

		}

	}

}
