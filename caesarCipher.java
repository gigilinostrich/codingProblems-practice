import java.util.*;
public class caesarCipher {

	public static void main(String[] args) {
		
		List <Character> cL = new ArrayList<Character>();
	
		HashMap<Character,Character> m = new HashMap<Character,Character>();

		// store all English Alphabets into the list
		for (char c = 'a'; c <= 'z'; c++) {
			cL.add(c);
		}
	
		// hash map contains normal order as key , value are shifted letters
		for (int i = 0; i < cL.size(); i++) {
			int shiftedIndex = (i + 4 ) % cL.size();
			m.put(cL.get(i),cL.get(shiftedIndex));
		}
	
		String s = "Hello_World!"; // Lipps_Asvph!
		
		String result = ""; // outcome
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			// special characters case
			if (!Character.isAlphabetic(c) && !Character.isDigit(c)) {
				result+= c;
			}
			else if (Character.isDigit(c)) { // numbers case
				result += c;
			}
			else if (Character.isUpperCase(c)) { // upper case
				result += Character.toUpperCase(m.get(Character.toLowerCase(c)));
			}
			else { // lower case
				result += m.get(c);
			}
			
		}
		System.out.println(result);
	}

}
