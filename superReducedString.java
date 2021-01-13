import java.util.*;

public class superReducedString {
	/*
	 * Reduce a string of lowercase characters in range ascii[‘a’..’z’]by doing a
	 * series of operations. In each operation, select a pair of adjacent letters
	 * that match, and delete them.
	 * 
	 * Delete as many characters as possible using this method and return the
	 * resulting string. If the final string is empty, return Empty String
	 * 
	 */
	public static void main(String[] args) {
		String s = "aaabccddd";

		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {
			if (stack.isEmpty()) {

				stack.push(s.charAt(i));

			} else if (stack.peek() != s.charAt(i)) { // puting stack.peek() == s.charAt(i) here doesn't work
				// we need to add more into stack, then pop
				// not pop then push
				stack.push(s.charAt(i));

			} else {
				stack.pop();

			}

		}

		if (stack.isEmpty()) {
			System.out.println("Empty String");
		} else {
			String result = "";
			for (char i : stack) {
				result += i;
			}
			System.out.println(result);
		}

	}

}
