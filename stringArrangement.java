import java.util.*;
public class stringArrangement {

	public static void main(String[] args) {
		/*
		 * Given an array of equal-length strings, you'd like to know if it's possible
		 * to rearrange the order of the elements in such a way that each consecutive
		 * pair of strings differ by exactly one character. Return true if it's
		 * possible, and false if not.
		 * 
		 * 
		 * 
		 * For inputArray = ["aba", "bbb", "bab"], the output should be
		 * stringsRearrangement(inputArray) = false.
		 * 
		 * There are 6 possible arrangements for these strings: ["aba", "bbb", "bab"]
		 * ["aba", "bab", "bbb"] ["bbb", "aba", "bab"] ["bbb", "bab", "aba"] ["bab",
		 * "bbb", "aba"] ["bab", "aba", "bbb"]
		 * 
		 * None of these satisfy the condition of consecutive strings differing by 1
		 * character, so the answer is false.
		 * 
		 * For inputArray = ["ab", "bb", "aa"], the output should be
		 * stringsRearrangement(inputArray) = true.
		 * 
		 * It's possible to arrange these strings in a way that each consecutive pair of
		 * strings differ by 1 character (eg: "aa", "ab", "bb" or "bb", "ab", "aa"), so
		 * return true.
		 * 
		 * Logic
		 * 
		 * Queue -> to store all strings
		 * 
		 * LinkedList
		 * 1. initialize LL with first string from queue
		 * 2. Go through Queue until it finds a word with difference from 1
		 * 	  letter with either getFirst or getList
		 * 		i. if with getFirst, add it to front of the list
		 * 		ii. if with getLast, add it to back of list
		 * 3. if no match, return false
		 */
		String [] inputArray = {"ab", "bb", "aa"};
		LinkedList<String>tries = loadStrings(inputArray);
		LinkedList <String>matches = new LinkedList<String>();
		matches.offer(tries.poll()); // remove the head from tries, store into matches
		int len = matches.getFirst().length(); // get length of matches' head length
		while (!tries.isEmpty()) { // get out of loop if no letters left to try
			int numOfTries = tries.size(); // try the whole thing
			String first = matches.getFirst();
			String last = matches.getLast();
			// try for each word in try
			for (int t = 0; t < numOfTries; t++) {
				String actual = tries.poll(); // difference string each time
				if (exactOneDiff(first, actual, len)) {
					matches.offerFirst(actual);
					break; // start again from the beginning
				}
				else if (exactOneDiff(last, actual, len)) {
					matches.offerLast(actual);
					break; // start again from the beginning
				}
				else {
					tries.offer(actual); // try the word later 
				}
				
			}
			// doesn't change  
			if (numOfTries == tries.size()) {
				System.out.println("return false");
			}		
		}
		System.out.println("return true ");// return true if it was successful
	}
	public static boolean exactOneDiff (String target, String actual, int len) {
		int diff = 0;
		for (int ch = 0; ch < len; ch++) {
			if (target.charAt(ch) != actual.charAt(ch)) {
				diff++;
			}
		}
		return diff == 1;
	}
	
public static LinkedList <String> loadStrings (String [] sA){
	LinkedList <String> store = new LinkedList <String>();
	for (int i = 0; i < sA.length; i++) {
		store.add(sA[i]);
	}
	return store;
}
}
