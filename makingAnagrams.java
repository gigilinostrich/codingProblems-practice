import java.util.*;

public class makingAnagrams {
	/*
	 * We consider two strings to be anagrams of each other if the first string's
	 * letters can be rearranged to form the second string. In other words, both
	 * strings must contain the same exact letters in the same exact frequency. For
	 * example, bacdc and dcbac are anagrams, but bacdc and dcbad are not.
	 * 
	 * Alice is taking a cryptography class and finding anagrams to be very useful.
	 * She decides on an encryption scheme involving two large strings where
	 * encryption is dependent on the minimum number of character deletions required
	 * to make the two strings anagrams. Can you help her find this number?
	 * 
	 * 
	 */
	public static void main(String[] args) {

		String s1 = "bugexikjevtubidpulaelsbcqlupwetzyzdvjphn";
		String s2 = "lajoipfecfinxjspxmevqxuqyalhrsxcvgsdxxkacspbchrbvvwnvsdtsrdk";
		// 40 deletions

		// 6 deletions
		// find common character, delete uncommon strings
		// delete bc from s1, delete mnop from s2

		// find number of occurances for two strings
		HashMap<Character, Integer> m1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> m2 = new HashMap<Character, Integer>();
		// find the interactions by using two hashSets
		HashSet<Character> h1 = new HashSet<Character>();
		HashSet<Character> h2 = new HashSet<Character>();
		// iterate two strings and count each char and store into 2 hashMaps
		for (int i = 0; i < s1.length(); i++) {
			if (m1.containsKey(s1.charAt(i))) {
				m1.put(s1.charAt(i), m1.get(s1.charAt(i)) + 1);
			} else {
				m1.put(s1.charAt(i), 1);
			}
			h1.add(s1.charAt(i));
		}
		for (int i = 0; i < s2.length(); i++) {
			if (m2.containsKey(s2.charAt(i))) {
				m2.put(s2.charAt(i), m2.get(s2.charAt(i)) + 1);
			} else {
				m2.put(s2.charAt(i), 1);
			}
			h2.add(s2.charAt(i));
		}
		// do intersection
		h1.retainAll(h2);
		// h1 now consists of intersections
		// shared and unshared characters from s1 arraylists
		List<Integer> shared1 = new ArrayList<Integer>();
		List<Integer> unShared1 = new ArrayList<Integer>();

		for (Map.Entry<Character, Integer> e1 : m1.entrySet()) {
			if (h1.contains(e1.getKey())) { // get shared counts from s1
				shared1.add(e1.getValue());
			} else { // get unshared counts from s1
				unShared1.add(e1.getValue());
			}
		}
		// shared and unshared characters from s2 arraylists
		List<Integer> shared2 = new ArrayList<Integer>();
		List<Integer> unShared2 = new ArrayList<Integer>();

		for (Map.Entry<Character, Integer> e2 : m2.entrySet()) {
			if (h1.contains(e2.getKey())) { // get shared counts from s2
				shared2.add(e2.getValue());
			} else { // get unshared counts from s2
				unShared2.add(e2.getValue());
			}
		}

		int deletionTotal = 0;
		for (int i = 0; i < shared1.size(); i++) { // intersections only need one loop
			// get the difference between two differnt counts so every count will equal to 1 (same length)
			deletionTotal += Math.abs(shared1.get(i) - shared2.get(i)); 
		}
		for (int i = 0; i < unShared1.size(); i++) { // add all unshared counts to total
			deletionTotal += (unShared1.get(i));
		}
		for (int i = 0; i < unShared2.size(); i++) { // add all unshared counts to total
			deletionTotal += (unShared2.get(i));
		}
		System.out.println(deletionTotal);
	}

}
