import java.util.*;
public class marsExploration {

	public static void main(String[] args) {

		/*
		 * Letters in some of the SOS messages are altered by cosmic radiation during
		 * transmission. Given the signal received by Earth as a string, s , determine how
		 * many letters of the SOS message have been changed by radiation.
		 * 
		 *  
		 */
		
		String s =  "SOSSPSSQSSOR"; // there are only S and O in expected message before it changed
		String orig = "SOS" ;
		// make copies of original message s.length times 
		String compareStr = String.join("", Collections.nCopies(s.length(), orig));
		int differenceCount = 0;
		for (int i = 0; i < s.length(); i++) {
			// increment count when difference is found
			if (s.charAt(i) != compareStr.charAt(i)) {
				differenceCount++;
			}
		}
		System.out.println(differenceCount);
	}

}
