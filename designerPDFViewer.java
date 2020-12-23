import java.util.*;

public class designerPDFViewer {

	public static void main(String[] args) {
		// String word = "abc"; // words contains no more than 10 letters
		int[] h = { 1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 };
		String word = "abc";
		// output: 9
		// a=1, b=3, c=1
		// 3 * 1mm * 3mm = 9
		// (total letters in string) * (1mm) * (largest element)
		
		// approach: assign each h elements for each English Alphabet
		List<Character> charStoreList = new ArrayList<Character>();
		for (char c = 'a'; c <= 'z'; c++) { // iterate all English Alphabet
			charStoreList.add(c); // store all English alphabet into a list
		}
		// hash map to store English letters as key and elements from h array as value
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < charStoreList.size(); i++) {
			map.put(charStoreList.get(i), h[i]);
		}

		int tallestLetter = 0;
		for (int i = 0; i < word.length(); i++) {
			if (tallestLetter < map.get(word.charAt(i))) { // find the max element in hashMap
				tallestLetter = map.get(word.charAt(i));
			}
		}
		int result = word.length() * 1 * tallestLetter;
		System.out.println(result);

	}

}
