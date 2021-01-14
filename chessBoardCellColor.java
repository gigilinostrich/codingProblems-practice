import java.util.*;

public class chessBoardCellColor {

	public static void main(String[] args) {
		String cell1 = "A1";
		String cell2 = "B2";
		List<Character> characters = new ArrayList<Character>();
		List<Character> num = new ArrayList<Character>();
		for (int i = 0; i < cell1.length(); i++) {
			if (Character.isAlphabetic(cell1.charAt(i)) && Character.isAlphabetic(cell2.charAt(i))) {
				characters.add(cell1.charAt(i));
				characters.add(cell2.charAt(i));
			} else if (Character.isDigit(cell1.charAt(i)) && Character.isDigit(cell2.charAt(i))) {
				num.add(cell1.charAt(i));
				num.add(cell2.charAt(i));
			}
		}

		int charDiff = Math.abs(characters.get(0) - characters.get(1));

		int numDiff = Math.abs(num.get(0) - num.get(1));

		if ((charDiff % 2 == 0) && (numDiff % 2 == 0) || (charDiff % 2 != 0) && (numDiff % 2 != 0)) {
			System.out.println("return true");
		} else if ((charDiff % 2 != 0 && numDiff % 2 == 0) || (charDiff % 2 == 0 && numDiff % 2 != 0)) {
			System.out.println("return false");
		}

	}

}
