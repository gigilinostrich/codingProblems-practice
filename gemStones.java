import java.util.*;

public class gemStones {

	public static void main(String[] args) {
		int gemStonesFound = 0;
		String[] arr = { "abcdde", "baccd", "eeabg" }; // 2, because all contains bc

		for (char c = 'a'; c <= 'z'; c++) {
			int count = 0; // reset count for each iteration (3)
			for (int j = 0; j < arr.length; j++) {
				// all string elements contain same letter
				if (arr[j].contains(Character.toString(c))) {
					System.out.println(arr[j] + " " + c);

					count++;
				} else { // does not count the alphabet that are not in the string element

					break;
				}
			}
			/*
			 * abcdde a baccd a eeabg a count 3 abcdde b baccd b eeabg b count 3
			 * 
			 */
			System.out.println("count " + count);
			// when all elements have a common letter, increase total count
			if (count == arr.length) {
				gemStonesFound++;
			}
		}
		System.out.println(gemStonesFound);
	}

}
