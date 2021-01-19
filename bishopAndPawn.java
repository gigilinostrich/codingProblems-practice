import java.util.*;
public class bishopAndPawn {

	public static void main(String[] args) {
		String bishop = "a1";
		String pawn = "h7"; // false
		
		List <Character> chars = new ArrayList<Character>();
		List <Character> nums = new ArrayList<Character>();
		
		for (int i = 0; i < pawn.length(); i++) {
			if (Character.isAlphabetic(bishop.charAt(i)) && Character.isAlphabetic(pawn.charAt(i))) {
				chars.add(bishop.charAt(i));
				chars.add(pawn.charAt(i));
			} else if (Character.isDigit(bishop.charAt(i)) && Character.isDigit(pawn.charAt(i))) {
				nums.add(bishop.charAt(i));
				nums.add(pawn.charAt(i));
			}
		}
		int charsAbsDiff = Math.abs(chars.get(0) - chars.get(1));
		int numAbsDiff = Math.abs(nums.get(0) - nums.get(1));
		
		if (charsAbsDiff == 0 || numAbsDiff == 0 ||
				(charsAbsDiff % 2 != 0 && numAbsDiff % 2 == 0) || 
				(charsAbsDiff % 2 == 0 && numAbsDiff % 2 != 0)) {
			System.out.println("return false");
		}
		// return true;
	}

}
