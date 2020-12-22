import java.util.*;

public class Solution {
	// Write your code here.
	/*
	 * To solve this challenge, we must first take each character in s, enqueue it
	 * in a queue, and also push that same character onto a stack. once that's done,
	 * we must dequeue the first character from the queue and pop the top character
	 * off the stack, then compare the two characters match, we continue dequeueing,
	 * popping, and comparing each character until our containers are empty ( a
	 * non-match means s isn't a palindrome
	 */
	Stack<Character> s = new Stack<Character>(); // for stack
	Queue<Character> q = new LinkedList<Character>(); // for queue

	public void pushCharacter(char ch) {
		s.push(ch);
	}

	public void enqueueCharacter(char ch) {
		q.add(ch);
	}

	public char popCharacter() {
		return s.pop();
	}

	public char dequeueCharacter() {
		return q.poll();
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();

		// Convert input String to an array of characters:
		char[] s = input.toCharArray();

		// Create a Solution object:
		Solution p = new Solution();

		// Enqueue/Push all chars to their respective data structures:
		for (char c : s) {
			p.pushCharacter(c);
			p.enqueueCharacter(c);
		}

		// Pop/Dequeue the chars at the head of both data structures and compare them:
		boolean isPalindrome = true;
		for (int i = 0; i < s.length / 2; i++) {
			if (p.popCharacter() != p.dequeueCharacter()) {
				isPalindrome = false;
				break;
			}
		}

		// Finally, print whether string s is palindrome or not.
		System.out.println("The word, " + input + ", is " + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));

	}

}
